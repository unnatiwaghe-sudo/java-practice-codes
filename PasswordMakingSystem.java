import java.util.*;
class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        String m = p.substring(0,p.length()-2).replaceAll(".", "*") + p.substring(p.length()-2);
        System.out.println(m);
    }
}
