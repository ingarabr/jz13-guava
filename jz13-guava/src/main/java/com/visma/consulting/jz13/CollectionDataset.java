package com.visma.consulting.jz13;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionDataset {

    /**
     * Contains:<br/>
     * - 8 Males and 7 females. Total of 15 records.<br/>
     * - 3 persons with lastname Nordmann<br/>
     * - 3 females with firstname Ida<br/>
     * @return a collection
     */
    public static Collection<Person> getPersons() {
        return newArrayList(
                new Person().setFirstname("Stine").setLastname("Bakk").setSex(Sex.FEMALE),
                new Person().setFirstname("Per").setLastname("Nordmann").setSex(Sex.MALE),
                new Person().setFirstname("Ida").setLastname("Pettersen").setSex(Sex.FEMALE),
                new Person().setFirstname("Kjell").setLastname("Hansen").setSex(Sex.MALE),
                new Person().setFirstname("Per").setLastname("Hansen").setSex(Sex.MALE),
                new Person().setFirstname("Ola").setLastname("Nordmann").setSex(Sex.MALE),
                new Person().setFirstname("Kjell").setLastname("Nordmann").setSex(Sex.MALE),
                new Person().setFirstname("Rolf").setLastname("Pettersen").setSex(Sex.MALE),
                new Person().setFirstname("Silje").setLastname("Andersen").setSex(Sex.FEMALE),
                new Person().setFirstname("Line").setLastname("Berdal").setSex(Sex.FEMALE),
                new Person().setFirstname("Terje").setLastname("Nordsen").setSex(Sex.MALE),
                new Person().setFirstname("Ola").setLastname("Hansen").setSex(Sex.MALE),
                new Person().setFirstname("Silje Marie").setLastname("Andersen").setSex(Sex.FEMALE),
                new Person().setFirstname("Ida").setLastname("Engen").setSex(Sex.FEMALE),
                new Person().setFirstname("Ida").setLastname("Pettersen").setSex(Sex.FEMALE)
        );
    }


    public static Map<Integer, Person> getPersonMapWithIds() {
        HashMap<Integer, Person> persionsWithIds = new HashMap<Integer, Person>();
        int id = 0;
        for (Person person : getPersons()) {
            persionsWithIds.put(id++, person);
        }
        return persionsWithIds;
    }

}
