package lt.ausra.shapes

import java.math.RoundingMode
import kotlin.math.PI

class Circle(var radius: Int) : Shape(0, 0) {

    override fun calculateArea() {
        area = (
                radius * radius * PI
                ).toBigDecimal().setScale(0, RoundingMode.HALF_UP).toInt()
    }
}