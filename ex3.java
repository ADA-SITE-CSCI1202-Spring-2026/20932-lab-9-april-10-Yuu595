class Pair<K, V> {
    K key;
    V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }
}

public class ex3 {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Age", 20);

        System.out.println(p.getKey());
        System.out.println(p.getValue());
    }
}