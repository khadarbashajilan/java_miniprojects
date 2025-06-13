import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score=0;
        int guess;
        // Ignore the questions & options some of them are not full questions
         String[] questions = {
            "What is the correct way to update the state using the `useState` hook in React?",
            "What will be the output of the following JavaScript closure code?",
            "What is the output of the given Java String immutability code?",
            "What happens if we pass an empty dependency array `[]` in `useEffect`?",
            "What is the order of console logs in the JavaScript event loop example?"
        };

        String[][] options = {
            {"1. count = count + 1;\n", "2. setCount(count++);\n", "3. setCount(prevCount -> prevCount + 1);\n", "4. this.setState({ count: count + 1 });\n"},
            {"1. undefined\n", "2. 10\n", "3. ReferenceError\n", "4. null\n"},
            {"1. Hello World\n", "2. Hello\n", "3. World\n", "4. Compilation Error\n"},
            {"1. Runs on every render\n", "2. Runs only once after initial render\n", "3. Never runs\n", "4. Runs only when props change\n"},
            {"1. 1, 2, 3\n", "2. 1, 3, 2\n", "3. 3, 1, 2\n", "4. 2, 1, 3\n"}
        };
        int[] answers = {2, 1, 1, 1, 1}; // 0-based indices of correct options

        
        
                System.out.println("*************");
                System.out.println("QUIZ GAME");
                System.out.println("*************");

        for(int i=0; i<questions.length; i++){
            System.out.print(questions[i]+"\n");

            for(String ele : options[i]){
                System.out.print(ele);
            }

            System.out.print("Enter ur guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                score++;
                System.out.println("*************");
                System.out.println("CORRECT!");
                System.out.println("*************");
            }else{
                System.out.println("*************");
                System.out.println("WRONG!");
                System.out.println("*************");

            }

        }

        System.out.print("Total Score "+score+" / "+questions.length);

}
}
