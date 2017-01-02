package GribleDemo.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by monk on 12/28/2016.
 */
public class ConfirmationDialog {
    SelenideElement container= $(".noty_type_confirm");

    public void confirm() {
        this.container.find(".btn-primary").click();



    }

}
