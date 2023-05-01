package lt.ausra.shapes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "shape_tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val square01 = Square(7)
        val triangle01 = Triangle(2, 4)
        val circle01 = Circle(1)

        chooseShape(square01)
        chooseShape(triangle01)
        chooseShape(circle01)
    }

    private fun chooseShape(value: Shape) {
        value.calculateArea()
        Log.i(TAG, "$value")
    }
}