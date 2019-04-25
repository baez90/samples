package com.github.baez90.samples.pecs;

import com.github.baez90.samples.pecs.model.Manager;
import com.github.baez90.samples.pecs.model.Person;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.github.baez90.samples.pecs.CollectionsUtils.*;
import static org.junit.Assert.assertEquals;

public class CollectionsTest {


    @Test
    public void testCollectionsCopy() {
        List<Manager> managers = List.of(
                new Manager("Bugs", "Bunny"),
                new Manager("Duffy", "Duck"),
                new Manager("Carl", "Coyote")
        );

        List<Person> persons = new LinkedList<>();

        //doesn't work wrong because of wrong bounds
        // copy(persons, managers);

        // works because of PECS
        // signature: Collections.copy(dest, src)
        copy(managers, persons);
    }

    @Test
    public void testCopyIf() {
        List<Manager> managers = List.of(
                new Manager("Bugs", "Bunny"),
                new Manager("Duffy", "Duck"),
                new Manager("Carl", "Coyote")
        );


        // more advanced PECS usage with copy
        List<Person> personsWithLastNameBunny = new LinkedList<>();
        copyIf(managers, personsWithLastNameBunny, manager -> manager.lastName().equals("Bunny"));

        assertEquals(1, personsWithLastNameBunny.size());
    }


}
