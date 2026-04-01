import java.util.Scanner;

// Unnati Waghe

class Resort {
    int Rno, Days;
    String Name;
    double Charges;

    double Compute() {
        double amt = Days * Charges;
        if (amt > 11000) amt = amt * 1.02;
        return amt;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        Rno = sc.nextInt();
        Name = sc.next();
        Charges = sc.nextDouble();
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println(Rno + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
    }
