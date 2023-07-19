import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
        natural(input);
    }

    static void natural(int input) {
        if(input==1){
            System.out.print(1+" ");
        }
        else{
            natural(input-1);
            System.out.print(input+" ");
        }
    }
}
