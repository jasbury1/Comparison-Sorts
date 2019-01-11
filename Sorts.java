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
      return 4;
   }

   //Returns number of comparisons
   public static long selectSort(int[] data){
      //min refers to an index of the smalles data member found
      int min;
      for(int i = 0; i < data.length - 1; i++){
         min = i;
         for(int j = i + 1; j < data.length; j++){
            //index through the remainder of the array in search of new smaller min value
            if(data[j] < data[min]){
               //update min with new smallest value
               min = j;
            }
         }
         int temp = data[i];
         data[i] = data[min];
         data[min] = temp;
      }
      System.out.println("RESULT: " + Arrays.toString(data));
      return 4;
   }

   //Returns number of comparisons
   public static long mergeSort(int[] data){
      return 4;
   }


}
