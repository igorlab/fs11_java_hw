import hw_6.*;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human mather1 = new Human("matherName", "matherSurname", 225, 100, null, null, null,
            new String[][]{{"Sunday", "do nothing"}, {"Monday", "do home work3"}});

    Human father1 = new Human("fatherName", "fatherSurname", 224, 99, null, null, null,
            new String[][]{{"Sunday", "do nothing"}, {DayOfWeek.MONDAY.name(), "do home work3"}}
    );
    Pet petTwo = new Pet(Species.DOG,"superDOG", 3, 100, new String[] {"eat", "drink", "sleep"});
    Human children = new Human("children1name", "children1Surname", 205, 98, petTwo, mather1, mather1,
            new String[][]{{"Sunday", "do nothing"}, {DayOfWeek.MONDAY.name(), "do home work3"}});

    Human children2 = new Human("children2name", "children2Surname", 204, 97, petTwo, mather1, mather1,
            new String[][]{{"Sunday", "do nothing"}, {DayOfWeek.MONDAY.name(), "do home work3"}});
    Family family04 = new Family(mather1, father1, new Human[] { children, children2 }, petTwo);



    @Test
    void testToString() {
        String result = "--------------------------------------------------------------------------------------------\n" +
                "Family[1]{\n" +
                "Human {name='fatherName', surname='fatherSurname', year=224, iq=99, schedule=[[Sunday, do nothing], [MONDAY, do home work3]]}\n" +
                "Human {name='matherName', surname='matherSurname', year=225, iq=100, schedule=[[Sunday, do nothing], [Monday, do home work3]]}\n" +
                "Pet DOG {nickname='superDOG', age=3, trickLevel=100, habits=[eat, drink, sleep]}\n" +
                "child: Human {name='children1name', surname='children1Surname', year=205, iq=98, schedule=[[Sunday, do nothing], [MONDAY, do home work3]]}\n" +
                "Human {name='children2name', surname='children2Surname', year=204, iq=97, schedule=[[Sunday, do nothing], [MONDAY, do home work3]]}\n" +
                "Family consist of 4 humans\n" +
                "}\n" +
                "--------------------------------------------------------------------------------------------\n";

        assertEquals(result, family04.toString());

    };

}