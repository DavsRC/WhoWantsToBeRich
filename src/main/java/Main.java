import Data.PlayerDAO;
import Entity.Player;
import Entity.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Category Administrative Processes

        Question question1 = new Question("It is the communication that occurs in the universe of society, of the company towards the general public, its potential customers and suppliers.", "Administrative Processes", "A. Social communication", "B. International communication", "C. External communication", "D. Organizational communication", "c");
        Question  question2 = new Question( "It is the communication that follows in an official chain of command or that someone requires to perform a job", "Administrative Processes", "A. Hierarchical communication", "B. Formal communication", "C. Informal communication", "D. Upward communication", "d");
        Question  question3 = new Question( "Which of these is not an objective of the audits?", "Administrative Processes", "A. Promote the proper use of resources", "B. Promote improvement", "C. Promote transparency", "D. Promote discipline", "d");
        Question  question4 = new Question( "It is the process of influencing people so that they contribute to organizational and group goals (Koontz & Weihrich, 2013).", "Administrative Processes", "A. Leadership", "B. Management", "C. Empower", "D. Coaching ", "a");
        Question  question5 = new Question( "Which of these is not a type of control?", "Administrative Processes", "A. Constant control", "B. Preventive control", "C. Structural control", "D. Corrective control", "c");

        // Category Object-oriented programming

        Question  question6 = new Question( "What is the description that you think best defines the concept of 'class' in object-oriented programming?", "Object-oriented programming", "A. It is a concept similar to that of String.", "B. It is a sequentially ordered category of data", "C. It is a particular type of variable", "D. It is a model or template from which we create objects", "d");
        Question  question7 = new Question( "When should you mark a method as final?", "Object-oriented programming", "A. When I want to reassign it", "B. When the author of the parent method wants to guarantee a very precise behavior.", "C. When I want to hide it.", "D. Never", "b");
        Question  question8 = new Question( "What method should I invoke to run a program in Java?", "Object-oriented programming", "A. for", "B. start", "C. do", "D. main", "d");
        Question  question9 = new Question( "What is an object in java?", "Object-oriented programming", "A. It is a grouping of data and functions", "B. Is a set of function declarations", "C. It is a grouping that ends an inheritance chain", "D. An instance of a class", "d");
        Question  question10 = new Question( "What does it mean to instantiate a class?", "Object-oriented programming", "A. Connect two classes to each other", "B. Duplicate a class", "C. Delete a class ", "D. Create an object from the class", "d");

        // Category Automata, Grammars and Languages

        Question  question11 = new Question( "When we talk about minimization of an automaton, it refers to:", "Automata, Grammars and Languages", "A. Obtaining an automaton with as few states as possible.", "B. Get an automaton to define another language", "C. Decrease the language strings to be read in the automaton", "D. none of the above", "a");
        Question  question12 = new Question( "The evolution of machines (computers) is mainly due to:", "Automata, Grammars and Languages", "A. Its application to solve context problems in programming languages.", "B. Your application to solve Mealy problems.", "C. Its application to solve infinite and complex problems.", "D. Its application to solve scientific problems.", "d");
        Question  question13 = new Question( "A stack is a storage device that follows the principle of:", "Automata, Grammars and Languages", "A. The last to enter the first to leave", "B. The first to enter the last and exit", "C. The first to enter the first to leave", "D. The last to enter the last to leave", "a");
        Question  question14 = new Question( "In a general context a Language can be defined as:", "Automata, Grammars and Languages", "A. A System of Conventional Symbols, spoken or written with which we communicate", "B. Meaning of the strings that compose it", "C. Set of instructions indicating actions to perform", "D. Study of the rules and principles that regulate its use", "a");
        Question  question15 = new Question( "Indicate which of the following statements is true:", "Automata, Grammars and Languages", "A. Turing machines and stack automata are finite automata.", "B. Finite automata can only accept finite languages.", "C. Finite automata have a finite number of states", "D. none of the above", "c");

        // Category Database Fundamentals

        Question  question16 = new Question( "When talking about keys in the relational model: ", "Database Fundamentals", "A. A foreign key in a relation R can also be the primary key of R.", "B. the primary key will never be a single field in the table", "C. The relational model never uses keys in its relationships", "D. In a table it is not necessary to carry a primary key", "a");
        Question  question17 = new Question( "What are the user types in the databases?", "Database Fundamentals", "A. Programmers, designers, database administrators and auditors.", "B. End users, programmers, designers, and database administrators", "C. Designers, programmers, end users and testers", "D. End users, programmers and designers", "b");
        Question  question18 = new Question( "What is the set of fields for the same object in the table called?", "Database Fundamentals", "A. Records or rows.", "B. attribute", "C. column", "D. none of the above", "a");
        Question  question19 = new Question( "What types of relationships exist in entity-relationship diagram?", "Database Fundamentals", "A. Many to many.", "B. one by one", "C. One to many and vice versa.", "D. All the previous ones", "d");
        Question  question20 = new Question( "Role of the DBA", "Database Fundamentals", "A. Manage concurrency.", "B. Enter data into the databases", "C. Operating system configuration", "D. Perform maintenance on the physical network.", "a");

        // Category Web Engineering

        Question  question21 = new Question( "To integrate into web projects, what types of images are used?", "Web Engineering", "A. JPG, PNG, GIF", "B. JPG, GIF, PPT", "C. PNG, TIF, PSD", "D. PSD, PDF, JPG", "a");
        Question  question22 = new Question( "Which of the following classes is not used to format text in Bootstrap?", "Web Engineering", "A. text-warning ", "B. text-primary", "C. text-dange", "D. All are used to format the text.", "d");
        Question  question23 = new Question( "According to the web design pyramid, the last pillar refers to:", "Web Engineering", "A. Content design", "B. Interface design", "C. Architecture design", "D. Diseño de los componentes", "c");
        Question  question24 = new Question( "What class can we use to highlight a text in Bootstrap?", "Web Engineering", "A. highlight", "B. stand-out", "C. foreground", "D. lead", "d");
        Question  question25 = new Question( "It will be used as a version control system for the source code of the Web application", "Web Engineering", "A. File system", "B. Git System", "C. Binnacle", "D. Database", "b");


        ArrayList<Question> nivel1 = new ArrayList<Question>();
        nivel1.add(0, question1);
        nivel1.add(1, question2);
        nivel1.add(2, question3);
        nivel1.add(3, question4);
        nivel1.add(4, question5);

        ArrayList<Question> nivel2 = new ArrayList<Question>();
        nivel2.add(0, question6);
        nivel2.add(1, question7);
        nivel2.add(2, question8);
        nivel2.add(3, question9);
        nivel2.add(4, question10);

        ArrayList<Question> nivel3 = new ArrayList<Question>();
        nivel3.add(0, question11);
        nivel3.add(1, question12);
        nivel3.add(2, question13);
        nivel3.add(3, question14);
        nivel3.add(4, question15);

        ArrayList<Question> nivel4 = new ArrayList<Question>();
        nivel4.add(0, question16);
        nivel4.add(1, question17);
        nivel4.add(2, question18);
        nivel4.add(3, question19);
        nivel4.add(4, question20);

        ArrayList<Question> nivel5 = new ArrayList<Question>();
        nivel5.add(0, question21);
        nivel5.add(1, question22);
        nivel5.add(2, question23);
        nivel5.add(3, question24);
        nivel5.add(4, question25);

        Scanner scanner = new Scanner(System.in);
        Player jugador = new Player();
        Question pregunta = new Question();

        // Game Starting
        System.out.println("***********************************************************************");
        System.out.println("********** WELCOME TO THE GAME WHO WANTS TO BE RICH **********");
        System.out.println("Test your knowledge and win wonderful prizes");
        System.out.println("");
        System.out.println("Enter your name:");
        jugador.setName(scanner.nextLine());
        System.out.println("");
        System.out.println("Welcome to the game: " + jugador.getName() );
        System.out.println("The first category of game questions is Administrative Processes " +
                "if you answer the question correctly you will get 50 SofkaKoins " );
        pregunta.fifthRound(nivel1);
        pregunta.secondRound(nivel2);
        pregunta.thirdRound(nivel3);
        pregunta.fourthRound(nivel4);
        pregunta.fifthRound(nivel5);
        pregunta.mapPoints(jugador);
        System.out.println(jugador.getName() +", The SofkaKoins earned in total is: $"+ jugador.getSofkaCoins()+" Thanks for playing");
        PlayerDAO.createPlayerBD(jugador);
    }
}

