package gamez.ana.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProductosActivity : AppCompatActivity() {
    var coldDrinks = ArrayList<Product>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
    }

    fun agregarProductos(){
        
    }
}