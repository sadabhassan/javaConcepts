package exception;

public class Example1 {
    public static void main(String[] args) {
        // Arithmetic exception
        int a = 10;
        int b = 0;

        try {
            int result = a/b;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        // null pointer exception
        String s = null;
        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

        // Number format exception
        String number ="abc";
        try{
            System.out.println(Integer.parseInt(number));
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }

        int[] arrayNumber = {1, 2, 3, 4};
        try{
            System.out.println(arrayNumber[4]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("throw is used to throw user defined exception and to give user defined message");
        }
    }
}
