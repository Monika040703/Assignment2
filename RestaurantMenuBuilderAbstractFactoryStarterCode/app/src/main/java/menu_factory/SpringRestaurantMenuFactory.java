package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SpringEntree;
import components.SpringMainCourse;
import components.SpringDessert;
import components.SpringDrink;

public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    @Override    
    public Entree createEntree() {
        return new SpringEntree();
    }

    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    } 
}
