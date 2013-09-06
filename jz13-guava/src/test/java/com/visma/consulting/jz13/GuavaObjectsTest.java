package com.visma.consulting.jz13;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * Java 7 have it's own Objects class that have the same functionality.
 * @see java.util.Objects#hash(Object...)
 * @see java.util.Objects#equals(Object, Object)
 * */
public class GuavaObjectsTest {

    @Test
    public void hashCodeAndEquals() throws Exception {
        Name aName = new Name("Fist", "Last");
        Name anotherName = new Name("Fist", "Last");

        assertThat(aName.hashCode(), is(anotherName.hashCode()));
        assertThat(aName, is(anotherName));
    }

    @Test
    public void simpleToStrings() throws Exception {
        Name name = new Name("Kari", "Traa");

        assertThat(name.toString(), is("Name{firstname=Kari, lastname=Traa}"));
    }

    @Test
    public void toStringWithoutNulls() throws Exception {
        Name name = new Name("Kari", null);

        assertThat(name.toString(), is("Name{firstname=Kari}"));

    }
}
