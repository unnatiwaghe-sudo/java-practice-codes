class OnlineShoppingSystem {
    public static void main(String[] args) {
        Thread t1=new Thread(() -> System.out.println("Processing payment..."));
        Thread t2=new Thread(() -> System.out.println("Order confirmed..."));
        t1.start();
        t2.start();
    }
}
