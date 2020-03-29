package hw09;

import hw09.DAO.FamilyDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pets;
    private int index;
    Family familyString;
    FamilyDao familyDao=new FamilyDao();
    public Family(Human father, Human mother, List<Human> children, List<Pet> pets) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pets = pets;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("successfully garbage collected");
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<Human>();
        this.pets = new ArrayList<>();
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public boolean deleteChild(int index1) {
        if (index1 >= children.size()) {
            System.out.println("index1>=child.lengh");
            return false;
        } else
            children.remove(index1);
        return true;
    }

    boolean deleteChild(Human child) {
        try {
            if (children.contains(child)) {
                children.remove(child);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Oops, you don't have such a child. try again!");
        }
        return false;
    }

    public int countFamily() {
        return 1 + index;
    }

    public Human getFather() {
        return father;
    }

    public List<Pet> getPet() {
        return pets;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public List<Family> getAllFamilies() {
        try {
            ArrayList<Family> familyObj = new ArrayList<Family>();
            familyObj.add(familyString);
            return familyObj;
        } catch (Exception ex) {
            return new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pets +
                '}';
    }


    public String displayAllFamilies(int index) {
            return getFamilyByIndex(index).toString();
            // return getFamilyByIndex(index).represent();
        }

    private Family getFamilyByIndex(int index) {// public Flight getFlightsByID(int id) {
                                                  //   return flightDao.getByID(id);
    return familyDao.getFamilyByIndex(index);

}
}