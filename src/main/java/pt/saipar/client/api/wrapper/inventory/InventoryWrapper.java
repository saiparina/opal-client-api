package pt.saipar.client.api.wrapper.inventory;

import pt.saipar.client.api.wrapper.item.ItemWrapper;

public interface InventoryWrapper {

    ItemWrapper[] getItems();

    ItemWrapper[] getArmor();

    void setCurrentItem(final int slot);

    int getCurrentItemSlot();

    ItemWrapper getCurrentItem();

    void process(final int slot, final int button, final int mode);

}
