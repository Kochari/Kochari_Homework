package hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FamilyTest {
    Family family;

    @BeforeAll
     void beforeAll() {

        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human fredo = new Human("Fredo", "Karleone", 1996);
        Human connie = new Human("Connie", "Karleone", 1999);
         family = new Family(father, mother);
        family.addChild(connie);
        family.addChild(fredo);
    }

    @Test
    void countFamily() {
        int expected = 4;
        int actual =family.countFamily();

        assertEquals(expected, actual);
    }
}