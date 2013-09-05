String joinedString = Joiner.on(", ").join("a", "b", "c");
assertThat(joinedString, is("a, b, c"));

assertThat(Strings.nullToEmpty(null), is(""));
assertThat(Strings.nullToEmpty("value"), is("value"));

assertThat(Strings.isNullOrEmpty(null), is(true));
assertThat(Strings.isNullOrEmpty(""), is(true));
assertThat(Strings.isNullOrEmpty("value"), is(false));