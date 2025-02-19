package section5.ObjBasicEx0501;

public class Product {
    /* ******* Field ******* */
    String name;
    int price;

    /* ******* Constructor ******* */
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

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

