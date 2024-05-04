package mid;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop:");
        n = sc.nextInt();
        System.out.print("Enter the number of slots in the bean machine:");
        m = sc.nextInt();
        BeanMachine beanMachine = new BeanMachine(n,m);
        beanMachine.dropBalls();
        beanMachine.showBean();
        sc.close();
    }
}
