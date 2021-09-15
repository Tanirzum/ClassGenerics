public class Main {
    public static void main(String[] args) {
        Box<String, Double> sample1 = new Box<>("Runtime", 12.123);
        System.out.println(sample1);
        Box<Integer, String> sample2 = new Box<>(1, "Tanirbergen");
        System.out.println(sample2);
        Box<Boolean, Integer> sample3 = new Box<>(Boolean.TRUE, 123);
        System.out.println(sample3);
    }
}