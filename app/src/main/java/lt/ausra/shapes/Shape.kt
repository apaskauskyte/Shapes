package lt.ausra.shapes

open class Shape(val sideOne: Int, val sideTwo: Int) {

    var area: Int = 0

    fun calculateArea() {
        area = sideOne * sideTwo
    }

    override fun toString(): String {
        return "Jūsų figūros plotas yra $area kv.cm"
    }
}