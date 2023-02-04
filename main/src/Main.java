import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, sum=0,temp=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        temp=n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}
