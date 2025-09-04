package semana02;
public class Main {
 public static void main(String[] args) throws Exception {
        System.out.println("");
        Producto product1 = new Producto(); //objeto 1
        product1.name = "Camisa";
        product1.price = 50000;
        product1.quantity = 5;

        product1.sell(2);
        product1.restock(10);
        product1.showProduct();

        System.out.println("");
        Producto product2 = new Producto(); //objeto 2
        product2.name = "Pantalon";
        product2.price = 100000;
        product2.quantity = 10;

        product2.sell(5);
        product2.restock(20);
        product2.showProduct();



    }


}