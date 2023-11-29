package br.com.vakcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class telaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicio)

        val btnSouCliente = findViewById<Button>(R.id.btn_sou_cliente_inicio)
        val btnQueroSerCliente  = findViewById<Button>(R.id.btn_quero_ser_cliente_inicio)

        btnSouCliente.setOnClickListener {
        IrparaLogin()
    }
        btnQueroSerCliente.setOnClickListener{
            IrparaCadastro()
        }

        }

        private fun IrparaLogin(){
            val login = Intent(this, telaLogin::class.java)
            startActivity(login)
    }

        private fun IrparaCadastro(){
            val cadastro = Intent(this, telaCadastro::class.java)
            startActivity(cadastro)
        }
}