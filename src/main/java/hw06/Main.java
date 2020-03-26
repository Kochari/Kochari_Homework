package hw06;

public class Main {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = DayOfWeek.Sunday.name();
        schedule[0][1] = "do home work";
        schedule[1][0] = DayOfWeek.Monday.name();
        schedule[1][1] = "go to courses";
        schedule[2][0] = DayOfWeek.Tuesday.name();
        schedule[2][1] = "watch a film";
        schedule[3][0] = DayOfWeek.Wednesday.name();
        schedule[3][1] = "go for a walk";
        schedule[4][0] = DayOfWeek.Thursday.name();
        schedule[4][1] = "meet with friends";
        schedule[5][0] = DayOfWeek.Friday.name();
        schedule[5][1] = "play football";
        schedule[6][0] = DayOfWeek.Saturday.name();
        schedule[6][1] = "do not go out";

        String[] habit = new String[]{"eat", "drink", "sleep"};
        Human father = new Human("Vito ", "Karleone");
        Human mother = new Human("Jane ", "Karleone");
        Human[] child = new Human[0];
        Human fredo = new Human("Fredo", "Karleone", 1996);
        Human connie = new Human("Connie", "Karleone", 1999);
        Human michael = new Human("Michael", "Karleone", 1998);
        Pet pet = new Pet(Species.DOG, "Rock", 5, 75, habit);
        fredo.setSchedule(schedule);
        Family karleone = new Family(father, mother, child);
        karleone.addChild(fredo);// add child
        karleone.addChild(connie);
        karleone.addChild(michael);
        karleone.setPet(pet);
        System.out.println(karleone);
        karleone.deleteChild(0);//delete child by index
        karleone.deleteChild(1);//delete child by index
        //  karleone.deleteChild(fredo);//delete child by object
        //  karleone.deleteChild(connie);//delete child by object
        System.out.println(karleone);
        System.out.println(karleone.countFamily());//count family  member(s)
    }
}