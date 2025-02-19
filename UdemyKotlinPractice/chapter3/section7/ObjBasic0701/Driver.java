package section7.ObjBasic0701;

public class Driver {
    public static void main(String[] args) {

        // インスタンス化　情報開示
        SalesEmployee hayami = new SalesEmployee("速水剛留", 1000000);
        System.out.println();
        hayami.displayInfo();

        // 売り上げ・情報表示
        hayami.sell(300000);
        hayami.displayInfo();

        // 標準売り上げ・情報表示
        hayami.sell();
        hayami.displayInfo();
        

    }
}