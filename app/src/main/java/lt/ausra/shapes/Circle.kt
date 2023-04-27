package lt.ausra.shapes

import kotlin.math.PI

class Circle(sideOne: Int, sideTwo: Int, radius: Int) : Shape(sideOne, sideTwo) {

    var radius = 0

    override fun calculateArea() {
        area = ((radius * radius) * PI).toInt()
    }
}