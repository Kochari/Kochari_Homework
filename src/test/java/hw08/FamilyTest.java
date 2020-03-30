package hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyTest {
    Family karleone;

    @BeforeAll
     void beforeAll() {
        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human fredo = new Human("Fredo", "Karleone", 1996);
        Human connie = new Human("Connie", "Karleone", 1999);
        Family karleone = new Family(father, mother);
        karleone.addChild(connie);
        karleone.addChild(fredo);
    }

    @Test
    void countFamily() {
        int expected = 4;
        int actual =karleone.countFamily();

        assertEquals(expected, actual);
    }
}