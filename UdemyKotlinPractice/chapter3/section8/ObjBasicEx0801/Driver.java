package section8.ObjBasicEx0801;

public class Driver {
    public static void main(String[] args) {
        System.out.println("◽️店舗名：" + Product.STORE_NAME + "\n");

        Product[] prod = {
            new Product("マウス", 2000),
            new Product("キーボード", 3600),
            new Product("Webカメラ", 3900),
            new Product("マイク", 2800),
            new Product("ディスプレイ", 15000),
            new Product("LED照明", 4200)
        };
        
        // 値段表示
        for (int i = 0; i < prod.length; i++) {
            prod[i].display();
        }

        // 標準価格　一斉値下げ
        for (int i = 0; i < prod.length; i++) {
            prod[i].down();
        }
        
        System.out.println("\n*** 一斉値下げ後 ***\n");

        // 再表示
        for (int i = 0; i < prod.length; i++) {
            prod[i].display();
        }
        

        
    }
}