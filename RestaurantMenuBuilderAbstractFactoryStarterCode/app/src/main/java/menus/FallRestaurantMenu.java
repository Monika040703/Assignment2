package menus;

import menu_factory.RestaurantMenuFactory;

public class FallRestaurantMenu extends RestaurantMenu {
    private RestaurantMenuFactory factory;

    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.factory = factory;
    }

    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        setName("Fall Menu");
        setPeriod("September 1 to November 30.");
        entree = factory.createEntree();
        mainCourse = factory.createMainCourse();
        dessert = factory.createDessert();
        drink = factory.createDrink();
    }
}
