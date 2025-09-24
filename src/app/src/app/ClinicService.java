package app.service;
import app.model.Pet;
import app.model.Dog;
import app.model.Cat;
import java.util.*;

public class ClinicService {
    private List<Pet>pets=new ArrayList<>();
    private int nextId=1;

    public Pet addDog(String name,double weight){
       Pet d=new Dog(nextId++,name,weight);
       pets.add(d);
       return d;
    }

    public Pet addCat(String name,double weight){
        Pet c=new Cat(nextId++,name,weight);
        pets.add(c);
        return c;
    }

    public List<Pet> getPets() {
        return pets;
    }
    public double totalDailyCost(){
        double sum=0.0;
        for(Pet p:pets){
            sum+=p.dailyCost();
        }
        return sum;

    }
}

