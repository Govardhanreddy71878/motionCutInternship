package org.example;
public class CricketGame {
    // The current state of the game
    private GameState gameState;
    // The game loop
    public void run() {
        while (true) {
            int choice = 0;     // Update the game state
            gameState.update(choice);
            // Render the graphics
            gameState.render();
            // Handle user input
            String[] bowlers = new String[0];
            choice = getPlayerChoice(bowlers);
            // Handle the player's decision
            gameState.handleDecision(choice);
            // Check if the game is over
            if (gameState.isGameOver()) {break;}
        }
    }
    // Get the player's choice
    private int getPlayerChoice(String[] bowlers) {
        System.out.println("Please enter your choice:");
        String input = System.console().readLine();
        // Validate the input
        int choice;
        try {choice = Integer.parseInt(input);}
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            return getPlayerChoice(bowlers);
        }
        // Return the player's choice
        return choice;
    }
    // Handle the player's decision
    private void handleDecision(int choice) {
        switch (choice) {
            case 1 -> {
                // Bat
                // Display a list of shots that the player can choose from
                String[] shots = {"Drive", "Pull", "Hook", "Cut", "Sweep"};
                int shotChoice = getPlayerChoice(shots);

                // Handle the player's shot choice
                handleShotChoice(shotChoice);
            }
            case 2 -> {
                // Bowl
                // Display a list of bowlers that the player can choose from
                String[] bowlers = {"Fast bowler", "Medium pacer", "Spinner"};
                int bowlerChoice = getPlayerChoice(bowlers);
                // Handle the player's bowler choice
                handleBowlerChoice(bowlerChoice);
            }
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }
        // Update the game state based on the player's decision
        gameState.update(choice);
    }
    // Handle the player's shot choice
    private void handleShotChoice(int shotChoice) {
         //Implementing the shot handling here
        handleShotChoice(int shotChoice);
    }
    // Handle the player's bowler choice
    private void handleBowlerChoice(int bowlerChoice) {
        //Implementing the bowler handling here
        handleBowlerChoice(int bowlerChoice);
    }
    // The main method
    public static void main(String[] args) {
        CricketGame game = new CricketGame();
        game.run();
    }
}
class GameState {
    private int battingScore;
    private int wicketsLost;
    private Bowler bowler;
    private boolean gameOver;
    // Constructor
    public GameState() {
        battingScore = 0;
        wicketsLost = 0;
        gameOver = false;
        // Initialize other game state variables as needed
    }
    // Getters and setters for game state variables
    public void update(int choice) {
        // Implement the game logic based on the user's choice
        switch (choice) {
            case 1: // Bat
                // Handle batting logic
                int runsScored = handleBatting();
                battingScore += runsScored;
                break;
            case 2: // Bowl
                // Handle bowling logic
                int wicketsTaken = handleBowling();
                wicketsLost += wicketsTaken;
                break;
            default:
                System.out.println("Invalid choice.");
        }

        // Check if the game is over
        if (wicketsLost >= MAX_WICKETS || battingScore >= TARGET_SCORE) {
            gameOver = true;
        }
    }
    public void render() {
        // Implement the graphics rendering here
        System.out.println("Current Score: " + battingScore);
        System.out.println("Wickets Lost: " + wicketsLost);
        // Display other relevant information
    }
    public void handleDecision(int choice) {
        switch (choice) {
            case 1: // Bat
                // Implement decision handling for batting
                System.out.println("You chose to bat. Select a shot type:");
                System.out.println("1. Drive");
                System.out.println("2. Pull");
                System.out.println("3. Hook");
                System.out.println("4. Cut");
                System.out.println("5. Sweep");
                int shotChoice = getPlayerChoice(); // Implement getPlayerChoice() method to get user's choice
                int runsScored = handleBatting(shotChoice);
                System.out.println("You scored " + runsScored + " runs.");
                break;

            case 2: // Bowl
                // Implement decision handling for bowling
                System.out.println("You chose to bowl. Select a delivery type:");
                System.out.println("1. Yorker");
                System.out.println("2. Bouncer");
                System.out.println("3. Off-spin");
                System.out.println("4. Leg-spin");
                int deliveryChoice = getPlayerChoice(); // Implement getPlayerChoice() method to get user's choice
                int wicketsTaken = handleBowling(deliveryChoice);
                System.out.println("You took " + wicketsTaken + " wickets.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    private int handleBatting(int shotChoice) {
        // Implement batting logic (e.g., user selects a shot type and calculate runs scored)
        // Replace this with your actual logic
        int runsScored = 0;
        switch (shotChoice) {
            case 1: // Drive
                runsScored = 4; // Example: A drive results in 4 runs
                break;
            case 2: // Pull
                runsScored = 6; // Example: A pull results in 6 runs
                break;
            // Implement other shot types
        }
        return runsScored;
    }
    private int handleBowling(int deliveryChoice) {
        // Implement bowling logic (e.g., user selects a delivery type and calculate wickets taken)
        // Replace this with your actual logic
        int wicketsTaken = 0;
        switch (deliveryChoice) {
            case 1: // Yorker
                wicketsTaken = 1; // Example: A Yorker takes 1 wicket
                break;
            case 2: // Bouncer
                wicketsTaken = 2; // Example: A bouncer takes 2 wickets
                break;
            // Implement other delivery types
        }
        return wicketsTaken;
    }

}
