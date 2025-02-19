package section6.ObjBasicEx0601;

public class Product {
    /* ******* Field ******* */
    static final String STORE_NAME = "速水PC販売店";
    static int instanceCnt = 0;
    String name;
    int price;

    /* ******* Constructor ******* */
    Product(String name, int price) {
        this.name = name;
        this.price = price;
        instanceCnt++;
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

    // substract amt from price
    int down(int amt) {
        return price -= amt;
    }

    // display item information
    void display() {
        System.out.println(name + "：" + price);
    }
}

