package lt.ausra.shapes

open class Shape(sideOne: Int, sideTwo: Int) {

    var area = 0
    val sideOne = 0
    val sideTwo = 0

    fun calculateArea() {
        area = sideOne * sideTwo
    }

    override fun toString(): String {
        return "Jūsų figūros plotas yra $area kv.cm"
    }
}