package GribleDemo.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by monk on 12/29/2016.
 */
public class GeneralContextMenu implements ContextMenu{
    private final SelenideElement element;

    public GeneralContextMenu(SelenideElement element){
        this.element=element;

    }

    public void selectItem(String text) {
        $$(".context-menu-item").findBy(exactText(text)).click();
    }

    public GeneralContextMenu open() {
        this.element.contextClick();
        return this;


    }

    public void select(String text) {

    }
}
