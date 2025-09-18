package main;

public class Main {
    public static void main(String[] args) throws Exception {
        Box box = new Box();
        box.size = 5;
    
        System.out.println("Antes de cambiar el tamaño: " + box.size);
    
        Main main = new Main();
        main.changeBox(box);
    
        System.out.println("Después de cambiar el tamaño: " + box.size);
    }
    

    public static void changeBox(Box newBox){
        newBox.size = 10;
    }

}

