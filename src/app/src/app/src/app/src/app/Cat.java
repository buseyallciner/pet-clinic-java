package app.model;

public class Cat extends Pet {
    public Cat(int id,String name,double weight){
        super(id,name,weight);
    }
    @Override
    public double dailyCost(){
        return 8.0+0.5*getWeight();
    }

    @Override
    public String speak(){
        return "Meow!";
    }
}
