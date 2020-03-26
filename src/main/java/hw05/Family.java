package hw05;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human children[];
    private Pet pet;
private  int index;
    public Family(Human father, Human mother, Human[] children, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pet = pet;
    }
Family family;
    public Family(Human father, Human mother, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }

    public Family(Human father, Human mother, Human[] children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }



    public void addChild(Human child) {
        children = Arrays.copyOf(children, index+1);
        children[index] = child;
        index++;

    }
    public boolean deleteChild(int index1) {
        if (index1 >= children.length) {
            return false;
        } else
            for (int i = index1; i < children.length-1; i++) {
                children[index1] = children[index1 + 1];
                index--;
                children = Arrays.copyOf(children, index);

            }
        return true;
    }
    public int countFamily () {
        return 2 + index;
    }
    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }



    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

}


