package practice;

public class ArithProgression extends Progression{

    protected long inc;


    /**
     * default constructor setting the increment
     * */
    public ArithProgression() {
        this(1);
    }
    /**
     * constructor providing the increment
     * */
    public ArithProgression(long increment) {
        inc = increment;
    }

    @Override
    protected long nextValue() {
       cur += inc;
       return cur;
    }

    public static void main(String[] args) {
        ArithProgression art = new ArithProgression(5);
        art.printProgression(10);
    }
}
