package br.com.vakcheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.content.Intent
import android.widget.Toast


class registroVacinacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_vacinacao)

        val imgVoltar = findViewById<ImageView>(R.id.id_voltar_cadastro)
        val btnRegistro = findViewById<Button>(R.id.btn_registrar_vacinacao)

        imgVoltar.setOnClickListener{
            irParaMinhasVacinas()
        }
        btnRegistro.setOnClickListener{
            exibirMensagem()
        }

    }

    private fun irParaMinhasVacinas(){
        val vacinas = Intent(this, telaRegistro::class.java)
        startActivity(vacinas)
    }

    private fun exibirMensagem(){
        val mensagem = "Funcionalidade ainda não disponível"
        val duracao = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, mensagem, duracao)
        toast.show()
    }
}


