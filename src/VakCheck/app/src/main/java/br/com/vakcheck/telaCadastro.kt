package br.com.vakcheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class telaCadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_cadastro)

        val btnEnviar = findViewById<Button>(R.id.btn_salvar_conta)
        val txtSouCliente = findViewById<TextView>(R.id.id_ja_sou_cliente)

        btnEnviar.setOnClickListener{
            irParaLogin()
        }
        txtSouCliente.setOnClickListener {
            irParaLogin()
        }
    }

    private fun irParaLogin(){
        val login = Intent(this, telaLogin::class.java)
        startActivity(login)
    }
}