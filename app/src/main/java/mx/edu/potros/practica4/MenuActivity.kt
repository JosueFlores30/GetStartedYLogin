package mx.edu.potros.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button= findViewById(R.id.antojitos) as Button
        var btnEspecialidades: Button= findViewById(R.id.especialidades) as Button
        var btnCombinations: Button= findViewById(R.id.combinations) as Button
        var btnTortas: Button= findViewById(R.id.tortas) as Button
        var btnSopas: Button= findViewById(R.id.sopas) as Button
        var btnDrinks: Button= findViewById(R.id.drinks) as Button


        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoProducto", "antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoProducto", "especialidades")
            startActivity(intent)
        }
        btnCombinations.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoProducto", "combinations")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoProducto", "tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoProducto", "sopas")
            startActivity(intent)
        }
        btnDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipoProducto", "drinks")
            startActivity(intent)
        }
    }
}