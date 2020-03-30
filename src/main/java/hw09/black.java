/*package homework9.service;
​
import homework9.Util;
import homework9.dao.FamilyDao;
import homework9.model.*;
​
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
​
public class FamilyService {
    FamilyDao familyDao = new FamilyDao();
​
    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }
​
    public void displayAllFamilies() {
        familyDao.getAllFamilies()
                .forEach(System.out::println);
    }
​
    public void getFamiliesMoreThan(int count) {
        familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() > count)
                .forEach(System.out::println);
    }
​
    public void getFamiliesLessThan(int count) {
        familyDao.getAllFamilies()
                .stream()
                .filter(family -> family.countFamily() < count)
                .forEach(System.out::println);
    }
​
    public void countFamiliesWithMemberCount(int memberCount) {
        System.out.println(
                familyDao.getAllFamilies()
                        .stream()
                        .filter(family -> family.countFamily() == memberCount)
                        .count()
        );
    }
​
    public Family createNewFamily(Man father, Woman mother) {
        return familyDao.saveFamily(new Family(mother, father));
    }
​
    public void deleteFamilyByIndex(int index) {
        familyDao.getAllFamilies()
                .remove(index);
    }
​
    public Family bornChild(Family family, String gender) {
        Human newlyBornChild = new Human();
        if (gender.equals("masculine")) {
            newlyBornChild = new Man(
                    Util.getChildName(true),
                    "Griffin", LocalDate.now().getYear(),
                    (family.getMother().getIq() + family.getFather().getIq()) / 2);
        } else if (gender.equals("feminine")) {
            newlyBornChild = new Woman(
                    Util.getChildName(false),
                    "Griffin", LocalDate.now().getYear(),
                    (family.getMother().getIq() + family.getFather().getIq()) / 2);
        }
​
        family.addChild(newlyBornChild);
        return family;
    }
​
    public Family adoptChild(Family family, Human human) {
        family.addChild(human);
        return family;
    }
​
    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies()
                .forEach(family -> {
                    List<Human> olderChild = family.getChildren()
                            .stream()
                            .filter(child -> child.getAge() > age)
                            .collect(Collectors.toList());
                    family.getChildren().removeAll(olderChild);
                });
    }
​
    public int count() {
        return familyDao
                .getAllFamilies()
                .size();
    }
​
    public Family getFamilyById(int id) {
        return familyDao
                .getAllFamilies()
                .get(id - 1);
    }
​
    public ArrayList<Pet> getPets(int index) {
        return familyDao
                .getAllFamilies()
                .get(index).getPets();
    }
​
    public void addPet(int index, Pet pet) {
        familyDao.getAllFamilies()
                .get(index)
                .getPets()
                .add(pet);
    }
}
*/