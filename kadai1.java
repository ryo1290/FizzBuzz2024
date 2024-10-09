import java.util.Scanner;
public class kadai1{
    public static void main(String[] args){
        int kazu;
        Scanner sc = new Scanner(System.in);

        System.out.print("数字を入力してください>> ");
        kazu = sc.nextInt();
        for (int i = 1; i <= kazu; i++){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if ( i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}