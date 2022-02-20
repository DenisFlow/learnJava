package f3_List;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void removeGroceryItem(String item) {
        groceryList.remove(item);

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println(groceryList.toString());
    }

    public void replaceItem(String itemOld, String itemNew) {
        int index = groceryList.indexOf(itemOld);
        if (index != -1)
            groceryList.set(index, itemNew);
    }

    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

    public int findItemRetInt(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

}