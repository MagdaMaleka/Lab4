public class ProductTester {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product ("kawa", 28);
        products[1] = new Product("cukier", 10);
        products[2] = new Product("herbata", 2.50);
        products[3] = new Product("cukier", 10);

        System.out.print("Porównujemy ");
        System.out.print(products[1]);
        System.out.print(products[3]);

        if (products[1].equals(products[3])){
            System.out.println("Te same produkty");
        }


       /* Product product1 = new Product("Kawa", 4);
        Product product2 = new Product("Kawa", 4);

        if (product1.equals(product2)) {
            System.out.println("Ten sam produkt!!!");*/
        }
    }

