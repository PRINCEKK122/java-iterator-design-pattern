public class Main {
    public static void main(String[] args) {
        printPancakeHouseMenu();
    }

    private static void printPancakeHouseMenu() {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var menuItems = pancakeHouseMenu.getMenuItems();

        for (int i = 0; i < menuItems.size(); i++) {
            var menuItem = menuItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println("$" + menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + "\n");
        }
    }

}
