package br.com.vakcheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class minhaConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.minha_conta)

        val btnSalvar = findViewById<Button>(R.id.btn_salvar_conta)

        btnSalvar.setOnClickListener{
            salvarConta()
        }

    }

    private fun salvarConta(){
        val salvar = Intent(this, telaRegistro::class.java)
        startActivity(salvar)
    }
}