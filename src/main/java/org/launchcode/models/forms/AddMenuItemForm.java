package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;
import java.util.List;

public class AddMenuItemForm {

    private Menu menu;
    private Iterable<Cheese> cheeses;
    @NotNull
    private int menuId;
    @NotNull
    private int cheeseId;

    public AddMenuItemForm(){}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.menu = menu;
        this.cheeses = cheeses;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }
}
