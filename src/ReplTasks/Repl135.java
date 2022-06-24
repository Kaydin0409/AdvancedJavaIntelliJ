package ReplTasks;

public class Repl135 {

    static class ShoppingStore {

        String item;
        double price;
        int quantity;

        ShoppingStore(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

        double itemTotalPrice() {
            double totalValue = price * quantity;
            System.out.println("Blanket Total Value " + totalValue);
            return totalValue;
        }
    }

    public static void main(String[] args){

        ShoppingStore blanket=new ShoppingStore("Blanket",24.99,4);
        ShoppingStore mattress=new ShoppingStore("Mattress",432.18,1);

    }
}
