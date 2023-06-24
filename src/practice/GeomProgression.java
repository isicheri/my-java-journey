package practice;

public class GeomProgression extends Progression{
    protected long base;

    public GeomProgression() {
        this(2);
    }
public  GeomProgression(long b) {
  base = b;
  first = 1;
  cur = first;
    }

    @Override
    protected long nextValue() {
        cur *= base;
        return cur;
    }

    public static void main(String[] args) {
        GeomProgression gp = new GeomProgression(3);
        gp.printProgression(10);
    }
}
