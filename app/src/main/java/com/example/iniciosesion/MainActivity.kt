package com.example.iniciosesion

//import android..os.Bundle
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.idUsuario)
        val etPassword = findViewById<EditText>(R.id.idUsuario2)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == "admin" && password == "mario5") {
                Toast.makeText(this, "INICIO DE SESION EXITOSO!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "USUARIO O CONTRASEÑA INCORRECTOS!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
