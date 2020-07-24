import java.util.Arrays;

public class Human0 {
    private String name = "";
    private String surname = "";
    private int year = -1;
    private int iq = -1;
    private Pet0 pet0;
    private Human0 mother;
    private Human0 father;
    private String[][] schedule = new String[0][0];
    private Family0 family0;

    public void setFamily0(Family0 family0) {
        this.family0 = family0;
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

    public Human0(String name, String surname, int year, int iq, Pet0 pet0, Human0 mother, Human0 father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet0 = pet0;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human0(String name, String surname, int year, Human0 mother, Human0 father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human0(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public void greetPet() {
        String greetPet = "";
        if (family0 != null && family0.getPet0()) {
            greetPet = String.format("Привет, %s%n", family0.getPet().getNickname());
        } else greetPet = "no pet";
        System.out.println(greetPet);
    }

    public void describePet() {
        System.out.printf("У меня есть %s, ему %d лет, он %s%n",
                pet0.getSpecies(), pet0.getAge(), pet0.getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый");
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
}
