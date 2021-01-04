package com.example.frasesmotivacionaisdomoid;

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

    public void gerarNovaFrase (View view) {

        String[] frases = {
                "Olhar ao redor é tão necessario quanto buscar pelas boas coisas do seu dia",
                "Hoje é um dia como qualquer outro, dia om ou ruim é coisa da nossa cabeça",
                "Analisar a si mesmo é algo tão basico quanto escovar os dentes",
                "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
                "A persistência é o caminho do êxito.",
                "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
                "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
                "No meio da dificuldade encontra-se a oportunidade.",
                "Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.",
                "Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.",
                "É parte da cura o desejo de ser curado.",
                "Imagine uma nova história para sua vida e acredite nela.",
                "O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.",
                "Quando você quer alguma coisa, todo o universo conspira para que você realize o seu desejo.",
                "Você precisa fazer aquilo que pensa que não é capaz de fazer.",
                "O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                "Lute com determinação, abrace a vida com paixão, perca com classe e vença com ousadia, porque o mundo pertence a quem se atreve e a vida é muito para ser insignificante.",
                "Nossa maior fraqueza está em desistir. O caminho mais certo de vencer é tentar mais uma vez.",
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis",
                "Se você quer ser bem-sucedido precisa de dedicação total, buscar seu último limite e dar o melhor de si mesmo",
                "Não crie limites para si mesmo. Você deve ir tão longe quanto sua mente permitir. O que você mais quer pode ser conquistado",
                "Nenhum obstáculo será grande se a sua vontade de vencer for maior",
                "Dificuldades preparam pessoas comuns para destinos extraordinários",
                "Nenhum homem será um grande líder se quiser fazer tudo sozinho ou se quiser levar todo o crédito por fazer isso",
                "Pessoas vencedoras não são aquelas que não falham, são aquelas que não desistem",
                "Só existem dois dias do ano em que você não pode fazer nada: um se chama ontem e outro amanhã",
                "A vida é um constante recomeço. Não se dê por derrotado e siga adiante. As pedras que hoje atrapalham sua caminhada amanhã enfeitarão a sua estrada",
                "Ouse ir além, ouse fazer diferente e o poder lhe será dado",
                "Ouse, arrisque, não desista jamais e saiba valorizar quem te ama, esses sim merecem seu respeito. Quanto ao resto, bom, ninguém nunca precisou de restos para ser feliz",
                "Para ser um campeão você tem que acreditar em si mesmo quando ninguém mais acredita",
                "No fim tudo dá certo, e se não deu certo é porque ainda não chegou ao fim",
                "Você nunca sabe que resultados virão da sua ação. Mas se você não fizer nada, não existirão resultados",
                "O pessimista vê dificuldade em toda oportunidade. O otimista vê oportunidade em toda dificuldade"


        };

        int numero = new Random().nextInt(33); // todas as frases estão aqui da 0 a 32



        TextView texto = findViewById(R.id.FraseDoDia);
        texto.setText( frases[ numero ] );




    }

}
