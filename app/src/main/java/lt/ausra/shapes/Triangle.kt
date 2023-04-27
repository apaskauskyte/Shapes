package lt.ausra.shapes

class Triangle(sideOne: Int, sideTwo: Int, altitudeFromSideTwo: Int) : Shape(sideOne, sideTwo) {

    var altitudeFromSideTwo = 0

    override fun calculateArea() {
        area = (altitudeFromSideTwo * sideTwo)/2
    }
}