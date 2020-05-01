package au.com.auspost.training.staticobject;

public class CounterJ {

    private static CounterJ INSTANCE;
    private Integer count = 0;

    private CounterJ() {
    }

    public static CounterJ getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CounterJ();
        }

        return INSTANCE;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public Integer getCount() {
        return this.count;
    }

    public static void main(String args[]) {

        CounterJ counter = CounterJ.getInstance();
        Integer count = counter.getCount();
        System.out.println("initial count = " + count);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();

        System.out.println("final count = " + counter.getCount());
    }
}
