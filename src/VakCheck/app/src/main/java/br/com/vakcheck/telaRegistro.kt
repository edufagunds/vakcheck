package br.com.vakcheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class telaRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_registro)

        val btnResgistrarVac = findViewById<Button>(R.id.id_registro_vacinacao)
        val btnMinhasVac = findViewById<Button>(R.id.id_minhas_vacinas)
        val btnProxDoses = findViewById<Button>(R.id.id_proximas_doses)
        val btnMinhaConta = findViewById<Button>(R.id.id_minha_conta)

        btnResgistrarVac.setOnClickListener{
            irParaRegistrarVacina()
        }
        btnMinhasVac.setOnClickListener{
            irParaMinhasVacinas()
        }
        btnProxDoses.setOnClickListener{
            irParaProximasDoses()
        }
        btnMinhaConta.setOnClickListener{
            irParaMinhaConta()
        }

    }

    private fun irParaRegistrarVacina(){
        val registrar = Intent(this, registroVacinacao::class.java)
        startActivity(registrar)
    }
    private fun irParaMinhasVacinas(){
        val minhasVacinas = Intent(this, telaMinhasVacinas::class.java)
        startActivity(minhasVacinas)
    }
    private fun irParaProximasDoses(){
        val doses = Intent(this, proximasDoses::class.java)
        startActivity(doses)
    }
    private fun irParaMinhaConta(){
        val conta = Intent(this, minhaConta::class.java)
        startActivity(conta)
    }

}