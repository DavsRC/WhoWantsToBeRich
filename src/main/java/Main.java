import Data.PlayerDAO;
import Entity.Player;
import Entity.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Categoría historia de Colombia

        Question question1 = new Question("¿Cuál fue el primer presidente de Colombia?", "Historia de Colombia", "A. Rafael Núñez", "B. Simón Bolívar", "C. Tomás Cipriano de Mosquera", "D. Francisco de Paula Santander", "b");
        Question  question2 = new Question( "¿En qué año se consolidó Colombia como estado?", "Historia de Colombia", "A. 1810", "B. 1800", "C. 1795", "D. 1910", "a");
        Question  question3 = new Question( "¿Cuál de estos no fue un nombre de Colombia?", "Historia de Colombia", "A. La gran Colombia", "B. Confederación Granadina", "C. República de Granada", "D. República de Colombia", "c");
        Question  pregunta4 = new Question( "¿Cuál es el principal producto de exportación de Colombia?", "Historia de Colombia", "A. Petróleo", "B. Banano", "C. Flores", "D. Cafe ", "a");
        Question  pregunta5 = new Question( "¿Cuál es el ave nacional de Colombia?", "Historia de Colombia", "A. El Cóndor de los Andes", "B. Tucán del caribe", "C. El aguila", "D. La golondrina ", "a");

        // Categoría historia de Cultura general

        Question  pregunta6 = new Question( "¿Cuál es el río más largo del mundo?", "Cultura general", "A. El río amazonas", "B. El río nilo", "C. El río danubio", "D. El río Mississippi", "a");
        Question  pregunta7 = new Question( "¿Cuánto duró la guerra de los 100 años?", "Cultura general", "A. 116 años", "B. 100 años", "C. 110 años", "D. 105 años", "a");
        Question  pregunta8 = new Question( "¿Cuál es el deporte más practicado del mundo?", "Cultura general", "A. El fútbol", "B. La natación", "C. El baloncesto", "D. El béisbol", "b");
        Question  pregunta9 = new Question( "¿Cuántos huesos tiene en total un ser humano?", "Cultura general", "A. 180", "B. 400", "C. 200", "D. 206", "d");
        Question  pregunta10 = new Question( "¿En qué año fue el descubrimiento de América?", "Cultura general", "A. 1512", "B. 1482", "C. 1492 ", "D. 1530", "c");

        // Categoría Ciencia Básica

        Question  pregunta11 = new Question( "¿Qué tipo de animales son los murciélagos?", "Ciencia Básica", "A. Mamíferos", "B. Aves", "C. Reptiles", "D. Anfibios", "a");
        Question  pregunta12 = new Question( "¿En la botánica el tomate es?", "Ciencia Básica", "A. una verdura", "B. Una fruta", "C. Una hortaliza", "D. Una legumbre", "b");
        Question  pregunta13 = new Question( "¿Cuál es el nombre de las partículas subatómicas de carga negativa?", "CCiencia Básica", "A. Electrones", "B. Protones", "C. Neutrones", "D. Negatrones", "a");
        Question  pregunta14 = new Question( "¿Cuál es el elemento más abundante de la Tierra?", "Ciencia Básica", "A. El oxígeno", "B. El nitrógeno", "C. El hidrógeno", "D. El agua", "d");
        Question  pregunta15 = new Question( "¿Cuántas patas tiene un arácnido?", "Ciencia Básica", "A. 4 patas", "B. 6 patas", "C. 8 patas", "D. No tiene patas", "c");

        // Categoría Eventos históricos

        Question  pregunta16 = new Question( "¿Cuál fue la causa inmediata de la primera guerra mundial?", "Eventos históricos", "A. 23", "B. 22", "C. 12", "D. 9", "c");
        Question  pregunta17 = new Question( "¿Cuál fue el último emperador romano de Occidente?", "Eventos históricos", "A. Flavio Zenón", "B. Julio Nepote", "C. Marco Aurelio", "D. Rómulo Augusto", "d");
        Question  pregunta18 = new Question( "¿Cuál se considera la mayor contienda bélica de la historia?", "Eventos históricos", "A. La primera Guerra mundial", "B. La segunda Guerra mundial ", "C. La Guerra de Siria", "D. La Guerra Fría", "b");
        Question  pregunta19 = new Question( "¿La caída del muro de Berlín representa además?", "Eventos históricos", "A. El fin de la guerra fría", "B. El fin de la segunda guerra mundial", "C. La unificación de francia en un solo país nuevamente", "D. El fin del capitalismo", "a");
        Question  pregunta20 = new Question( "¿El evento conocido como el asalto de la moneda tuvo lugar en ?", "Eventos históricos", "A. Francia", "B. Chile", "C. Estados unidos", "D. Argentina", "b");

        // Categoría Videojuegos

        Question  pregunta21 = new Question( "¿Qué equipo es campeón actual de League of Legends World Championship, también conocido como Worlds?", "Categoría Videojuegos", "A. SK Telecom T1 ", "B.Edward Gaming", "C. Fnatic", "D.Koi", "b");
        Question  pregunta22 = new Question( "¿Qué jugador rompió en 2018 el récord histórico de súbditos farmeados en una partida de competitivo de League of Legends con un total de 1465?", "Categoría Videojuegos", "A. Werlyb ", "B.Faker ", "C. Rekkles", "D. Teddy", "d");
        Question  pregunta23 = new Question( "¿Cuál es el récord de mayor duración de una partida de League of Legends en el campo competitivo?", "Categoría Videojuegos", "A. Giants vs Fnatic - 104 minutos en 2017", "B. nvictus Gaming vs 9z Team - 98 minutos en 2019", "C. Jin Air vs SKT - 94 minutos en 2018", "D. Mad Lions vs Koi - 86 minutos en 2021", "c");
        Question  pregunta24 = new Question( "¿Cual es el jugador con más partidas competitivas jugados en League of Legends?", "Categoría Videojuegos", "A. Th3Antonio", "B. Faker", "C. Dopa", "D. Perkz", "b");
        Question  pregunta25 = new Question( "¿Qué equipo fue el primer campeón de League of Legends World Championship, también conocido como Worlds?", "Categoría Videojuegos", "A. Fnatic en 2011", "B. PSG Talón en 2011", "C. Furious Gaming en 2010", "D. G2 en 2012", "a");


        ArrayList<Question> nivel1 = new ArrayList<Question>();
        nivel1.add(0, question1);
        nivel1.add(1, question2);
        nivel1.add(2, question3);
        nivel1.add(3, pregunta4);
        nivel1.add(4, pregunta5);

        ArrayList<Question> nivel2 = new ArrayList<Question>();
        nivel2.add(0, pregunta6);
        nivel2.add(1, pregunta7);
        nivel2.add(2, pregunta8);
        nivel2.add(3, pregunta9);
        nivel2.add(4, pregunta10);

        ArrayList<Question> nivel3 = new ArrayList<Question>();
        nivel3.add(0, pregunta11);
        nivel3.add(1, pregunta12);
        nivel3.add(2, pregunta13);
        nivel3.add(3, pregunta14);
        nivel3.add(4, pregunta15);

        ArrayList<Question> nivel4 = new ArrayList<Question>();
        nivel4.add(0, pregunta16);
        nivel4.add(1, pregunta17);
        nivel4.add(2, pregunta18);
        nivel4.add(3, pregunta19);
        nivel4.add(4, pregunta20);

        ArrayList<Question> nivel5 = new ArrayList<Question>();
        nivel5.add(0, pregunta21);
        nivel5.add(1, pregunta22);
        nivel5.add(2, pregunta23);
        nivel5.add(3, pregunta24);
        nivel5.add(4, pregunta25);

        Scanner scanner = new Scanner(System.in);
        Player jugador = new Player();
        Question pregunta = new Question();

        // Iniciar el Juego
        System.out.println("***********************************************************************");
        System.out.println("**********BIENVENIDO AL CONCURSO DE PREGUNTAS Y RESPUESTAS **********");
        System.out.println("Pon a prueba tus conocimientos y gana maravillosos premios");
        System.out.println("");
        System.out.println("Ingresa tu nombre:");
        jugador.setName(scanner.nextLine());
        System.out.println("");
        System.out.println("Bienvenido al juego: " + jugador.getName() );
        System.out.println("La primera categoria de preguntas del juego es Historia de Colombia " +
                "si responde la pregunta de manera acertada usted obtendra $50 dolares " );
        pregunta.fifthRound(nivel1);
        pregunta.secondRound(nivel2);
        pregunta.thirdRound(nivel3);
        pregunta.fourthRound(nivel4);
        pregunta.fifthRound(nivel5);
        pregunta.mapPoints(jugador);
        System.out.println(jugador.getName() +", El dinero ganado en total es: $"+ jugador.getSofkaCoins()+" Gracias por jugar");
        PlayerDAO.createPlayerBD(jugador);
    }
}

