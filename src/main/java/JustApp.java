import ie.atu.week1sem2.Dessert;
import ie.atu.week1sem2.Food;
import ie.atu.week1sem2.Fries;
import ie.atu.week1sem2.Pizza;

import java.text.NumberFormat;
import java.util.ArrayList;

public class JustApp {

    public static void main(String[] args) {

        ArrayList<Food> items = new ArrayList<>();
        System.out.println("Welcome to Just App ");
        System.out.println("You ordered...");

        //Add some items burgers, pizzas, fries, salad...
        Burger cheeseBurger = new Burger("Cheese Burger", 1.99, "Beef patty, Cheese, Mayo");
        Pizza pepperoni = new Pizza("Pizza", 9.99, "Pepperoni, Cheese, Ketchup");
        Fries curly = new Fries("Curly Fries", 4.99, "Ready made - Served Hot");
        Dessert icecream = new Dessert("Strawberry Ice cream", 1.99, "Medium - 2 scoops");

        //Add all the orders to a collection
        items.add(cheeseBurger);
        items.add(pepperoni);
        items.add(curly);
        items.add(icecream);

        //Display all the orders
        double totalCost = 0;
        for(Food item : items)
        {
            System.out.println("Name:        " + item.getName());
            System.out.println("Price:       €" + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println();
            totalCost += item.getPrice();
        }

        // Find the total cost of the whole order
        //NumberFormat currency = NumberFormat.getCurrencyInstance(java.util.Locale.GERMANY);
        //System.out.println("Total Cost:  " + currency.format(totalCost));
        System.out.println("Total cost:  €" + String.format("%.2f", totalCost));
    }
}
