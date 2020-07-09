import java.util.Arrays;

public class Human {
    private  String name = "";
    private  String surname = "";
    private  int year = -1;
    private  int iq = -1;
    private  Pet pet;
    private  Human mother;
    private  Human father;
    private  String[][] schedule;

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

    public Pet getPet() {
        return pet;
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

    public Human(String name, String surname, int year, Human mother, Human father ) {
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

    public void greetPet(){
        System.out.printf("Привет, %s%n", pet.getNickname());
    }

    public void describePet() {
        System.out.printf("У меня есть %s, ему %d лет, он %s%n",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый");
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother=%s %s, father=%s %s, pet=%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}}",
                this.name, this.surname, this.year, this.iq, mother.getName(), mother.getSurname(), father.getName(),
                father.getSurname(), pet.getSpecies(), pet.getNickname(), pet.getAge(), pet.getTrickLevel(), Arrays.toString(pet.getHabits()));
    }
}
