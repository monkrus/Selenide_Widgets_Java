package GribleDemo.pages;

import GribleDemo.widgets.Entity;

/**
 * Created by monk on 12/28/2016.
 */
public class Product {
    public DataStorages openDataStorages() {

new Entity("Data Storages").open();
        return new DataStorages();
    }
}
