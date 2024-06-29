package menu;

public class MenuItem {
    private final String name;
    private final String description;
    private final boolean isVegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }
}
