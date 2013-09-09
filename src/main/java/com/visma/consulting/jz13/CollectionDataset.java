package com.visma.consulting.jz13;

import static com.google.common.collect.Lists.newArrayList;
import static com.visma.consulting.jz13.Gender.FEMALE;
import static com.visma.consulting.jz13.Gender.MALE;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionDataset {

    /**
     * Contains:<br/>
     * - 8 Males and 7 females. Total of 15 records.<br/>
     * - 3 persons with lastname Nordmann<br/>
     * - 3 females with firstname Ida<br/>
     */
    public static Collection<Person> getPersons() {
        return newArrayList(
                new Person().setFirstname("Stine").setLastname("Bakk").setGender(FEMALE),
                new Person().setFirstname("Per").setLastname("Nordmann").setGender(MALE),
                new Person().setFirstname("Ida").setLastname("Pettersen").setGender(FEMALE),
                new Person().setFirstname("Kjell").setLastname("Hansen").setGender(MALE),
                new Person().setFirstname("Per").setLastname("Hansen").setGender(MALE),
                new Person().setFirstname("Ola").setLastname("Nordmann").setGender(MALE),
                new Person().setFirstname("Kjell").setLastname("Nordmann").setGender(MALE),
                new Person().setFirstname("Rolf").setLastname("Pettersen").setGender(MALE),
                new Person().setFirstname("Silje").setLastname("Andersen").setGender(FEMALE),
                new Person().setFirstname("Line").setLastname("Berdal").setGender(FEMALE),
                new Person().setFirstname("Terje").setLastname("Nordsen").setGender(MALE),
                new Person().setFirstname("Ola").setLastname("Hansen").setGender(MALE),
                new Person().setFirstname("Silje Marie").setLastname("Andersen").setGender(FEMALE),
                new Person().setFirstname("Ida").setLastname("Engen").setGender(FEMALE),
                new Person().setFirstname("Ida").setLastname("Pettersen").setGender(FEMALE)
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
