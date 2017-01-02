package GribleDemo;

import GribleDemo.pages.DataStorages;
import GribleDemo.pages.Home;
import GribleDemo.pages.Product;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

/**
 * Created by monk on 12/28/2016.
 */
public class GribleTest {
    {
        Configuration.holdBrowserOpen=true;
    }

    @Test
    public void addTestTable() {

        Home home = new Home();
        home.open();

        String productName= "Product"+ System.currentTimeMillis();
        home.addProduct(productName);

        Product product= home.openProduct(productName);
        DataStorages dataStorages= product.openDataStorages();









    }

}
