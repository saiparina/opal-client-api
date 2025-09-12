package pt.saipar.client.api.utils;

import lombok.experimental.UtilityClass;
import pt.saipar.client.api.OpalAPI;
import pt.saipar.client.api.wrapper.item.ItemWrapper;

@UtilityClass
public final class InventoryUtils {

    /**
     * Searches for an item's slot in the hotbar
     *
     * @param name the name of the item
     * @return the slot of the item in the hotbar
     */
    public int searchHotBar(final String name) {
        for (int slot = 0; slot < 9; slot++) {
            final ItemWrapper item = OpalAPI.INSTANCE.getWrapper().getInventory().getItems()[slot];

            if (item != null && item.getInternalName().contains(name)) {
                return slot;
            }
        }

        return -1;
    }

}
