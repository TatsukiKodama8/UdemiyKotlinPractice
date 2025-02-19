package section7.ObjBasic0702;

public class Driver {
    public static void main(String[] args) {

        // インスタンス化　情報開示
        SalesEmployee hayami = new SalesEmployee("速水剛留", 1000000);
        System.out.println();
        hayami.displayInfo();
        
        // インスタンス化　情報開示
        SalesEmployee kawai = new SalesEmployee("河合彩花");
        System.out.println();
        kawai.displayInfo();

    }
}