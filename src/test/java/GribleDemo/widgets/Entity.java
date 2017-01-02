package GribleDemo.widgets;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by monk on 12/28/2016.
 */
public class Entity {
    private final String name;

    public Entity(String name) {
        this.name=name;
        
    }

    public void open() {
        $$(".table-cell").findBy(Condition.exactText(this.name)).click();
    }
}
