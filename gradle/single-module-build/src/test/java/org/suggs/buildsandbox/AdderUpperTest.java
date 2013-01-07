package org.suggs.buildsandbox;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for the adder upper class.
 */
public class AdderUpperTest {

    private AdderUpper adderUpper;

    @Before
    public void onSetup() {
        adderUpper = new AdderUpper();
    }

    @Test
    public void adds4and2to6() {
        assertThat(adderUpper.add(4, 2), is(6));
    }

    @Test
    public void adds2and2to4() {
        assertThat(adderUpper.add(2, 2), equalTo(4));
    }

}
