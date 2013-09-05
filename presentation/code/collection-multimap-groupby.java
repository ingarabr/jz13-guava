Multimap<String, Person> groupedByFirstname = Multimaps.index(getPersons(),
        new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                    return person.getFirstname();
            }
        });

assertThat(groupedByFirstname.get("Ida"), hasSize(3));
