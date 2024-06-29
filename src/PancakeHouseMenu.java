import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addAllItems();
    }

    private void addAllItems() {
        addItem(new MenuItem("Pancake 1", "Pancake1 description", true, 10.99));
        addItem(new MenuItem("Pancake 2", "Pancake2 description", false, 14.99));
        addItem(new MenuItem("Pancake 3", "Pancake3 description", true, 8.99));

        for (MenuItem menuItem : menuItems) addItem(menuItem);
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
