public class TestDemo {
    public static String test(String str) {
        return String.format("ECHO: %s", str);

    }

    public static void main(String[] args) {
        System.out.println(TestDemo.test("aaa"));
    }
}
