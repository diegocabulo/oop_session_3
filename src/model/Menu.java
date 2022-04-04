package model;

public class Menu {
    private String name;
    private Float price;

    public Menu(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "The "+name+" menu" +" cost $" + price;
    }
}
