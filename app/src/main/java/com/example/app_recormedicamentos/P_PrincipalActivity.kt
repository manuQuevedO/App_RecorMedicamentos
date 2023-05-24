package com.example.app_recormedicamentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class P_PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pprincipal)

        val buttonGraficos = findViewById<Button>(R.id.buttonGraficos) as Button
        val buttonOperaciones = findViewById<Button>(R.id.buttonOperaciones) as Button
        val buttonSalir = findViewById<Button>(R.id.buttonSalir) as Button
        val buttonAcercade = findViewById<Button>(R.id.buttonAcerca) as Button
        val buttonMedicamentos = findViewById<Button>(R.id.buttonMedicamentos) as Button
        val buttonHorariosActivity = findViewById<Button>(R.id.buttonHorarios) as Button

        buttonMedicamentos.setOnClickListener(){
            val intent = Intent(this@P_PrincipalActivity,P_MedicamentosActivity::class.java)
            startActivity(intent)

        }

        buttonHorariosActivity.setOnClickListener(){
            val intent = Intent(this@P_PrincipalActivity,P_HorariosActivity::class.java)
            startActivity(intent)

        }
    }

}