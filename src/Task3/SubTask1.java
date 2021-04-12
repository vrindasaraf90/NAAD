package Task3;

    class Product {
        int price;
        String name;

        Product(int price, String name) {
            this.price = price;
            this.name = name;
        }

        Product() {
            System.out.println("Product: ");
        }
    }

    public String toString() {
        return String.format("Name: " + name + "@Rs. " + price);
    }}

    class SpecialProduct<price> extends Product{
     int regularPrice;
     int percentageOff;

        SpecialProduct(String name , int price){
            super(price, name);
        }

        public static SpecialProduct applyOffOnProduct(Product p, int percentageOff) {
            int discountedPrice = product.price - (percentageOff*product.price/100);
            SpecialProduct sp1 = new SpecialProduct(product.name , discountedPrice);
            SpecialProduct.regularPrice = product.price;
            SpecialProduct.percentageOff = percentageOff;
            return sp1;
        }

    }
        public String toString() {
            return String.format("RegularPrice : %d & PercentageOff : %d",regularPrice,percentageOff);
        }}


public class SubTask1 {
    public static void main(String[] args) {

        String obj1 = new String();
        String obj2 = new String();

        System.out.println(obj1.equals(obj2));

        obj1 = "Apple";
        obj2 = "Watermelon";

        System.out.println(obj1.equals(obj2));

        Product a = new Product(80,"Pencil");
        Product b = new Product(30, "Pen");
        Product c = new Product(80,"Pencil");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        SpecialProduct sp = new SpecialProduct("A",30);
        sp = SpecialProduct.applyOffOnProduct(a,20);
        System.out.println(sp.toString());
    }
}