package ds.hashTables;

public class HashTable {

    String [] hashArray;
    int arraySize;
    int noOfElements = 0; // counter for no of elements in the hash table

    public HashTable(int noOfslots){

        if(isPrime(noOfslots)){
            hashArray = new String[noOfslots];
            arraySize = noOfslots;
        }else{
            int nextPrime = getNextPrime(noOfslots);
            hashArray = new String[nextPrime];
            arraySize = nextPrime;

            System.out.println(" Hash table size given " + noOfslots + " is not prime");
            System.out.println("Hash table size made prime --> " + nextPrime);
        }


    }

    private boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private int getNextPrime(int num){
        for(int i = num; true; i++){
            if(isPrime(i)){
                return i;
            }
        }
    }

    //returns preferred index position
    private int hashFunc1(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal < 0){
            hashVal += arraySize;
        }
        return hashVal;// ideal index position we would like to insert or search in
    }

    //return step size greater than 0
    private int hashFunc2( String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal < 0){
            hashVal += arraySize;
        }

        return 3 - hashVal % 3; // 3 here is a prime no less than array size
        // we can put in checks to ensure so that the no can be anything other than 3
        // but less than the array size
    }

    public void insert(String word){
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null){
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }

        hashArray[hashVal] = word;
        System.out.println("inserted word is : " + word);
        noOfElements++;
    }

    public String find(String word){
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null){
            if(hashArray[hashVal].equals(word)){
                return hashArray[hashVal];
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return hashArray[hashVal];
    }

    public void displayTable(){
        System.out.println("Table : ");
        for(int i = 0; i < arraySize; i++){
            if(hashArray[i] != null){
                System.out.println(hashArray[i] + " ");
            }else{
                System.out.println("** ");
            }
            System.out.println("");
        }
    }

}
