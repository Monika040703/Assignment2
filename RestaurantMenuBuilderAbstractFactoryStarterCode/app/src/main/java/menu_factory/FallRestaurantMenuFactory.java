package menu_factory;

import components.*;

public class FallRestaurantMenuFactory implements RestaurantMenuFactory {
    @Override
    public Entree createEntree() {
        return new FallEntree();
    }

    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    @Override
    public Dessert createDessert() {
        return new FallDessert();
    }

    @Override
    public Drink createDrink() {
        return new FallDrink();
    }
}
