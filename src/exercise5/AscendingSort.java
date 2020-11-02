package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
      
         for (int index = 0; index < numbers.length; index++){
         for (int a = index+1; a < numbers.length;a++){ 
         if (numbers[a]<numbers[index]){

            int temp = numbers[a];
            numbers[a] = numbers[index];
            numbers[index] = temp; 
            }
          } 
        }  
          

        // Sort numbers in ascending order

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
