Map<Integer, Name> names = Maps.transformEntries(getPersonMapWithIds(),
        new Maps.EntryTransformer<Integer, Person, Name>() {
            public Name transformEntry(Integer key, Person value) {
                return new Name(value.getFirstname(), value.getLastname());
            }
        });

Name name = names.get(1);
assertThat(name, is(new Name("Per", "Nordmann")));