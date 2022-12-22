package package_4;

public class MinMax<T extends Comparable<T>> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T min = arr[0];
        for (T t : arr) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    public T max() {
        T max = arr[0];
        for (T t : arr) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}