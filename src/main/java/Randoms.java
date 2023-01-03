import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Randoms implements Iterable<Integer> {
    private final int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimeIterator(min, max);
    }

    private record PrimeIterator(int min, int max) implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return ThreadLocalRandom.current().nextInt(min, max);
        }
    }
}
