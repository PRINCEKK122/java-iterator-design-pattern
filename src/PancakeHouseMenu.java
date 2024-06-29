import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private final List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addAllItems();
    }

    private void addAllItems() {
        addItem(new MenuItem("Pancake1", "Pancake1 description", true, 10.99));
        addItem(new MenuItem("Pancake2", "Pancake2 description", false, 14.99));
        addItem(new MenuItem("Pancake3", "Pancake3 description", true, 8.99));
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
