
class Point(var x: Int = 0, var y: Int = 0) {
    override fun toString() = "x = $x, y = $y"

    override fun equals(other: Any?): Boolean {
        return other is Point && other.x == x && other.y == y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    fun Symmetry(){
        x = -x;
        y = -y;
    }

}

fun main() {
    // pirveli
    val point = Point(-2, 8)
    val otherPoint = Point(5,9)

    println(point.toString())
    println(point == otherPoint)
    point.Symmetry()
    println(point)


    // meore
   val carfactory = CarFactory()
    val aircraftfactory = AircraftFactory()

    carfactory.create("Audi")?.let { it.drive() }
    carfactory.create("Maserati")?.let { it.drive() }

    aircraftfactory.create("Boeing737")?.let { it.fly() }
    aircraftfactory.create("Boeing777")?.let { it.fly() }





}
