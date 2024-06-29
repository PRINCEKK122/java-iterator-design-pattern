import interfaces.Iterator;
import menu.DinerMenu;
import menu.PancakeHouseMenu;

public class Main {
    public static void main(String[] args) {
        printPancakeHouseMenu();
        printDinerMenu();

//        var dinerIterator = new DinerMenu().createIterator();
//        printIteratorMenu(dinerIterator);
//
//        var pancakeIterator = new PancakeHouseMenu().createIterator();
//        printIteratorMenu(pancakeIterator);
    }

    private static void printPancakeHouseMenu() {
        var pancakeMenu = new PancakeHouseMenu();
        var menuItems = pancakeMenu.getMenuItems();

        for (int i = 0; i < menuItems.size(); i++) {
            var menuItem = menuItems.get(i);
            printItems(menuItem.getName(), menuItem.getDescription(), menuItem.getPrice());
        }
    }

    private static void printDinerMenu() {
        var dinerMenu = new DinerMenu();
        var menuItems = dinerMenu.getMenuItems();

        for (int i = 0; i < menuItems.length; i++) {
            var menuItem = menuItems[i];

            if (menuItem == null) break;

            printItems(menuItem.getName(), menuItem.getDescription(), menuItem.getPrice());
        }
    }

    private static void printIteratorMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            var menuItem = iterator.next();
            printItems(menuItem.getName(), menuItem.getDescription(), menuItem.getPrice());
        }
    }

    private static void printItems(String name, String description, double price) {
        System.out.print(name + " ");
        System.out.println("$" + price);
        System.out.println(description + "\n");
    }
}
