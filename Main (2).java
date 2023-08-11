/******************************************************************************

Liudmila Chizhikova (c)
This is the example of reading the user input from keyboard and sort the 
resulting array
*******************************************************************************/

import java.io.*;
import java.util.*;
import java.util.Arrays;                                        //library for sorting the array

public class Main
{

	public static void main(String[] args) {
            int temp = 0;
            int tempn = 0;

//making scanners for the input data

java.util.Scanner num_array = new java.util.Scanner(System.in);  // the scanner for the number of array elements input
java.util.Scanner numbers   = new java.util.Scanner(System.in);  // the scanner for the each array elements

System.out.println("====This program sorts your array data==="+"\n");
System.out.println("How long will the array be? Type the length number" +"\n");
System.out.println("Какой длины будет массив? Введите число"+ "\n");

int v = 0;                                                       // number of array elements
v = num_array.nextInt();
int [] myarray = new int[v];

System.out.println("Your array will be " + v + " elements long");
System.out.println("Ваш массив будет длиной" + v + "элементов");

System.out.println("Type here array elements "+"\n");
System.out.println("Введите элементы массива "+"\n");
for(int n=0; n<v; n++)  
{  
//reading array elements from the user   
myarray[n]=numbers.nextInt();  
}  
System.out.println("Your array elements are: ");
System.out.println("Введенные элементы массива: ");  
// accessing array elements using the for loop  
for (int n=0; n<v; n++)   
{  
System.out.println(myarray[n]);  
}  

//sort the array from the biggest value to the smallest

for (int i = 0; i < myarray.length; i++) {     
            for (int j = i+1; j < myarray.length; j++) {     
               if(myarray[i] < myarray[j]) {    
                   temp = myarray[i];    
                   myarray[i] = myarray[j];    
                   myarray[j] = temp;    
               }     
            }     
        }    

  System.out.println("Elements of array sorted in descending order: "+ "\n");    
  System.out.println("Элементы массива, отсортированные по убыванию: "+ "\n");
        for (int i = 0; i < myarray.length; i++) {     
            System.out.print(myarray[i] + " "+ "\n");   
            } 
System.out.println("Array elements in ascending order: "+ "\n");
System.out.println("Элементы массива, отсортированные по возрастанию" + "\n");
Arrays.sort(myarray);
 for (int num : myarray) {
            System.out.print(num + " " + "\n");
                         }

    }
}