package ro.fasttrackit.homework.curs16;

public class MainShop {
    public static void main(String[] args) {

        Shop<ShopItem> itemShop = new Shop<>();

        Clothes<String, Integer, Category> clothes = new Clothes("t-shirt", 10, Category.ON_SALE);
        Clothes<String, Integer, Category> clothes1 = new Clothes("shorts", 25, Category.ON_SALE);
        Clothes<String, Integer, Category> clothes2 = new Clothes("jeans", 50, Category.NEW);
        Clothes<String, Integer, Category> clothes3 = new Clothes("jacket", 100, Category.REFURBISHED);

        Fruits<String, Integer, Category> fruit = new Fruits("apple", 1, Category.ON_SALE);
        Fruits<String, Integer, Category> fruit1 = new Fruits("orange", 3, Category.ON_SALE);
        Fruits<String, Integer, Category> fruit2 = new Fruits("banana", 10, Category.NEW);
        Fruits<String, Integer, Category> fruit3 = new Fruits("peach", 4, Category.REFURBISHED);
        Fruits<String, Integer, Category> fruit4 = new Fruits("pineapple", 8, Category.REFURBISHED);


        Electronics<String, Integer, Category> electronics = new Electronics("smart TV", 300, Category.ON_SALE);
        Electronics<String, Integer, Category> electronics1 = new Electronics("smartphone", 250, Category.ON_SALE);
        Electronics<String, Integer, Category> electronics2 = new Electronics("laptop", 350, Category.REFURBISHED);
        Electronics<String, Integer, Category> electronics3 = new Electronics("X-box", 220, Category.REFURBISHED);
        Electronics<String, Integer, Category> electronics4 = new Electronics("oven", 80, Category.NEW);


        itemShop.addItem(clothes);
        itemShop.addItem(clothes1);
        itemShop.addItem(clothes2);
        itemShop.addItem(clothes3);

        itemShop.addItem(fruit);
        itemShop.addItem(fruit1);
        itemShop.addItem(fruit2);
        itemShop.addItem(fruit3);
        itemShop.addItem(fruit4);

        itemShop.addItem(electronics);
        itemShop.addItem(electronics1);
        itemShop.addItem(electronics2);
        itemShop.addItem(electronics3);
        itemShop.addItem(electronics4);
        System.out.println(itemShop);
        System.out.println("--------------");
        System.out.println(itemShop.findByCategory(Category.REFURBISHED));
        System.out.println(itemShop.removeItem("jeans"));
        System.out.println(itemShop);


    }
}
