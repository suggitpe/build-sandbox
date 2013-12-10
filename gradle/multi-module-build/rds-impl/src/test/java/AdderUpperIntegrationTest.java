import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AdderUpperIntegrationTest{

	private AdderUpper adderUpper;

    @Before
    public void onSetup() {
        adderUpper = new AdderUpperImpl();
    }

    @Test
    public void shouldAddTwoIntsTogther() {
        assertThat(adderUpper.add(1, 3), is(5));
    }	
}