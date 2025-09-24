package app.model;

public abstract class Pet  implements Billable{
    private int id;
    private String name;
    private double weight;

    public Pet(int id,String name,double weight){
        this.id=id;
        this.name=name;
        this.weight=weight;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public abstract double dailyCost();

    @Override
    public double totalBill(){
        return dailyCost();
    }
    public String speak(){
        return "...";
    }
    @Override
    public String toString(){
        return String.format("#%d %s (%.1f kg) — cost/day: %.2f$",
                id, name, weight, dailyCost());
    }

}
