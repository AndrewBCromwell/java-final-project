package src.demos;
import java.util.Arrays;

// class Book{

// }

public class ArrayDemo {
    public static void main(String[] args){
        String[] months = new String[4]; // Must specify number of elements when create, can't change later.
        months[0] = "Jan"; // no method to just add
        months[1] = "Feb";
        months[2] = "Mar";
        months[3] = "Apr";
        Arrays.sort(months, 0, 4);
        for(String month: months){ // for each loop
             System.out.println(month); 
        }
        for(int i = 0; i < months.length; i++){ // don't use () when using length for array.
            System.out.println(months[i]);
        }

        String[] months2 = months; // this dose not copy the array. months2 refrences the same array as months.

        int location = Arrays.binarySearch(months, "Feb");
        System.out.println("\n" + location + "\n");

        // Book[] bookshelf = new Book[10];
        // bookshelf[0] = new Book();

        int[] nums = {3, 5, -3, 16, 8};
        int max = nums[0];
        int min = nums[0];
        Arrays.sort(nums);
        for(int num: nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
            System.out.println(num);
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
