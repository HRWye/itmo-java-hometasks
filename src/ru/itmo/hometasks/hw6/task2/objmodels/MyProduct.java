package ru.itmo.hometasks.hw6.task2.objmodels;

public class MyProduct {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==null||name.length()<3){throw new IllegalArgumentException("Название рациона должно содержать не менее 3 букв");}
        this.name = name;
    }
    public MyProduct(String name) {
        setName(name);
        this.name = name;
    }

    private Product[] products=new Product[3];
    public void addProduct(Product product){
        for (int i=0; i<products.length;i++){
            if (product.getProtein()>15){
                throw new IllegalArgumentException("Белков должно быть меньше 15");
            }
            if (product.getFat()>10){
                throw new IllegalArgumentException("Жиров должно быть меньше 10");
            }
            if (product.getCarbo()>100){
                throw new IllegalArgumentException("Углеводов должно быть меньше 100");
            }
            if (product.getCal()>700){
                throw new IllegalArgumentException("Калорий должно быть меньше 700");
            }
            if (products[i]==null){
                products[i]=product;
                return;
            }
        }
        System.out.println("Рацион полон");
    }
    public void addProduct(Product...products){
        System.out.println("Рацион "+ getName()+": ");
        for (Product product:products){
            addProduct(product);
            System.out.println("Продукт: "+product.getName()+" белков - "+product.getProtein()+", жиров - "+product.getFat()+", углеводов - "+product.getCarbo()+",калорий - "+product.getCal());
        }
    }
}
