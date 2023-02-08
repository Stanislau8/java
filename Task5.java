import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        int x = num%2;
        if (num%2==0) System.out.print("Result="+0+"");
        else System.out.printf("Result = %d", x);
    }
}

