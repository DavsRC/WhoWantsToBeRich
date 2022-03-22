package Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Question extends Player{

    private String description;
    private String category;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;
    private String playerAnswer;
    private int points;
    private String next;

    public Question() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getPlayerAnswer() {
        return playerAnswer;
    }

    public void setPlayerAnswer(String playerAnswer) {
        this.playerAnswer = playerAnswer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void sumPoints(){
        int counter = getPoints();
        counter += 50;
        setPoints(counter);
    }

    public int generateRandomNumber(){
        int randomNumber = (int)(Math.random()*4+0);
        return randomNumber;
    }

    public void makeQuestion(Question question){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por un total de $50 dolares seleccione la respuesta correcta");
        System.out.println("");
        System.out.println(question.getDescription()+" Esta question pertenece a la categoría de: "+question.getCategory());

        System.out.println(question.getOptionA());
        System.out.println(question.getOptionB());
        System.out.println(question.getOptionC());
        System.out.println(question.getOptionD());

        question.setPlayerAnswer(scanner.nextLine());

        if(question.getPlayerAnswer().equals(question.getCorrectAnswer())){
            System.out.println("** Felicitaciones --Respuesta Correcta-- **");
            sumPoints();
        }else{
            System.out.println("** Su respuesta es incorrecta, fin del juego **");
            System.exit(0);
        }
    }

    public void keepPlaying(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tienes un total de: "+ getPoints() +" dólares");
        System.out.println("¿Deseas continuar jugando?, si la siguiente pregunta la respondes de forma incorrecta tu dinero será 0$ y habrá finalizado el juego");
        System.out.println("Si te retiras en este momento podras llevarte lo que haz ganado hasta ahora");
        System.out.println("Si deseas continuar escribe: yes, si deseas retirarte escribe: no");
        setNext(scanner.next());
        if(getNext().equalsIgnoreCase("yes")){
            System.out.println("Has decidido continuar");
        }else{
            System.out.println("Te has retirado con un total de:" + getPoints() + " dólares");
            System.exit(0);
        }
    }

    public void firstRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("Te has retirado del juego, te llevas un total de "+ getSofkaCoins()+ " Puntos");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("La partida ha finalizado");
            }
        }
    }

    public void secondRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("Te has retirado del juego, te llevas un total de "+ getSofkaCoins()+ " Puntos");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("La partida ha finalizado");
            }
        }
    }

    public void thirdRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("Te has retirado del juego, te llevas un total de "+ getSofkaCoins()+ " Puntos");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("La partida ha finalizado");
            }
        }
    }

    public void fourthRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("Te has retirado del juego, te llevas un total de "+ getSofkaCoins()+ " Puntos");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("La partida ha finalizado");
            }
        }
    }

    public void fifthRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if(getPlayerAnswer() == getCorrectAnswer()){
            System.out.println("Has ganado el juego");
        }
        else {
            if (getPlayerAnswer() != getCorrectAnswer()) {
                setPoints(0);
                System.out.println("La partida ha finalizado");
            }
        }
    }

    public void mapPoints(Player player){
        int counter;
        counter = getPoints();
        player.setSofkaCoins(counter);
    }
}
