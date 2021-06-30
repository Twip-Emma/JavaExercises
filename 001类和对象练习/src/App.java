public class App {
    private static final String HELLO_WORLD = "Hello, World!";

    public static void main(String[] args) throws Exception {
        System.out.println(HELLO_WORLD);
        ShowName one = new ShowName();
        one.name = "七画";
        one.showName();
    }
}
