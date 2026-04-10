class DownloadManager implements Runnable {
    public void run() {
        System.out.println("Downloading...");
    }
    public static void main(String[] args) {
        new Thread(new DownloadManager()).start();
        new Thread(new DownloadManager()).start();
    }
}
