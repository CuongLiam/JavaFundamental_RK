import classess.Coffee;
import classess.Drink;
import classess.FruitJuice;
import classess.interfaces;

public class Main {
    public static void main(String[] args) {

        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("CF001", "Bac Siu", 30000, true);

        drinks[1] = new FruitJuice("FJ001", "Nuoc cam", 40000, 10);

        drinks[2] = null;


        for (int i = 0; i < drinks.length; i++){
            if (drinks[i] != null){
                drinks[i].displayInfo();
                System.out.println();
                drinks[i].calculatePrice();

                if (drinks[i] instanceof interfaces.IMixable){
                    ((interfaces.IMixable) drinks[i]).mix();
                }
            } else {
                System.out.println("NULL");
            }
            System.out.println("--------------------------------------");
        }
    }
}