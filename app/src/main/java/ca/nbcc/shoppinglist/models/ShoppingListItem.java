package ca.nbcc.shoppinglist.models;

import java.io.Serializable;

public class ShoppingListItem implements Serializable {

    public int itemCount;
    public String itemName;

    public ShoppingListItem(){

    }

    public ShoppingListItem(String name, int count){
        this.itemCount = count;
        this.itemName = name;
    }
}
