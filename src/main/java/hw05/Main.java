package hw05;

public class Main {


    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "watch a film";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go for a walk";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "meet with friends";
        schedule[5][0] = "Friday";
        schedule[5][1] = "play football";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do not go out";

        String[] habit = new String[]{"eat", "drink", "sleep"};
        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human[] child = new Human[0];
        Human fredo = new Human("Fredo", "Karleone", 1996);
        Human michael = new Human("Michael", "Karleone", 1998);
        Pet pet = new Pet("dog", "Rock", 5, 75, habit);
        fredo.setSchedule(schedule);
        Family karleone = new Family(father, mother, child);
        System.out.println(karleone);
        karleone.addChild(fredo);
        karleone.addChild(michael);
        karleone.setPet(pet);
        System.out.println(karleone);//before deleteChild
        karleone.deleteChild(1);
        System.out.println(karleone.countFamily());
        System.out.println(karleone);


    }
}