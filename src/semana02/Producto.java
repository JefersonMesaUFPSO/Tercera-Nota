package semana02;
public class Producto {
    String name;
    double price; 
    int quantity;

    //metodos
    void sell ( int amount){
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " unidades de  " + name + " vendidas.  Cantidad actual = " + quantity);
        }else{
            System.out.println( amount + "  unidades DE " + name );
        }
    }

    void restock(int  amount){
        quantity += amount;
        System.out.println( amount + " unidades de " + name + " añadidas al stock. Cantidad actual = "+  quantity) ;
    }

    void showProduct(){
        System.out.println("nombre del producto: " + name );
        System.out.println("precio del producto: " + price );
        System.out.println("Cantidad actual:  " + quantity );
    }
}