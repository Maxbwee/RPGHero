package items;

public class Item {
    private String itemName;
    private int requiredLevel;
    private Slot slot;

    public Item(String itemName, Slot slot, int requiredLevel) {
        this.itemName = itemName;
        this.slot = slot;
        this.requiredLevel = requiredLevel;
    }

    public String getItemName() {
        return itemName;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public Slot getSlot() {
        return slot;
    }
}
