package menu;

import interfaces.Iterator;
import interfaces.Menu;
import iterators.DinerIterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addAllItems();
    }

    private void addAllItems() {
        addItem(new MenuItem("Fufu and Goat meat", "Description 1", false, 35.0));
        addItem(new MenuItem("Noddles with eggs", "Description2", true, 25.0));
        addItem(new MenuItem("Rice and Kontomire", "Description3", true, 20.0));
    }

    public void addItem(MenuItem item) {
        menuItems[numberOfItems++] = item;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerIterator(menuItems);
    }
}
