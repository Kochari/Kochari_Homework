package hw09.Controller;

import hw09.Family;
import hw09.Man;
import hw09.Pet;
import hw09.Woman;

import java.util.List;

public class FamilyController {
    FamilyController familyController = new FamilyController();

    public List<Family> getFamilyById(int id) {
        return familyController.getFamilyById(id);
    }

    public void displayAllFamilies() {
        familyController.displayAllFamilies();
    }

    public List<Family> getAllFamilies() {
        return familyController.getAllFamilies();
    }

    public void deleteFamilyByIndex(int index) {
        familyController.deleteFamilyByIndex(index);
    }

    public int count() {
        return familyController.count();
    }

    public void addPet(Pet pet) {
        familyController.addPet(pet);
    }

    public List<Pet> getPets() {
        return familyController.getPets();
    }

    public Family createNewFamily(Man father, Woman mother) {
        return familyController.createNewFamily(father, mother);
    }
}
