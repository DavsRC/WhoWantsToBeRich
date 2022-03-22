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

    public Question(String description, String category, String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
        this.description = description;
        this.category = category;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
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

        System.out.println("For a total of $50 SofkaKoins select the correct answer");
        System.out.println("");
        System.out.println(question.getDescription()+" This question belongs to the category of: "+question.getCategory());

        System.out.println(question.getOptionA());
        System.out.println(question.getOptionB());
        System.out.println(question.getOptionC());
        System.out.println(question.getOptionD());

        question.setPlayerAnswer(scanner.nextLine());

        if(question.getPlayerAnswer().equals(question.getCorrectAnswer())){
            System.out.println("** Congratulations --Correct Answer-- **");
            sumPoints();
        }else{
            System.out.println("** Your answer is incorrect, game over **");
            System.exit(0);
        }
    }

    public void keepPlaying(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have a total of: "+ getPoints() +" SofkaKoins");
        System.out.println("Do you want to continue playing?, if the next question you answer incorrectly your SofkaKoins will be $0 and the game will have ended");
        System.out.println("If you withdraw at this time you can take what you have earned so far");
        System.out.println("If you want to continue write: yes, if you want to withdraw write: no");
        setNext(scanner.next());
        if(getNext().equalsIgnoreCase("yes")){
            System.out.println("You have decided to continue");
        }else{
            System.out.println("You have withdraw with a total of:" + getPoints() + " SofkaKoins");
            System.exit(0);
        }
    }

    public void firstRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("You have withdrawn from the game, you take a total of "+ getSofkaCoins()+ " SofkaKoins");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("The game is over");
            }
        }
    }

    public void secondRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("You have withdrawn from the game, you take a total of "+ getSofkaCoins()+ " SofkaKoins");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("The game is over");
            }
        }
    }

    public void thirdRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("You have withdrawn from the game, you take a total of "+ getSofkaCoins()+ " SofkaKoins");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("The game is over");
            }
        }
    }

    public void fourthRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if (getPlayerAnswer() == getCorrectAnswer()){
            keepPlaying();
            if(getPlayerAnswer() == getCorrectAnswer () & getNext().equalsIgnoreCase("no")){
                System.out.println("TYou have withdrawn from the game, you take a total of "+ getSofkaCoins()+ " SofkaKoins");
            }
        }else {
            if(getPlayerAnswer() != getCorrectAnswer()){
                setPoints(0);
                System.out.println("The game is over");
            }
        }
    }

    public void fifthRound(ArrayList<Question> questions){
        makeQuestion(questions.get(generateRandomNumber()));
        if(getPlayerAnswer() == getCorrectAnswer()){
            System.out.println("You won the game");
        }
        else {
            if (getPlayerAnswer() != getCorrectAnswer()) {
                setPoints(0);
                System.out.println("The game is over");
            }
        }
    }

    public void mapPoints(Player player){
        int counter;
        counter = getPoints();
        player.setSofkaCoins(counter);
    }
}
