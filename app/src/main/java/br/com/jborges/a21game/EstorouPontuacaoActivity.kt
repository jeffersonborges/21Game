package br.com.jborges.a21game

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estorou_pontuacao.*
import android.media.MediaPlayer
import android.os.Vibrator;
import android.content.Context.VIBRATOR_SERVICE

@Suppress("DEPRECATION")
class EstorouPontuacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estorou_pontuacao)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        tvPontuacaoFinal.text = intent.getStringExtra("PONTUACAO")
        //fazer vibrar
        val rr = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        val milliseconds: Long = 2000
        rr.vibrate(milliseconds)
        val mediaPlayer = MediaPlayer.create(this, R.raw.explosao);
        mediaPlayer.start();
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
