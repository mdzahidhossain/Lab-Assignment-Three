package BasicJava;

import java.util.Random;

public class QuestionNo1 {
    public static void main(String[] args) {
        Random g = new Random();

        int [] values = new int [10];

        for (int i=0;i<10;i++){
            int randomNumber = g.nextInt(10);
            values[i]=randomNumber;
        }

        System.out.print("All elements : ");
        for (int i=0;i<10;i++){
            System.out.print(values[i]+" ");
        }
        System.out.println();

        System.out.print("Every element at an even index : ");
        for (int i=0;i<10;i++){
            if(i%2==0){
                System.out.print(values[i]+" ");
            }
        }
        System.out.println();

        System.out.print("Every even element : ");
        for (int i=0;i<10;i++){
            if (values[i]%2==0){
                System.out.print(values[i]+" ");
            }
        }
        System.out.println();

        System.out.println("All elements in reverse order : ");
        for (int i=9;i>=0;i--){
            System.out.print(values[i]+" ");
        }
        System.out.println();


        System.out.println("Only the first and last element : "+values[0]+" "+values[values.length-1]);

        System.out.println();
    }
}
