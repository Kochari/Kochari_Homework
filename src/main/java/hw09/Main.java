//package hw09;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>();
//       schedule.put(DayOfWeek.Monday, "go to courses");
//        schedule.put(DayOfWeek.Tuesday, "watch a film");
//        schedule.put(DayOfWeek.Wednesday, "go for a walk");
//        schedule.put(DayOfWeek.Thursday, "meet with friends");
//        schedule.put(DayOfWeek.Friday, "play football");
//        schedule.put(DayOfWeek.Saturday, "do not go out");
//        schedule.put(DayOfWeek.Sunday, "do home work");
//
//
//        Set<String> habit = new HashSet<String>();
//        habit.add("eat");
//        habit.add("drink");
//        habit.add("sleep");
//        Human father = new Human("Vito ", "Karleone");
//        Human mother = new Human("Jane ", "Karleone");
//        Human fredo = new Human("Fredo", "Karleone", 1996);
//        Human connie = new Human("Connie", "Karleone", 1999);
//        Human michael = new Human("Michael", "Karleone", 1998);
//
//        Pet dog = new Dog("Rock", 5, 45, habit);
//        fredo.setSchedule(schedule);
//        Family karleone = new Family(father, mother);
//        karleone.addPet(dog);
//
//      karleone.addChild(connie);
//      karleone.addChild(michael);
//
//
//
//
//
//        //   karleone.deleteChild(0);//delete child by index
//        // karleone.deleteChild(1);//delete child by index
//        // karleone.deleteChild(fredo);//delete child by object
//        //  karleone.deleteChild(connie);//delete child by object
//        //System.out.println(karleone);
//          System.out.println(karleone.countFamily());//count family  member(s)
//        for (Family family : karleone.getAll(karleone)) {
//            System.out.println(family.getAll(karleone));
//        }
//    }
//}