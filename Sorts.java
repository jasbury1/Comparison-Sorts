/*
 * Count and Return the number of comparisons made for each comparison sort algorithm
 */

import java.lang.*;
import java.util.*;

class Sorts{
   public Sorts(){
   }

   //Returns number of comparisons
   public static long insertSort(int[] data){
      long comparisons = 0;

      for(int i = 1; i < data.length; i++){
         //j represents an index to check to find insertion location
         int j = i;
         while(j > 0 && data[j - 1] > data[j]){
            ++comparisons;
            int temp = data[j];
            data[j] = data[j - 1];
            data[j - 1] = temp;
            --j;
         }
      }
      return comparisons;
   }

   //Returns number of comparisons
   public static long selectSort(int[] data){
      //min refers to an index of the smalles data member found
      int min;
      long comparisons = 0;

      for(int i = 0; i < data.length - 1; i++){
         min = i;

         for(int j = i + 1; j < data.length; j++){
            //index through the remainder of the array in search of new smaller min value
            ++comparisons;
            if(data[j] < data[min]){
               //update min with new smallest value
               min = j;
            }
         }

         int temp = data[i];
         data[i] = data[min];
         data[min] = temp;
      }
      return comparisons;
   }

   //Returns number of comparisons
   public static long mergeSort(int[] data){
      return 4;
   }

   //Merges two sorted arrays into one sorted array
   //return the merged array
   public static int[] merge(int[] arrA, int[] arrB){
      int[] result = new int[arrA.length + arrB.length];
      
      int i = 0;
      int j = 0;
      int k = 0;

      while(i < arrA.length && j < arrB.length){
         //test whether we add an element from arrayA or arrayB to the result
         if(arrA[i] <= arrB[j]){
            result[k] = arrA[i];
            ++i;
         }
         else{
            result[k] = arrB[j];
            ++j;
         }
         //move onto next index of the result
         ++k;
      }
      
      //if we are at the end of A, then copy the rest of B to result
      if(i == arrA.length){
         for(; j < arrB.length; j++){
            result[k] = arrB[j];
            ++k;
         }
      }
      //if we are at the end of B, then copy the rest of A to result
      else{
         for(; i < arrA.length; i++){
            result[k] = arrA[i];
            ++k;
         }
      }
      return result;
   }


}
