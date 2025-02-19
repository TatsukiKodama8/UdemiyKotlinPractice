package section8.ObjBasic0801;
/**
 * 営業部員クラス
 */

public class SalesEmployee {
    /* ******* フィールド ******* */
    /*
     * 会社名（static）
     */
    static final String COMPANY_NAME = "XX商事";
    
    /**
     * 標準売り上げ金額（static）
     */
    static final int DEFAULT_SALES_AMT = 150000;

    /**
     * 作成したインスタンス数 (static)
     */
    static int instanceCnt = 0;

    /**
     * 名前
     */
    String name;

    /**
     * 売り上げ合計金額
     */
    int salesAmt;

    /* ******* コンストラクタ ******* */
    SalesEmployee(String name, int salesAmt) {
        this.name = name;
        this.salesAmt = salesAmt;
        instanceCnt++;
        System.out.println("\nコンストラクタ内");
        System.out.println("インスタンス数: " + instanceCnt);
    }

    SalesEmployee(String name) {
        this(name, 0);
    }

    /* ******* メソッド ******* */
    /**
     * 会社名の表示
     */
    static void displayCompany() {
        System.out.println("会社名：" + COMPANY_NAME);
    }


    /**
     * 売り上げる
     * @param amt   売り上げ金額
     * @return      処理後の売り上げ合計金額
     */
    int sell(int amt) {
        return salesAmt += amt;
    }

    /**
     * 売り上げる（標準売り上げ金額）
     * @return      処理後の売り上げ合計金額
     */
    int sell() {
        return this.sell(DEFAULT_SALES_AMT);
    }

    /**
     * 返品を受け取る
     * @param amt   返品金額（売り上げマイナス）
     * @return      処理後の売り上げ合計金額
     */
    int refund(int amt) {
        return salesAmt -= amt;
    }

    /**
     * 情報表示
     */
    void displayInfo() {
        System.out.println("会社名：" + COMPANY_NAME);
        System.out.println("名前:" + name);
        System.out.println("売り上げ:" + salesAmt + "円");
    }
}

