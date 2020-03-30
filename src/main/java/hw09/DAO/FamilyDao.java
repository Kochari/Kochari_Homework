package hw09.DAO;

import hw09.Family;
import hw09.Pet;

import java.util.ArrayList;
import java.util.List;

public class FamilyDao<F> implements CollectionFamilyDao{
    List<Family> family = new ArrayList<>();
    List<Pet> pet = new ArrayList<>();

    public List<Family> getAllFamilies() {
        return family;
    }
    public List<Pet> getPets(){
        return pet;
    }

    public Family getFamilyByIndex(int index){
        if(index >= family.size()){
            return null;
        }
        else {
            return this.family.get(index - 1);
        }
    }
   public boolean deleteFamily(int index){
       if (index >= family.size()) {
           return false;
       } else
           family.remove(index);
       return true;
   }
    public boolean deleteFamily(Family deleteFamily){
        try {
            if (family.contains(deleteFamily)) {
                family.remove(deleteFamily);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Oops, you don't have such a family. try again!");
        }
        return false;
    }
    public Family saveFamily(Family saveFamily){
        this.family.add(saveFamily);

        return saveFamily;
    }

    @Override
    public List getAll() {
        return null;
    }
}
