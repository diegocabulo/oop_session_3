import model.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> restaurantMenus = new ArrayList<>();

        restaurantMenus.add(createMenu("Italiano", 12500F));
        restaurantMenus.add(createMenu("Peruano", 13500F));
        restaurantMenus.add(createMenu("Colombiano", 14500F));
        restaurantMenus.add(createMenu("Español", 15500F));
        restaurantMenus.add(createMenu("Arabe", 16500F));

        replaceMenu(restaurantMenus, 2, "Vegan");

        amountOfRecipes(restaurantMenus);

        printTheWholeMenu(restaurantMenus);


    }
    private static Menu createMenu(String name, Float price){
        return new Menu(name,price);
    }

    private static void replaceMenu(ArrayList<Menu> menus, Integer position, String newName){
        menus.get(position).setName(newName);
        int option = position + 1;
        System.out.println("the option menu "+ option +" has change");
        System.out.println(menus.get(position));
    }

    private static void amountOfRecipes(ArrayList<Menu> menus){
        System.out.println("Amount of menus "+ menus.size());
    }

    private static void printTheWholeMenu(ArrayList<Menu> menus){
        for(Menu menu: menus){
            System.out.println(menu);
        }
    }
}


