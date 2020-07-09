public class HappyFamily {
    public static void main(String[] args) {

        Pet petOne = new Pet("cat","superCat", 3, 100, new String[] {"eat", "drink", "sleep"});
        petOne.respond();
        petOne.eat();
        petOne.foul();
        System.out.println(petOne.toString());

        Human mather = new Human("matherName", "matherSurname", 225, 99, null, null, null,
                                  new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human father = new Human("fatherName", "fatherSurname", 225, 99, null, null, null,
                                  new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human    iam = new Human("myName", "mySurname", 205, 99, petOne, mather, father,
                                  new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        iam.greetPet();
        iam.describePet();
        System.out.println(iam.toString());

        Human person1 = new Human("namePerson1", "surnamePerson1", 1233, null, null );
        //System.out.println(person1.toString());

        Human person2 = new Human("namePerson1", "surnamePerson1", 1233 );
        //System.out.println(person2.toString());

    }
}
