package lt.ausra.shapes

import java.math.RoundingMode
import kotlin.math.PI

class Circle(radius: Int) : Shape(radius, radius) {

    override fun calculateArea() {
        super.calculateArea()
        area *= PI.toBigDecimal().setScale(0, RoundingMode.HALF_UP).toInt()
    }
}