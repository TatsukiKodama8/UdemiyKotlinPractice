package section7.ObjBasicEx0701;

public class Driver {
    public static void main(String[] args) {
        System.out.println("◽️店舗名：" + Product.STORE_NAME);
        Product keyboard = new Product("キーボード", 4000);
        Product mause = new Product("マウス");
        keyboard.display();
        mause.display();

        // 価格再設定
        keyboard.down();
        mause.up(2000);

        System.out.println("---価格再設定後---");
        keyboard.display();
        mause.display();
    }
}