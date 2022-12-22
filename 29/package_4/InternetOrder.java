package package_4;

public class InternetOrder implements Order {
    private TablesOrderManager manager;

    public InternetOrder() {
        manager = new TablesOrderManager();
    }

    public InternetOrder(Item[] items) {
        manager = new TablesOrderManager();
        for (Item item : items) {
            manager.add(item);
        }
    }

    @Override
    public boolean add(Item item) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public int itemsQuantity() {
        return 0;
    }

    @Override
    public int itemsQuantity(String name) {
        return 0;
    }

    @Override
    public int itemsQuantity(Item item) {
        return 0;
    }

    @Override
    public Item[] getItems() {
        return new Item[0];
    }

    @Override
    public boolean remove(String name) {
        return false;
    }

    @Override
    public boolean remove(Item item) {
        return false;
    }

    @Override
    public int removeAll(String name) {
        return 0;
    }

    @Override
    public int removeAll(Item item) {
        return 0;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        return new Item[0];
    }

    @Override
    public int costTotal() {
        return 0;
    }
}