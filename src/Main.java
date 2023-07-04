import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of any burger :");
        String burgerName = s.nextLine();

        System.out.println("Enter name of drink :");
        String drinkName = s.nextLine();

        System.out.println("Enter size of Drink");
        String drinkSize = s.nextLine();

        System.out.println("Enter name of side item :");
        String sideName = s.nextLine();

        System.out.println("-".repeat(30));

        System.out.println("Add Toppings");
        System.out.println("List of Available Toppings");
        System.out.println("""
                Cheese - 1.0
                Bacon - 1.5
                Avocado - 1.0
                Hum - 1.5
                Salami - 1.5""");
        System.out.println("Any other topping is FREE!");

        System.out.println("Enter first Topping");
        String extra1 = s.nextLine();

        System.out.println("Enter Second Topping");
        String extra2 = s.nextLine();

        System.out.println("Enter Third Topping");
        String extra3 = s.nextLine();

        System.out.println("-".repeat(30));



        System.out.println("Here is your order summary");

        MealOrder meal = new MealOrder(burgerName,drinkName,sideName);
        meal.addBurgerToppings(extra1,extra2,extra3);
        meal.setDrinkSize(drinkSize);
        meal.printItemizedList();

        System.out.println("-".repeat(30));

        System.out.println("Enter OK to place order");
        System.out.println("Enter NO to quit");

        String response = s.nextLine();

        if(Objects.equals(response, "OK") || Objects.equals(response, "ok")){
            System.out.println("Order Placed successfully!");
        }

        else if (Objects.equals(response, "NO") || Objects.equals(response, "no")) {
            System.out.println("Order aborted");
            System.out.println("See you next time");
        }
    }
}