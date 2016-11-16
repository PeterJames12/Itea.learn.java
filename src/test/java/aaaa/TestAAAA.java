package aaaa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * author Igor
 */
public class TestAAAA {
    AAAA aaaa;

    @Before
    public void setUp() throws Exception {

        aaaa = new AAAA();
    }

    @Test(expected = NullPointerException.class)
    public void name() throws Exception {
        aaaa.inc();

    }
}
