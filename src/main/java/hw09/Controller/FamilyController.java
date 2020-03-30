package hw09.Controller;

import hw09.*;
import hw09.service.FamilyService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesMoreThan(int size) {
        familyService.getFamiliesMoreThan(size);
    }

    public void getFamiliesLessThan(int size) {
        familyService.getFamiliesLessThan(size);
    }

    public void countFamiliesWithMemberCount(int memberCount) {
        familyService.countFamiliesWithMemberCount(memberCount);
    }

    public void createNewFamily(Woman mother, Man father) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public void bornChild(Family family, String gender) {
        familyService.bornChild(family, gender);
    }

    public void adoptChild(Family family, Human human) {
        familyService.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int id) {
        return familyService.getFamilyById(id);
    }

    public Set<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
                                        familyService.addPet(index, pet);
    }
}
