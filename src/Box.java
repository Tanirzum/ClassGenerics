public class Box<T, K> {
    private T value;
    private K valueOne;

    public Box(T value, K valueOne) {
        this.value = value;
        this.valueOne = valueOne;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getValueOne() {
        return valueOne;
    }

    public void setValueOne(K valueOne) {
        this.valueOne = valueOne;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                ", value1=" + valueOne +
                '}';
    }
}
