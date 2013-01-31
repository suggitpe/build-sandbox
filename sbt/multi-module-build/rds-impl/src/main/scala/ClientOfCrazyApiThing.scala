/**
 * This is a demo object and only here to demonstrate how the dependencies are managed in SBT builds
 */
object ClientOfCrazyApiThing {

    def useTheApi(): Int = {
        SomeCrazyApiThing.createMeAnInt()
    }

}
