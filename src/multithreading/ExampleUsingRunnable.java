package multithreading;

public class ExampleUsingRunnable {
    public static void main(String[] args) {
        Printer2 printer2 = new Printer2();
        Thread thread1 = new Thread(new Thread2(printer2, "sadab", 10));
        thread1.start();
        Thread thread2 = new Thread(new Thread2(printer2, "shabreen", 10));
        thread2.start();
        Thread thread3 = new Thread(new Thread2(printer2, "younus", 10));
        thread3.start();
    }
}

class Printer2 {
    public void print(String documentName, int numberOfCopies) {
        for(int i=0;i<numberOfCopies;i++) {
            System.out.println("copy " + i + " of " + documentName + " is printed" );
        }
    }
}

class Thread2 implements Runnable {
    Printer2 printer;
    String documentName;
    int numberOfCopies;
    Thread2(Printer2 printer, String documentName, int numberOfCopies) {
        super();
        this.printer = printer;
        this.documentName = documentName;
        this.numberOfCopies = numberOfCopies;
    }
    @Override
    public void run(){
        synchronized (printer) {
            printer.print(documentName, numberOfCopies);
        }
    }
}
