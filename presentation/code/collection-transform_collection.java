Collection<String> lastnameFistnameList = Collections2.transform(getPersons(),
        new Function<Person, String>() {
            public String apply(Person input) {
                    return input.getLastname().toUpperCase()
                    + " - " + input.getFirstname().toLowerCase();
            }
        });

assertThat(lastnameFistnameList, hasSize(15));
assertThat(lastnameFistnameList, hasItem(startsWith("PETTERSEN")));
assertThat(lastnameFistnameList, hasItem(endsWith("ida")));