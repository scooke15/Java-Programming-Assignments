package M04.Assignment1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class MatchGroupingSymbols {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MatchGroupingSymbols <source-file>");
            System.exit(0);
        }


        File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("The file " + args[0] + " does not exist!");
			System.exit(1);
		}


        try (Scanner scanner = new Scanner(file)) {

            Stack<Character> stack = new Stack<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                for (char ch : line.toCharArray()) {
                    if (ch == '(' || ch == '{' || ch == '[') {
                        stack.push(ch);
                    } else if (ch == ')' || ch == '}' || ch == ']') {
                        if (stack.isEmpty()) {
                            System.out.println("Unmatched closing symbol: " + ch);
                            return;
                        }

                        char open = stack.pop();

                        if (!isMatchingPair(open, ch)) {
                            System.out.println("Mismatched symbols: " + open + " and " + ch);
                        }
                    }
                }
            }

            if (stack.isEmpty()) {
                System.out.println("All grouping symbols are matched correctly.");
            } else {
                System.out.println("Unmatched symbols.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
        }
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

