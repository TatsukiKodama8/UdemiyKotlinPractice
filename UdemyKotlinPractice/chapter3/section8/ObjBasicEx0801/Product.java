package section8.ObjBasicEx0801;

public class Product {
    /* ******* Field ******* */
    static final String STORE_NAME = "速水PC販売店";
    static final int DEFAULT_CHANGE_AMT = 1000;
    static int instanceCnt = 0;
    String name;
    int price;

    /* ******* Constructor ******* */
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Product(String name) {
        this(name, 0);
    }

    /* ******* Method ******* */
    // dispaly store name
    static void displayStoreName() {
        System.out.println(STORE_NAME);
    }

    // add amt to price
    int up(int amt) {
        return price += amt;
    }

    int up() {
        return this.up(DEFAULT_CHANGE_AMT);
    }

    // substract amt from price
    int down(int amt) {
        return price -= amt;
    }

    int down() {
        return this.down(DEFAULT_CHANGE_AMT);
    }

    // display item information
    void display() {
        System.out.println(name + "：" + price);
    }
}

