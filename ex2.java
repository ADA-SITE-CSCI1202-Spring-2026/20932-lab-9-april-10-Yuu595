class Numeric<T extends Number> {
    T n;

    Numeric(T n) {
        this.n = n;
    }

    double reciprocal() {
        return 1 / n.doubleValue();
    }

    double fraction() {
        return n.doubleValue() % 1;
    }

    boolean equal(Numeric<?> x) {
        return Math.abs(n.doubleValue()) == Math.abs(x.n.doubleValue());
    }
}

public class ex2 {
    public static void main(String[] args) {
        Numeric<Double> a = new Numeric<>(9.76);
        Numeric<Float> b = new Numeric<>(-9.76f);

        System.out.println(a.reciprocal());
        System.out.println(a.fraction());
        System.out.println(a.equal(b));
    }
}