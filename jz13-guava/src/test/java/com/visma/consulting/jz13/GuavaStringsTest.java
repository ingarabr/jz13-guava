package com.visma.consulting.jz13;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;

import org.junit.Test;

public class GuavaStringsTest {

    @Test
    public void joinStrings() throws Exception {
        String joinedString = Joiner.on(", ").join("a", "b", "c");

        assertThat(joinedString, is("a, b, c"));
    }

    @Test
    public void stringRepeat() throws Exception {
        String nanaBatman = Strings.repeat("NaN", 5) + " Batman!";

        assertThat(nanaBatman, is("NaNNaNNaNNaNNaN Batman!"));
    }

    @Test
    public void nullIsEmptyString() throws Exception {
        assertThat(Strings.nullToEmpty(null), is(""));
        assertThat(Strings.nullToEmpty("value"), is("value"));
    }

    @Test
    public void emptyOrNull() throws Exception {
        assertThat(Strings.isNullOrEmpty(null), is(true));
        assertThat(Strings.isNullOrEmpty(""), is(true));
        assertThat(Strings.isNullOrEmpty("value"), is(false));
    }
}
