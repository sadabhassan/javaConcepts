package casting;

public class PrimitveCasting {
    public static void main(String[] args) {
        int a = 20;
        long b = a; // widening -- implicit casting
        int c = (int)b; // narrowing -- explicit casting
        double f = 20.0f;
        long l = 30;

        String d = "20";
        // String interpolation example
        System.out.format("values are %d, %d, %d, %s, %f, %d", a, b, c, d, f, l);
    }
}
