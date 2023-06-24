package practice;

public class Progression {
    protected long first;
    protected long cur;

    public Progression() {
        cur = first = 0;

    }


    protected long firstValue() {
        cur =  first;
        return cur;
    }
    protected long nextValue() {
        return ++cur;
    }

    public void printProgression(int n) {
        System.out.println(firstValue());
        for (int i = 0; i < n; i++) {
            System.out.println(nextValue());
        }
    }

    public static void main(String[] args) {
        Progression prog = new Progression();

        prog.printProgression(8);
    }
}
