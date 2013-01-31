import org.scalatest.FunSuite

/**
 * This is a demo object and only here to demonstrate how the dependencies are managed in SBT builds
 */
class ClientOfCrazyApiThingTest extends FunSuite {

    test("calls api to get int") {
        assert(ClientOfCrazyApiThing.useTheApi() === 65)
    }

}
