import java.util.Stack;

public class Pila {
    private Stack<Character> stack;

    public Pila() {
        stack = new Stack<>();
    }

    public void apilar(Character c) {
        stack.push(c);
    }

    public Character desapilar() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public boolean estaVacia() {
        return stack.isEmpty();
    }
}
