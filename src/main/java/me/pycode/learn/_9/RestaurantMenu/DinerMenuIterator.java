package me.pycode.learn._9.RestaurantMenu;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position < items.length && items[position] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[position++];
        return item;
    }
}
