package section5.ObjBasicEx0501;

public class Driver {
    public static void main(String[] args) {
        Product prod = new Product("キーボード", 2000);
        prod.display();
        prod.up(1000);
        prod.display();
    }
}