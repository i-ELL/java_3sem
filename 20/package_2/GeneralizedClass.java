package package_2;

public class GeneralizedClass<T, V, K> {

    private T t;
    private V v;
    private K k;

    public GeneralizedClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClasses() {
        System.out.println("Class T: " + t.getClass().getName());
        System.out.println("Class V: " + v.getClass().getName());
        System.out.println("Class K: " + k.getClass().getName());
    }
}