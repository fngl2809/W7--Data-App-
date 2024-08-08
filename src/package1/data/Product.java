package package1.data;

public class Product{
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Product product = new Product("samsung", 7500000);
        System.out.println(product.name);
        System.out.println(product.price);
    }

}
