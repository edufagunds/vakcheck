package br.com.vakcheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class telaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        val btnEntrar = findViewById<Button>(R.id.id_entrar)
        val btnQueroSerCliente = findViewById<Button>(R.id.id_quero_ser_ser_cliente)

        btnEntrar.setOnClickListener{
            irParaRegistro()
        }
        btnQueroSerCliente.setOnClickListener{
            irParaCadastro()
        }
    }

    private fun irParaRegistro(){
        val registro = Intent(this, telaRegistro::class.java)
        startActivity(registro)
    }

    private fun irParaCadastro(){
        val cadastro = Intent(this, telaCadastro::class.java)
        startActivity(cadastro)
    }
}