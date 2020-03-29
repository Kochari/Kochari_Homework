package hw09.service;

import hw09.DAO.FamilyDao;
import hw09.Family;
import hw09.Pet;

import java.util.ArrayList;
import java.util.List;

public class FamilyService {
    FamilyDao familyDao;
    Family familyServices;
    List<Family> family = new ArrayList<>();
    List<Pet> pets;;
    public void Service(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }


    public List<Family> getAllFamilies() {
        return familyServices.getAllFamilies();
    }

    public String displayAllFamilies(int index) {

        return familyServices.displayAllFamilies(index);
    }
//    getFamiliesBiggerThan
//            getFamiliesLessThan
//    countFamiliesWithMemberNumber
//            createNewFamily
public boolean delete(int index) {
    if (index > family.size() || index < 0) return false;
    family.remove(index);
    return true;
}
//            bornChild
//    adoptChild
//            deleteAllChildrenOlderThen
//    count

public Family getByID(int index) {
    return family.get(index-1);
}
public List<Pet> getPet() {
    return pets;
}

public void addPet(Pet pet) {
    this.pets.add(pet);
}
}



