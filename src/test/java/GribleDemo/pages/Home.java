package GribleDemo.pages;

import GribleDemo.widgets.ConfirmationDialog;
import GribleDemo.widgets.Entity;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by monk on 12/28/2016.
 */
public class Home {
    public void open() {
        Selenide.open("http://localhost:8123/");
    }

    public void addProduct(String name) {
        $("#btn-add-product").click();

        $(".product-name").setValue(name);
        $(".product-path").setValue(name);
        $("#dialog-btn-add-product").click();

        new ConfirmationDialog().confirm();

    }

    public Product openProduct(String name) {
       new Entity(name).open();
        // removed after Entity0 was created ---$$(".table-cell").findBy(Condition.exactText(productName)).click();
        return new Product();
    }
}


