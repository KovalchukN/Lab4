/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Arrays;



public class Lab4 {

    static int co = 0;
    static int ch = 0;
    
    
    public static void insertIntoSort(int[] arr) {
    int temp, j;
    for(int i = 0; i < arr.length - 1; i++){
        if (arr[i] > arr[i + 1]) {
           temp = arr[i + 1];
           arr[i + 1] = arr[i];      
           j = i;
           while (j > 0 && temp < arr[j - 1]) {
               arr[j] = arr[j - 1];               
               j--;
           }
           arr[j] = temp;             
        }        
    }
}

    public static void main(String[] args) {
       sort(new int[] { 9, 5, 8, 6, 1, 3, 7, 4, 2 });
        
    }
public static void sort(int[] array)
    {
        int i, j, newValue;
        for (i = 1; i < array.length; i++)
        {
            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue)
            {
                co++;
                array[j] = array[j - 1];
                j--;
            }
 
            ch++;
            array[j] = newValue;
            System.out.println(Arrays.toString(array));
        //System.out.println("Сравнений: " + co + " ; Замен: " + ch);
        }
 
    }}
