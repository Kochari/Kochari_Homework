package hw08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FamilyTest {
    Family family;

    Human connie = new Human("Connie", "Karleone", 1999);
    @BeforeEach
    void before() {
        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human fredo = new Human("Fredo", "Karleone", 1996);

        family = new Family(father, mother);
        family.addChild(fredo);
    }

    @Test
    void countFamily() {
        int expected = 3;
        int actual = family.countFamily();
        assertEquals(expected, actual);
    }
    @Test
    void addChild() {
        assertEquals(3, family.countFamily());
        assertTrue(family.addChild(connie));
        assertEquals(4, family.countFamily());
    }

}