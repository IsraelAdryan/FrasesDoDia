package com.cursoandroid.teste.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){

        String[] frases = {
                "A persistência é o caminho do êxito.",
                "No meio da dificuldade encontra-se a oportunidade.",
                "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez."

        };

        int numero = new Random().nextInt(4); // 0 1 2 3 4 5

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);



    }

}

