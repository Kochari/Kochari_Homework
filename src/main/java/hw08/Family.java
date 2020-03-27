package hw08;
import java.util.*;
public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pets;
    private int index;
    public Family(Human father, Human mother, List<Human> children, List<Pet> pets) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pets = pets;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family class was deleted");
    }
    public Family(Human father, Human mother, List<Human> children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pets = new ArrayList<>();
    }
    public void addChild(Human child) {
        // List<String> childrenList = new ArrayList<>();

        this.children.add(child);
    }
    public void addPet(Pet pet){
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
        return  pets;
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
    public Collection<Family> getAll(Family familyString) {
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


}