package com.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class program4 {
    public static void main(String[] args) {
   	 int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
   	 getCount(arr);

	}
    static void getCount(int arr [])
	{
	 Map<Integer, Integer> countMap = new LinkedHashMap<>();

     for (int i = 1; i <= 9; i++) {
         countMap.put(i, 0); 
     }

    
     for (int num : arr) {
         for (int i = 1; i <= 9; i++) {
             if (num % i == 0) {
                 countMap.put(i, countMap.get(i) + 1);
             }
         }
     
	}
     System.out.print("{");
     int i = 0;
     for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
         System.out.print(entry.getKey() + ": " + entry.getValue());
         if (i < countMap.size() - 1) {
             System.out.print(", ");
         }
         i++;
     }
     System.out.println("}");
	}


}
