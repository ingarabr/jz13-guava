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