package hw10;



import java.util.Map;
import java.util.Objects;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Pet pet;
    private Map schedule;
    private Human mother;
    private Human father;


    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, long birthDate, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname,long birthDate, int iq, Human father,Human mother, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.father = father;
        this.mother = mother;
        this.pet = pet;
    }

    public Human(String name, String surname, long birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }

    public String describeAge() {
        LocalDate localDate = Instant.ofEpochMilli(birthDate)
                .atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(localDate, LocalDate.now());
        return String.format("years: %d, months: %d, days: %d",
                period.getYears(), period.getMonths(), period.getDays());
    }
    public void greetPet() {

        System.out.println("Hello" + getPet().getNickname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate == human.birthDate &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq, pet, mother, father);
    }

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing done in Human class");
    }

    public String getName() {
        return name;
    }

    public Map getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getYear() {
        return birthDate;
    }

    public void setYear(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }
    public long getAge() {
        return LocalDate.now().getYear() - LocalDate.ofEpochDay(birthDate).getYear();
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }


    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setSchedule(Map schedule) {
        this.schedule = schedule;
    }

    public String toString() {
        final String formattedBirthDate = LocalDate.ofEpochDay(birthDate)
                .format(DateTimeFormatter
                        .ofPattern("dd/MM/yyyy"));
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + formattedBirthDate +
                ", iq=" + iq +
                '}';
    }
}