package While;

import java.util.Scanner;

public class min_divisor{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int i = 2;

        while (i <= a){
            if (a % i == 0){
                System.out.println(i);
                break;
            }

            i++;
        }


    }
}
