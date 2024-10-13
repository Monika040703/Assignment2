package menu_factory;

import components.*;

public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new SummerDrink(); // Return an instance of SummerDrink
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new SummerMainCourse(); // Return an instance of SummerMainCourse
    }

    @Override    
    public Entree createEntree() {
        return new SummerEntree(); // Return an instance of SummerEntree
    }

    @Override    
    public Dessert createDessert() {
        return new SummerDessert(); // Return an instance of SummerDessert
    }
}
