import java.util.*;
class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double a = sc.nextDouble();
        try {
            if(a>b) throw new Exception("Insufficient Balance");
            System.out.println("Withdrawal successful. Remaining balance: " + (b-a));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
