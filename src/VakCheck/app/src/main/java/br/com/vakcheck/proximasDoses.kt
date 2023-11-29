package br.com.vakcheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.content.Intent
import android.widget.Toast

class proximasDoses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proximas_doses)

        val imgVoltar = findViewById<ImageView>(R.id.img_voltar_doses)
        val btnEditar = findViewById<Button>(R.id.btn_editar)

        imgVoltar.setOnClickListener{
            voltarMinhasVacinas()
        }

        btnEditar.setOnClickListener{
            exibirMensagem()
        }
    }

    private fun voltarMinhasVacinas(){
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