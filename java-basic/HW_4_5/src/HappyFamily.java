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
                                         new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}}
                                  );

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

        Family family01 = new Family(mather, father);
        System.out.println(family01.toString());
        mather.greetPet();
        System.out.println("family1.getChildrenS() " + family01.getChildrenS());

        Family family03 = new Family(mather, father, new Human[] { children }, petOne);
        System.out.println(family03.toString());

        Family family04 = new Family(mather, father, new Human[] { children, children2 }, petOne);
        System.out.println(family04.toString());

        System.out.println("family4.getChildrenS() " + family04.getChildrenS());

        family04.addChildren(new Human[] {person2, person1} );
        System.out.println(family04.toString());

        System.out.println("family4.getChildrenS() " + family04.getChildrenS());
        System.out.println("family4.getFather() " + family04.getFather());
        System.out.println("family4.getMother() " + family04.getMother());

        mather.greetPet();

        Human[] persons = new Human[99999];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Human("namePerson1", "surnamePerson1", 1233, null, null );
        }

        System.out.println("try delete child 2 " + family04.deleteChild(2));
        System.out.println(family04.toString());

    }
}
