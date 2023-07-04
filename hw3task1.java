import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class hw3task1 {
    
    public static void main(String[] arg){
       
         List<Integer> numb= toFillArray(15,50);
        //  deletEvenNum (numb);
        // minValue(numb);
        // maxValue(numb);
        // average (numb);
    }
     
   
    public static List<Integer> toFillArray(int size, int maxValue){
        List<Integer> nums = new ArrayList<>(size);
        Random rnd = new Random();
        
        for (int i = 0; i < 15; i++) nums.add(rnd.nextInt(maxValue));
         System.out.print(nums);
         System.out.println(); 
        return nums;
    }
    //  1) Нужно удалить из него чётные числа
     public static void deletEvenNum (List<Integer> list1) {
        list1.removeIf(x->(x%2==0));
            System.out.print(list1 );
            System.out.println(); 
            
         }

        //  2) Найти минимальное значение
        public static void minValue (List<Integer> list1){
            System.out.println("Minimum value is " + Collections.min(list1));
        }

        // 3) Найти максимальное значение
        public static void maxValue (List<Integer> list1){
            System.out.println("Maximum value is " + Collections.max(list1));
        }

        // 4) Найти среднее значение

        public static void average (List<Integer> list1){
            int[] list2=list1.stream().mapToInt(i -> i).toArray();
            var aver = IntStream.of(list2).average();
            System.out.print("Average is ");
            System.out.printf( "%.2f", aver.getAsDouble());
        }

      
}

     
            
 