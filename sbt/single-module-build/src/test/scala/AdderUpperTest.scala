import org.scalatest.FunSuite

class AdderUpperTest extends FunSuite{

    test("AdderUpper adds two ints"){
        assert( AdderUpper.add(1,2) === 3)
    }
}
