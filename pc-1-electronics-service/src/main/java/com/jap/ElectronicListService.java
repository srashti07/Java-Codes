package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    // Add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String[] items = electronicsItems.split(",");

        for (String item : items) {
            String trimmedItem = item.trim();
            if (!itemList.contains(trimmedItem)) {
                itemList.add(trimmedItem);
            }
        }

        return itemList;
    }

    // Search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    // Remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        Iterator<String> iterator = itemList.iterator();
        boolean flag = false;

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals(removeItem)) {
                iterator.remove();
                flag = true;
            }
        }

        return flag;
    }
}
