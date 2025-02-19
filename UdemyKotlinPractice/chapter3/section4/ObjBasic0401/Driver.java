package section4.ObjBasic0401;

public class Driver {
    public static void main(String[] args) {
        // 
        SalesEmployee hayami = new SalesEmployee();
        hayami.name = "速水剛留";
        hayami.salesAmt = 1000000;
        System.out.println();
        hayami.displayInfo();

        //
        SalesEmployee kawai = new SalesEmployee();
        kawai.name = "河合彩花";
        kawai.salesAmt = 500000;
        System.out.println();
        kawai.displayInfo();

        //
        hayami.refund(200000);
        kawai.sell(200000);

        System.out.println("\n---返品・売り上げ処理後---\n");
        hayami.displayInfo();
        System.out.println();
        kawai.displayInfo();

        // 合計金額
        System.out.println("\n二人の売り上げ合計:" 
                            + (hayami.salesAmt + kawai.salesAmt) 
                            + "円");
        
        

    }
}