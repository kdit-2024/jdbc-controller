public class BankApp {
    public static void main(String[] args) {
        String url = "/withdraw";

        Dispatcher dis = new Dispatcher();
        dis.route(url);
    }
}
