package test;

public class test {
    public static void main(String[] args) {
        var result = calc(Operation.ADD, 0, 1); // actual parameters
        System.out.println(result);
    }

    private enum Operation {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    private static float calc(Operation operation, float value1, float value2) { // formal parameters
        float result = 0;
        if (operation == Operation.ADD)      result = value1 + value2;
        if (operation == Operation.SUBTRACT) result = value1 - value2;
        if (operation == Operation.MULTIPLY) result = value1 * value2;
        if (operation == Operation.DIVIDE)   result = value1 / value2;
        return result;
    }

    private static void debugger(){}
}
