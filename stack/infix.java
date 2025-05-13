import java.util.*;

public class infix {
    public static void main(String[] args) {
        String str = "3 + 5 * ( 2 - 8 )";
        System.out.println("Infix Expression: " + str);

        // creating a stack to hold operator
        Stack<Character> op = new Stack<>();

        // creating a stack to hold numbers
        Stack<Integer> val = new Stack<>();

        // traversing of stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // find ascii value
            int ascii = (int) ch;

            // if character is a number
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);

                // is empty then
            } else if (op.isEmpty())
                op.push(ch);
            else {
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '-')
                        val.push(v1 - v2);
                    if (op.peek() == '+')
                        val.push(v1 + v2);
                    if (op.peek() == '*')
                        val.push(v1 * v2);
                    if (op.peek() == '/')
                        val.push(v1 / v2);
                    op.pop();
                    op.push(ch);

                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*')
                            val.push(v1 * v2);
                        if (op.peek() == '/')
                            val.push(v1 / v2);
                        op.pop();
                        op.push(ch);
                    } else
                        op.push(ch);

                }
            }
        }

        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();

            if (op.peek() == '-')
                val.push(v1 - v2);
            if (op.peek() == '+')
                val.push(v1 + v2);
            if (op.peek() == '*')
                val.push(v1 * v2);
            if (op.peek() == '/')
                val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
