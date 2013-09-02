package com.visma.consulting.jz13;

import java.io.InputStream;

import com.google.common.io.Closer;

import org.junit.Test;

public class GuavaIOTest {

    @Test(expected = NullPointerException.class)
    // require guava 14+
    public void tryWithResources() throws Exception {

        Closer closer = Closer.create();
        try {
            InputStream doesNotExist = closer.register(getClass().getResourceAsStream("doesNotExist"));
            byte[] b = new byte[2];
            int read = doesNotExist.read(b, 0, 2);
        } catch (Exception e) {
            throw closer.rethrow(e);
        } finally {
            closer.close();
        }

    }
}
