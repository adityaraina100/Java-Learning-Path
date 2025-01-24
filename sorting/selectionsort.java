import java.util.*;
public class selectionsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<numbers.length;i++){
            numbers[i] = sc.nextInt(); 
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                if(numbers[j]<numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        }

    }
