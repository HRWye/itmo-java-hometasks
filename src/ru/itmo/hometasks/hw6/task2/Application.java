package ru.itmo.hometasks.hw6.task2;

import ru.itmo.hometasks.hw6.task2.objmodels.MyProduct;
import ru.itmo.hometasks.hw6.task2.objmodels.Product;

public class Application {
    public static void main(String[] args) {

        Product product1=new Product("apple",1,5,30,100);
        Product product2=new Product("pizza",10,9,90,500);
        Product product3=new Product("chicken",14,1,30,200);
        Product product4=new Product("nuts",4,9,10,200);

        MyProduct ration1 = new MyProduct("Dinner");
        ration1.addProduct(product1,product2,product3,product4);
        ration1.productsList();
    }
}
