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
        }).limit(1)
        .toList();

assertThat(names, hasSize(1));