Collection<Person> females = Collections2.filter(getPersons(),
        new Predicate<Person>() {
            public boolean apply(Person person) {
                    return person.getGender() == Gender.FEMALE;
            }
        });

assertThat(females, hasSize(7));