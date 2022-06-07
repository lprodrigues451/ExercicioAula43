package br.com.zup.minhamusicafavorita.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityMainBinding
import br.com.zup.minhamusicafavorita.detalhe.DetalhesDaBanda
import br.com.zup.minhamusicafavorita.detalhe.adapter.DetalhePagerAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoDetalhe.setOnClickListener {
            startActivity(Intent(this, DetalhesDaBanda::class.java))
        }
    }
}