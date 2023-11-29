package br.com.vakcheck

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class telaMinhasVacinas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_minhas_vacinas)

        val imgVoltar = findViewById<ImageView>(R.id.id_voltar_cadastro_vacina)
        val btnExcluir = findViewById<Button>(R.id.btn_excluir_vacina)

        imgVoltar.setOnClickListener{
            finish()
        }

        btnExcluir.setOnClickListener{
            exibirMensagem()
        }
    }


    private fun exibirMensagem(){
        val mensagem = "Funcionalidade ainda não disponível"
        val duracao = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, mensagem, duracao)
        toast.show()
    }

}
