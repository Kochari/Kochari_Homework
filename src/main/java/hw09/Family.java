package hw09;


import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pets;
    private int index;

    public Family(Human father, Human mother, List<Human> children, Set<Pet> pets) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pets = pets;
    }

    public Family(Woman mother, Man father) {
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("successfully garbage collected");
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<Human>();
        this.pets = new HashSet<>();
    }

    public boolean addChild(Human child) {
        this.children.add(child);
        return true;
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

    public Set<Pet> getPets() {
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

    public List<Family> getAllFamilies(Family familyString) {
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


    public Human getMother() {
        return mother;
    }
}