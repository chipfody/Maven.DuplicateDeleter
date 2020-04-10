package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public int countOccurences( String objectToCount) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int k = 0;
        String[]result = new String[array.length];
        for(int i = 0; i < array.length; i++){
            if(countOccurences(array[i])<maxNumberOfDuplications){
                result[k] = (array[i]);
                k++;
            }


        }
        int dupeCount=0;
        for(int i = 0;i < result.length; i++){
            if(result[i] == null){
                dupeCount++;
            }

        }
        String[] newArray = new String[result.length - dupeCount];
        int m = 0;
        for(int i = 0; i < result.length; i++){
            if(result[i] != null){
                newArray[m]=(result[i]);
                m++;
            }
        }
        return  newArray;
    }


    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int k = 0;
        String[]result = new String[array.length];
        for(int i = 0;i < array.length; i++){
            if(countOccurences(array[i]) != (exactNumberOfDuplications)){
                result[k] = array[i];
                k++;
            }
        }
        int dupeCount = 0;
        for(int i = 0; i < result.length; i++){
            if(result[i] == null){
                dupeCount ++;
            }

        }
        String[] cleanArray = new String[result.length - dupeCount ];
        int m = 0;
        for(int i = 0;i < result.length; i++){
            if(result[i] != null){
                cleanArray[m] = result[i];
                m++;
            }
        }
        return  cleanArray;
    }
}
