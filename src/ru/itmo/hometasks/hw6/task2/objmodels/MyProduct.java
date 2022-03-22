package ru.itmo.hometasks.hw6.task2.objmodels;

public class MyProduct {
    private String name;
    private final int maxProtein=15;
    private final int maxFat=10;
    private final int maxCarbo=100;
    private final int maxCal=700;

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

    private Product[] products=new Product[4];
    public void addProduct(Product product){
        for (int i=0; i<products.length;i++){
            if (product.getProtein()>maxProtein){
                throw new IllegalArgumentException("Белков должно быть меньше 15");
            }
            if (product.getFat()>maxFat){
                throw new IllegalArgumentException("Жиров должно быть меньше 10");
            }
            if (product.getCarbo()>maxCarbo){
                throw new IllegalArgumentException("Углеводов должно быть меньше 100");
            }
            if (product.getCal()>maxCal){
                throw new IllegalArgumentException("Калорий должно быть меньше 700");
            }
            if (products[i]==null){
                products[i]=product;
                return;
            }
        }
        throw new IllegalArgumentException("Рацион полон, удалите часть продуктов");
    }
    public void addProduct(Product...products){
        for (Product product:products){
            addProduct(product);
        }
    }

    public void productsList(){
        System.out.println("Рацион "+ getName()+": ");
        for (Product product:products){
            if (product!=null){
            System.out.println("Продукт: "+product.getName()+" белков - "+product.getProtein()+", жиров - "+product.getFat()+", углеводов - "+product.getCarbo()+",калорий - "+product.getCal());}
        }
    }
}
