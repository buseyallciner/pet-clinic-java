package app.model;

public class Dog extends Pet{

    public Dog(int id,String name,double weight){
        super(id,name,weight);
    }

    @Override
    public double dailyCost(){
        return 10.+0.8*getId();
    }
    @Override
    public String speak(){
        return "Woof!";
    }
    


}
