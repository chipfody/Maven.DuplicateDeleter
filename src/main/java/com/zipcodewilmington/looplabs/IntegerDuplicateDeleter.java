package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public int countOccurences( int objectToCount) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == objectToCount) {
                count++;
            }
        }
        return count;
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int j = 0;
        Integer[] Result = new Integer[array.length];
        for(int i = 0; i < array.length; i++){
            if(countOccurences(array[i]) < maxNumberOfDuplications){
                Result[j] = array[i];
                j++;
            }
        }
        int dupeCount = 0;
        for(int i = 0; i < Result.length;i++){

            if(Result[i] == null){
                dupeCount++;
            }

        }
        Integer[] newArray = new Integer[Result.length-dupeCount];
        int m = 0;
        for(int i = 0; i < Result.length; i++){
            if(Result[i] != null){
                newArray[m] = Result[i];
                m++;
            }
        }
        return  newArray;
    }


    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int k = 0;
        Integer[] arr = new Integer[array.length];
        for(int i= 0;i < array.length;i++){
            if(countOccurences(array[i])!=exactNumberOfDuplications){
                arr[k] = array[i];
                k++;
            }

        }
        int dupeCount=0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == null){
                dupeCount++;
            }

        }
        Integer[] cleanArray = new Integer[arr.length - dupeCount];
        int m = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=null){
                cleanArray[m] = arr[i];
                m++;
            }
        }
        return  cleanArray;
    }

}
