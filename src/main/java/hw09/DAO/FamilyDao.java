package hw09.DAO;

import hw09.Family;

import java.util.ArrayList;
import java.util.List;

public class FamilyDao<F> implements CollectionFamilyDao{
    List<Family> family = new ArrayList<>();

    public List<Family> getAllFamilies() {
        return family;
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
    public  void  saveFamily(Family saveFamily){
        this.family.add(saveFamily);
    }

    @Override
    public List getAll() {
        return null;
    }
}
