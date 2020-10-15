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
        double value1 = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        double value2 = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        double value3 = input3.nextDouble();
        Scanner input4 = new Scanner(System.in);
        double value4 = input4.nextDouble();
        Scanner input5 = new Scanner(System.in);
        double value5 = input5.nextDouble();
        Scanner input6 = new Scanner(System.in);
        double value6 = input6.nextDouble();
        Scanner input7 = new Scanner(System.in);
        double value7 = input7.nextDouble();
        Scanner input8 = new Scanner(System.in);
        double value8 = input8.nextDouble();
        Scanner input9 = new Scanner(System.in);
        double value9 = input9.nextDouble();
        Scanner input10 = new Scanner(System.in);
        double value10 = input10.nextDouble();

        double arr3[] = new double[10];

        arr3[0] = value1;
        arr3[1] = value2;
        arr3[2] = value3;
        arr3[3] = value4;
        arr3[4] = value5;
        arr3[5] = value6;
        arr3[6] = value7;
        arr3[7] = value8;
        arr3[8] = value9;
        arr3[9] = value10;

        System.out.println(average(arr3));

        /* No.4 */
        System.out.println(min());

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
        while(true){
            int num = (int)(Math.random() * 54) + 1;
            int a = 0;
            for(int i = 0; i < arr.length; i++){
                if (num == arr[i]){
                    a++;
                }
            }
            if(a == 0) return num;
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
    public static double min(){
        
        System.out.print("Please enter 10 numbers : ");
        Scanner input1 = new Scanner(System.in);
        double value1 = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        double value2 = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        double value3 = input3.nextDouble();
        Scanner input4 = new Scanner(System.in);
        double value4 = input4.nextDouble();
        Scanner input5 = new Scanner(System.in);
        double value5 = input5.nextDouble();
        Scanner input6 = new Scanner(System.in);
        double value6 = input6.nextDouble();
        Scanner input7 = new Scanner(System.in);
        double value7 = input7.nextDouble();
        Scanner input8 = new Scanner(System.in);
        double value8 = input8.nextDouble();
        Scanner input9 = new Scanner(System.in);
        double value9 = input9.nextDouble();
        Scanner input10 = new Scanner(System.in);
        double value10 = input10.nextDouble();

        double arr[] = new double[10];

        arr[0] = value1;
        arr[1] = value2;
        arr[2] = value3;
        arr[3] = value4;
        arr[4] = value5;
        arr[5] = value6;
        arr[6] = value7;
        arr[7] = value8;
        arr[8] = value9;
        arr[9] = value10;

        double small = arr[0];
        for(int i = 1; i < arr.length -1; i++){
            if(small >= arr[i]){
                small = arr[i];
            }
        }
        return small;
        
    }


}
