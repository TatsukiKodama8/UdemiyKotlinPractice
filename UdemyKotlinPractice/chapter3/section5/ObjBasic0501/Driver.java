package section5.ObjBasic0501;

public class Driver {
    public static void main(String[] args) {
        // 
        SalesEmployee hayami = new SalesEmployee("速水剛留", 1000000);
        System.out.println();
        hayami.displayInfo();

        //
        SalesEmployee kawai = new SalesEmployee("河合彩花", 500000);
        System.out.println();
        kawai.displayInfo();

        //
        kawai.sell(100000);
        System.out.println();
        kawai.displayInfo();
        

    }
}