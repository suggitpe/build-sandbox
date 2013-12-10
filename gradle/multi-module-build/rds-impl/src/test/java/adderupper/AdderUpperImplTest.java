package adderupper;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import support.UnitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for the adder upper
 */
@Category(UnitTest.class)
public class AdderUpperImplTest {

    private AdderUpper adderUpper;

    @Before
    public void onSetup() {
        adderUpper = new AdderUpperImpl();
    }

    @Test
    public void shouldAddTwoIntsTogther() {
        assertThat(adderUpper.add(1, 3), is(4));
    }

}
