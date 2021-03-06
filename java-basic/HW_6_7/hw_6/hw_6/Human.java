package hw_6;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name = "";
    private String surname = "";
    private int year = -1;
    private int iq = -1;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[0][0];
    private Family family;

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public void greetPet() {
        String greetPet = "";
        if (family != null && family.isPet()) {
            greetPet = String.format("Привет, %s%n", family.getPet().getNickname());
        } else greetPet = "no pet";
        System.out.println(greetPet);
    }

    public void describePet() {
        System.out.printf("У меня есть %s, ему %d лет, он %s%n",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый");
    }


    @Override
    protected void finalize() {
        System.out.println("delete " + this.toString());
    }

    @Override
    public String toString() {
        return String.format("Human {name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                this.name, this.surname, this.year, this.iq,
                Arrays.deepToString(this.schedule)
        );
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Human)) return false;

        Human human = (Human)obj;
        return (Objects.equals(getName(), human.getName()) && Objects.equals(getSurname(), human.getSurname()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }

}
