package GribleDemo.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by monk on 12/30/2016.
 */
public class HTContextMenu implements ContextMenu {
    GeneralContextMenu generalContextMenu;

    public HTContextMenu(SelenideElement element) {
        this.generalContextMenu = new GeneralContextMenu(element);
    }

    public void select(String text) {
        generalContextMenu.select(text);

    }

    public ContextMenu open() {
        return generalContextMenu.open();

    }

    public HTContextMenu set(String fieldCssSelector  , String text) {
        $(fieldCssSelector).setValue(text);
        return this;


    }
}
