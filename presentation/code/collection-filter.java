Collection<Person> onlyFemales = Collections2.filter(getPersons(),
    new Predicate<Person>() {
        public boolean apply(Person person) {
            return person.getGender() == Gender.FEMALE;
        }
    });

assertThat(onlyFemales, hasSize(7));