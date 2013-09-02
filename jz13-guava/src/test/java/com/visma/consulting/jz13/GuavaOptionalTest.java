package com.visma.consulting.jz13;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.google.common.base.Optional;

import org.junit.Test;

/**
 * Java 8 have a simular implementation.
 */
public class GuavaOptionalTest {

    @Test
    public void absent() throws Exception {
        assertThat(getAbsent(), is(Optional.<String>absent()));
        assertThat(getOptional(null), is(Optional.<String>absent()));

        assertThat(getAbsent().isPresent(), is(false));
    }

    @Test
    public void present() throws Exception {
        assertThat(getOptional("aValue").isPresent(), is(true));

        assertThat(getOptional("aValue").get(), is("aValue"));
    }

    @Test
    public void presentOrGetValue() throws Exception {
        assertThat(getOptional("aValue").or("anotherValue"), is("aValue"));
        assertThat(getOptional(null).or("anotherValue"), is("anotherValue"));
    }

    private Optional<String> getOptional(String s) {
        return Optional.fromNullable(s);
    }

    private Optional<String> getAbsent() {
        return Optional.absent();
    }
}
