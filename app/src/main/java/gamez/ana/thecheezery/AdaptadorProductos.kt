package gamez.ana.thecheezery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

public class AdaptadorProductos: BaseAdapter {
    var productos = ArrayList<Product>()
    var contexto: Context? = null

    constructor(contexto: Context, productos: ArrayList<Product>){
        this.productos = productos
        this.contexto = contexto
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var producto = productos[position]
        var inflador = LayoutInflater.from(contexto)
        var vista = inflador.inflate(R.layout.producto_view, null)


        var imagen = vista.findViewById(R.id.producto_img) as ImageView
        var nombre = vista.findViewById(R.id.producto_nombre) as TextView
        var desc = vista.findViewById(R.id.producto_desc) as TextView
        var precio = vista.findViewById(R.id.producto_precio) as TextView

        imagen.setImageResource(producto.image)
        nombre.setText(producto.name)
        desc.setText(producto.description)
        precio.setText("$${producto.price}")


        return vista
    }

    override fun getItem(position: Int): Any {
        return productos[position]
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getCount(): Int {
        return productos.size
    }
}