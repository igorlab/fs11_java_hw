public class HappyFamily {
    public static void main(String[] args) {

        Pet petOne = new Pet("cat","superCat", 3, 100, new String[] {"eat", "drink", "sleep"});
        petOne.respond();
        petOne.eat();
        petOne.foul();
        System.out.println(petOne.toString());

        Human mather = new Human("matherName", "matherSurname", 225, 100, null, null, null,
                                  new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human father = new Human("fatherName", "fatherSurname", 224, 99, null, null, null,
                                  new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human children = new Human("children1name", "children1Surname", 205, 98, petOne, mather, father,
                new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human children2 = new Human("children2name", "children2Surname", 204, 97, petOne, mather, father,
                new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        children.greetPet();
        children.describePet();
        System.out.println(children.toString());

        Human person1 = new Human("namePerson1", "surnamePerson1", 1233, null, null );
        System.out.println(person1.toString());

        Human person2 = new Human("namePerson1", "surnamePerson1", 1233 );
        System.out.println(person2.toString());

        person2.greetPet();

        Family family1 = new Family(mather, father);
        System.out.println(family1.toString());

        Family family2 = new Family(mather, father, petOne);
        //System.out.println(family2.toString());

        Family family3 = new Family(mather, father, new Human[] { children }, petOne);
        System.out.println(family3.toString());

        Family family4 = new Family(mather, father, new Human[] { children, children2 }, petOne);
        System.out.println(family4.toString());



    }
}
