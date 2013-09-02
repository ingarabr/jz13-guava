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

    /**
     * Example imlementation of hashCode and equals:
     *<pre>{@code
     * @literal @Override
     *  public boolean equals(Object obj) {
     *      if (this == obj) {
     *          return true;
     *      }
     *      if (obj == null || getClass() != obj.getClass()) {
     *          return false;
     *      }
     *      Name other = (Name) obj;
     *      return Objects.equal(firstname, other.firstname) &&
     *             Objects.equal(lastname, other.lastname);
     *  }
     * @literal @Override
     *  public int hashCode() {
     *      return Objects.hashCode(firstname, lastname);
     *  }
     *  }</pre>
     *
     */

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
