package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity){
        this.capacity =capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){
        if (this.data.size()<this.capacity){
            this.data.add(pet);
        }
    }

    public boolean remove(String name){
        for (Pet pet:this.data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public int getCount(){
        return this.data.size();
    }
    public Pet getPet(String name, String owner) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }

    public String getStatistics(){
        String output = "";
        output+= "The grooming salon has the following clients:\n";
        for (Pet pet:this.data) {
            output+= pet.getName()+ " " + pet.getOwner() + "\n";
        }
        return output;
    }
}
