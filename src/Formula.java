public class Formula {
    private Pila pila;
    private String expresion;

    public Formula() {
        this.pila = new Pila();
    }

    public void ingresarExpresion(String expresion) {
        this.expresion = expresion;
    }

    public boolean validarExpresion() { // Método para validar la expresión
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            switch (c) { // Switch para evaluar cada caracter de la expresión
                case '(':
                case '[':
                case '{':
                    pila.apilar(c); // Si es un caracter de apertura, se apila
                    break;
                case ')':
                    if (pila.desapilar() != '(') return false;
                    break;
                case ']':
                    if (pila.desapilar() != '[') return false;
                    break;
                case '}':
                    if (pila.desapilar() != '{') return false;
                    break;
            }
        }
        return pila.estaVacia(); // Si la pila está vacía, la expresión es válida
    }

    public int contarElementosApertura() {
        return (int) expresion.chars().filter(c -> c == '(' || c == '[' || c == '{').count(); // Se cuentan los elementos de apertura
    }

    public int contarElementosCierre() {
        return (int) expresion.chars().filter(c -> c == ')' || c == ']' || c == '}').count(); //  Se cuentan los elementos de cierre
    }
}
