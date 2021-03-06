package com.visma.consulting.jz13;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newLinkedList;
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Maps.newTreeMap;
import static com.visma.consulting.jz13.CollectionDataset.getPersonMapWithIds;
import static com.visma.consulting.jz13.CollectionDataset.getPersons;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.StringStartsWith.startsWith;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import org.junit.Test;

public class GuavaCollectionsTest {


    /**
     * You find filters in:
     * <code> Iterables and Collections2 </code>, there's a diverant of it in <code>Maps</code> for keys and values
     */
    @Test
    public void filterOutFemales() throws Exception {
        Collection<Person> females = Collections2.filter(getPersons(),
                new Predicate<Person>() {
                    public boolean apply(Person person) {
                        return person.getGender() == Gender.FEMALE;
                    }
                });

        assertThat(females, hasSize(7));
    }

    /**
     * You find transform in:
     * <code>Iterables, Lists andCollections2</code> , there's a diverant of it in <code>Maps</code> for keys and values
     */
    @Test
    public void transformPersonToDispalyStrings() throws Exception {
        Collection<String> lastnameFirstnameList = Collections2.transform(getPersons(),
                new Function<Person, String>() {
                    public String apply(Person input) {
                        return input.getLastname().toUpperCase()
                                + " - " + input.getFirstname().toLowerCase();
                    }
                });

        assertThat(lastnameFirstnameList, hasSize(15));
        assertThat(lastnameFirstnameList, hasItem(startsWith("PETTERSEN")));
        assertThat(lastnameFirstnameList, hasItem(endsWith("ida")));
    }

    @Test
    public void transformMapOfPersionsToMapOfNames() throws Exception {
        Map<Integer, Name> names = Maps.transformEntries(getPersonMapWithIds(),
                new Maps.EntryTransformer<Integer, Person, Name>() {
                    public Name transformEntry(Integer key, Person value) {
                        return new Name(value.getFirstname(), value.getLastname());
                    }
                });

        Name name = names.get(1);
        assertThat(name, is(new Name("Per", "Nordmann")));
    }

    @Test
    public void fluentInterface() throws Exception {
        List<Name> names = FluentIterable.from(getPersons())
                .filter(new Predicate<Person>() {
                    @Override
                    public boolean apply(Person input) {
                        return input.getLastname().equals("Nordmann");
                    }
                }).transform(new Function<Person, Name>() {
                    @Override
                    public Name apply(Person input) {
                        return new Name(input.getFirstname(), input.getLastname());
                    }
                }).skip(1)
                .limit(1)
                .toList();
        assertThat(names, hasSize(1));
    }

    @Test
    @SuppressWarnings("unused")
    public void creatingCollections() throws Exception {
        List<String> strList = newArrayList("value1", "value2", "value3");
        List<Integer> intList = newLinkedList();

        Map<Integer, BigDecimal> hashmap = newHashMap();
        Map<Integer, BigDecimal> treemap = newTreeMap();

        Map<Integer, String> imMap = ImmutableMap.of(1, "v1", 2, "v2", 3, "v3");
    }

    @Test
    public void groupToMultiMap() throws Exception {
        Multimap<String, Person> groupedByFirstname = Multimaps.index(getPersons(),
                new Function<Person, String>() {
                    @Override
                    public String apply(Person person) {
                        return person.getFirstname();
                    }
                });

        assertThat(groupedByFirstname.get("Ida"), hasSize(3));

    }
}
