package com.visma.consulting.jz13;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import org.junit.Test;

public class GuavaPreconditionTest {

    @Test
    public void precondition() throws Exception {
        input(4, new Object(), new Object());
    }

    private void input(int size, Object valueOne, Object valueTwo) {
        checkNotNull(valueOne, "valueOne can't be null");
        checkNotNull(valueTwo, "valueTwo can't be null");

        checkArgument(size >= 0, "size have to be positivel");
    }
}
