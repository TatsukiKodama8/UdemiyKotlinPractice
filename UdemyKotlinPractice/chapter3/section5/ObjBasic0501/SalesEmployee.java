package section5.ObjBasic0501;
/**
 * 営業部員クラス
 */

public class SalesEmployee {
    /* ******* フィールド ******* */
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
    }

    /* ******* メソッド ******* */
    /**
     * 売り上げる
     * @param amt   売り上げ金額
     * @return      処理後の売り上げ合計金額
     */
    int sell(int amt) {
        return salesAmt += amt;
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
        System.out.println("名前:" + name);
        System.out.println("売り上げ:" + salesAmt + "円");
    }
}

