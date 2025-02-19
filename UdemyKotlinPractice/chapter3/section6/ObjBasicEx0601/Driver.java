package section6.ObjBasicEx0601;

public class Driver {
    public static void main(String[] args) {
        System.out.println("◽️店舗名：" + Product.STORE_NAME);
        Product keyboard = new Product("キーボード", 3000);
        Product mause = new Product("マウス", 2000);
        keyboard.display();
        mause.display();
        System.out.println("インスタンス数：" + Product.instanceCnt);
    }
}