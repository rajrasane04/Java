class PrintTextThread extends Thread {
    String text;
    int n;

    PrintTextThread(String text, int n) {
        this.text = text;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(text + " (" + i + ")");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadNTimes {
    public static void main(String[] args) {
        PrintTextThread t1 = new PrintTextThread("COVID19", 10);
        PrintTextThread t2 = new PrintTextThread("LOCKDOWN2020", 20);
        PrintTextThread t3 = new PrintTextThread("VACCINATED2021", 30);

        t1.start();
        t2.start();
        t3.start();
    }
}
