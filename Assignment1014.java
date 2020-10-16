package week2.day2;
import java.lang.Math;
import java.util.Scanner;

public class Assignment1014 {
    public static void main(String[] args) {

        /* No.1 */
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 19, 24, 26, 27, 29};
        
        System.out.println(binarySearch(arr1, 19, 0, 16));
        System.out.println(binarySearch(arr1, 8, 0, 16));
        System.out.println(binarySearch(arr1, 3, 0, 16));
        System.out.println(binarySearch(arr1, 29, 0, 16));
        System.out.println(binarySearch(arr1, 1, 0, 16));

        /* No.2 */
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10, 12, 15, 16, 19, 24, 26, 27, 29,30,31,32,33,34,40,41,42,46,50,51,52};
        System.out.println(getRandom(arr2));

        /* No.3 */
        System.out.print("Please enter 10 numbers : ");
        Scanner input1 = new Scanner(System.in);
        double[] numbers = new double[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input1.nextDouble();
        }

        System.out.println(average(numbers));

        /* No.4 */
        System.out.print("Please enter 10 numbers : ");
        Scanner input2 = new Scanner(System.in);
        double[] numbers2 = new double[10];

        for(int i = 0; i < numbers2.length; i++){
            numbers2[i] = input2.nextDouble();
        }
        System.out.println(min(numbers2));

    }

    /* No.1 binaty search*/
    public static int binarySearch(int[] arr, int target, int st, int end){
        int mid = (int)Math.floor((st + end) / 2);
        if (target == arr[end]){
            return end;
        } else if(target > arr[mid]){
            st = mid;
        }else if(target < arr[mid]){
            end = mid;
        }else{
            return mid;
        }
        return binarySearch(arr, target, st, end);
    }

    /* No.2 Random number chooser */
    public static int getRandom(int[] arr){
        randomLoop: while(true){
            
            int num = (int)(Math.random() * 54) + 1;
            // int a = 0;
            for(int i = 0; i < arr.length; i++){
                if (num == arr[i]){
                    continue randomLoop;
                }
            }
            return num;
        }
    }

    /* No.3 Average an array */
    public static int average(int[] array){ // it's never used....??
        int average = 0;
        for (int i = 0; i < array.length; i++){
            average += array[i];
        }
        return average = average / array.length;
    }
    public static double average(double[] array){
        double average = 0.0;
        for (int i = 0; i < array.length; i++){
            average += array[i];
        }
        return average = average / array.length;
    }

    /* No.4 Find the smallest element */
    public static double min(double[] numbers2) {

        double small = numbers2[0];
        for (int i = 1; i < numbers2.length - 1; i++) {
            if (small >= numbers2[i]) {
                small = numbers2[i];
            }
        }
        return small;
        
    }


}
