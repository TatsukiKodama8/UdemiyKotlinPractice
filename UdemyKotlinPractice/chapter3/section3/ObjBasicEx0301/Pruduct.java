package section3.ObjBasicEx0301;

public class Pruduct {
    /* ******* Field ******* */
    String name;
    int price;

    /* ******* Method ******* */
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
        System.out.println("商品名=" + name);
        System.out.println("価格=" + price);
    }
}

