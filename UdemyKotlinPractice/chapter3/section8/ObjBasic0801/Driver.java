package section8.ObjBasic0801;

public class Driver {
    public static void main(String[] args) {

       // 会社名表示
       SalesEmployee.displayCompany();

       // 配列要素の初期化（インスタンス化・参照値設定）
       SalesEmployee[] se = {
            new SalesEmployee("速水剛留", 1000000),
            new SalesEmployee("河合彩花"),
            new SalesEmployee("鈴木一郎", 850000),
            new SalesEmployee("佐藤太郎", 1200000)
       };

       // 配列宣言
       /*
       SalesEmployee[] se = new SalesEmployee[4];

       // インスタンス化・配列要素へ参照値を代入
       se[0] = new SalesEmployee("速水剛留", 1000000);
       se[0] = new SalesEmployee("河合彩花");
       se[0] = new SalesEmployee("鈴木一郎", 850000);
       se[0] = new SalesEmployee("佐藤太郎", 1200000);
       */

       int total = 0;
       for (int i = 0; i < se.length; i++) {
            System.out.println();
            se[i].displayInfo();
            total += se[i].salesAmt;
       }

       System.out.println("\n--- 集計値 --- \n");
       System.out.println("【合計】" + total + "円");
       System.out.println("【平均】" + total / se.length + "円");
    }
}