package menus;

import components.*;

public abstract class RestaurantMenu {
    private String name;
    private String period;
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public abstract void populateMenu();

    @Override
    public String toString() {
        return "The " + name + "\nActive: " + period + "\nEntrees:\n" + entree.getName() +
               "\nMain Courses:\n" + mainCourse.getName() +
               "\nDesserts:\n" + dessert.getName() +
               "\nDrinks:\n" + drink.getName();
    }
}
