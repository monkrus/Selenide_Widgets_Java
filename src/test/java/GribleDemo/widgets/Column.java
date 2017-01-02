package GribleDemo.widgets;

import com.codeborne.selenide.SelenideElement;

/**
 * Created by monk on 12/29/2016.
 */
public class Column {
    private final SelenideElement container;

    public Column(SelenideElement container) {
this.container=container;
    }

    public void setName(String text) {
        HTContextMenu menu =new HTContextMenu(this.container);
               menu.open();
               menu.set("[name='context-menu-input-name']", text);
        // removed after set method  was created ---$("[name='context-menu-input-name']").setValue(text);
               menu.select("Save");

    }
}
