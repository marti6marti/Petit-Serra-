package hero;

public class Item {

    private String itemName;
    private String itemKind;
    private int itemPower;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemKind(String itemKind) {
        this.itemKind = itemKind;
    }

    public void setItemPower(int itemPower) {
        this.itemPower = itemPower;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemKind() {
        return itemKind;
    }

    public int getItemPower() {
        return itemPower;
    }
}
