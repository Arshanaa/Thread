public class ThreadTest {
    public static void main(String[] args) {
        Runnable printX = new PrintChar('x', 10);
        Runnable printY = new PrintChar('y', 10);
        Runnable print10 = new PrintNum(10);

        Thread thread1 = new Thread(printX);
        Thread thread2 = new Thread(printY);
        Thread thread3 = new Thread(print10);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
