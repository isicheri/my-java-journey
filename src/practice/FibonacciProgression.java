package practice;

public class FibonacciProgression extends Progression{
    long prev;

    public FibonacciProgression() {
        this(0,1);
    }

    public FibonacciProgression(long val, long val1) {
        first = val;
        prev = val1 - val;
    }

    @Override
    protected long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }


    public static void main(String[] args) {
        FibonacciProgression fb = new FibonacciProgression(2,5);
//        fb.printProgression(10);
//       long b =  fb.nextValue();
//        System.out.println(b);
    }

}
