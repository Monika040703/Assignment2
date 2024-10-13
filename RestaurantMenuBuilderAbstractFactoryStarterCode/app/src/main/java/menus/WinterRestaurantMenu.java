/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 *
 * @author gouraya
 */
public class WinterRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    @Override
    public void populateMenu() {
    System.out.println("Adding items to " + getName());
    setName("Winter Menu");
    setPeriod("December 1 to February 28.");
    entree = theFactory.createEntree();
    mainCourse = theFactory.createMainCourse();
    dessert = theFactory.createDessert();
    drink = theFactory.createDrink();
}  
}
