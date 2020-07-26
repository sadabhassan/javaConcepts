package multithreading;

public class ExampleUsingThread {
    public static void main(String... args) {
        Printer printer = new Printer();
        Thread1 thread1 = new Thread1(printer, "sadab", 10);
        thread1.start();
        Thread1 thread2 =  new Thread1(printer, "shabreen", 10);
        thread2.start();
        Thread1 thread3 =  new Thread1(printer,  "Younus", 10);
        thread3.start();
        Thread1 thread4 =  new Thread1(printer, "prince", 10);
        thread4.start();
        Thread1 thread5=  new Thread1(printer, "Mukhtar", 10);
        thread5.start();

    }
}

class Printer {
    public void print(String documentName, int numberOfCopies) {
        for(int i=0;i<numberOfCopies;i++) {
            System.out.println("copy " + i + " of " + documentName + " is printed" );
        }
    }
}

class Thread1 extends Thread {
    Printer printer;
    String documentName;
    int numberOfCopies;
    Thread1(Printer printer, String documentName, int numberOfCopies) {
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
