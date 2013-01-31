import org.scalatest.FunSuite

/**
 * This is a demo object and only here to demonstrate how the dependencies are managed in SBT builds
 */
class SomeCrazyApiThingTest extends FunSuite {

    test("gives me an int") {
        assert(SomeCrazyApiThing.createMeAnInt() === 65)
    }

}
