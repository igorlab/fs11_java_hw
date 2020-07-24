public class HappyFamily0 {
    public static void main(String[] args) {

        Pet0 pet0One = new Pet0("cat","superCat", 3, 100, new String[] {"eat", "drink", "sleep"});
        pet0One.respond();
        pet0One.eat();
        pet0One.foul();
        System.out.println(pet0One.toString());

        Human0 mather = new Human0("matherName", "matherSurname", 225, 100, null, null, null,
                                  new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human0 father = new Human0("fatherName", "fatherSurname", 224, 99, null, null, null,
                                         new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}}
                                  );

        Human0 children = new Human0("children1name", "children1Surname", 205, 98, pet0One, mather, father,
                new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        Human0 children2 = new Human0("children2name", "children2Surname", 204, 97, pet0One, mather, father,
                new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

        children.greetPet();
        children.describePet();
        System.out.println(children.toString());

        Human0 person1 = new Human0("namePerson1", "surnamePerson1", 1233, null, null );
        System.out.println(person1.toString());

        Human0 person2 = new Human0("namePerson1", "surnamePerson1", 1233 );
        System.out.println(person2.toString());

        person2.greetPet();

        Family0 family01 = new Family0(mather, father);
        System.out.println(family01.toString());
        mather.greetPet();
        System.out.println("family1.getChildrenS() " + family01.getChildrenS());

        Family0 family03 = new Family0(mather, father, new Human0[] { children }, pet0One);
        System.out.println(family03.toString());

        Family0 family04 = new Family0(mather, father, new Human0[] { children, children2 }, pet0One);
        System.out.println(family04.toString());

        System.out.println("family4.getChildrenS() " + family04.getChildrenS());

        family04.setChildren(new Human0[] {person2, person1} );
        System.out.println(family04.toString());

        System.out.println("family4.getChildrenS() " + family04.getChildrenS());
        System.out.println("family4.getFather() " + family04.getFather());
        System.out.println("family4.getMother() " + family04.getMother());

        mather.greetPet();

        Human0[] persons = new Human0[9999999];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Human0("namePerson1", "surnamePerson1", 1233, null, null );
        }

    }
}
