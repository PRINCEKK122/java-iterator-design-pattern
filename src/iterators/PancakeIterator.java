package iterators;

import interfaces.Iterator;
import menu.MenuItem;

import java.util.List;

public class PancakeIterator implements Iterator {
    private final List<MenuItem> items;
    private int position = 0;

    public PancakeIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position > items.size() || (position < items.size() && items.get(position) != null);
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
