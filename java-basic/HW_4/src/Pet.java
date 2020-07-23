import java.util.Arrays;

public class Pet {
    private  String species = "";
    private  String nickname = "";
    private  int age;
    private  int trickLevel;
    private  String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }

    public String getSpecies() {
        return species;
    }
    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public void respond(){
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился!%n", this.nickname);
    }
    public void foul(){
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public String toString() {
        return String.format("%s {nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                this.getSpecies(), this.getNickname(), this.getAge(), this.getTrickLevel(), Arrays.toString(this.getHabits()));
    }
}
