class ChatApplication {
    public static void main(String[] args) {
        Thread t1=new Thread(() -> System.out.println("Sending message..."));
        Thread t2=new Thread(() -> System.out.println("Receiving message..."));
        t1.start();
        t2.start();
    }
}
