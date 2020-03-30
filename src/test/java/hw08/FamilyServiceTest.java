package hw08;

import hw09.Dog;
import hw09.Pet;
import hw09.service.FamilyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

    class FamilyServiceTest {
        FamilyService familyService = new FamilyService();
        Man father = new Man ("Vito ", "Karleone",1965);
        Woman   mother = new Woman("Jane ", "Karleone",1970);

        Pet dog = new Dog("Rock", 5, 45);
        Family family;

        @BeforeEach
        void before() {
            family = familyService.createNewFamily(father, mother);
            Human child = new Human("Stewie", "Griffin", 1997);
            familyService.adoptChild(family, child);
            familyService.addPet(0, dog);
        }

        @Test
        void getAllFamilies() {
            assertNotEquals("tathata", familyService.getAllFamilies());
        }



        @Test
        void deleteFamilyByIndex() {
            assertEquals(1, familyService.count());
            familyService.deleteFamilyByIndex(0);
            assertEquals(0, familyService.count());
        }

        @Test
        void bornChild() {
            Family newFamily = familyService.createNewFamily(father, mother);

            assertEquals(0, newFamily.getChildren().size());
            familyService.bornChild(newFamily, "masculine");
            assertEquals(1, newFamily.getChildren().size());
        }



        @Test
        void deleteAllChildrenOlderThan() {
            assertEquals(1, familyService.getFamilyById(1).getChildren().size());
            familyService.deleteAllChildrenOlderThan(2);
            assertEquals(0, familyService.getFamilyById(1).getChildren().size());
        }

        @Test
        void count() {
            assertEquals(1, familyService.count());
        }

        @Test
        void getFamilyById() {
            assertEquals(family, familyService.getFamilyById(1));
        }

        @Test
        void getPets() {
            System.out.println(family.getPets());
        }

        @Test
        void addPet() {
            assertEquals(1, family.getPets().size());
            familyService.addPet(0, dog);
            assertEquals(2, family.getPets().size());
        }
    }
}
