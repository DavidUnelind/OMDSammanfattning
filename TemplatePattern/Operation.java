package TemplatePattern;

abstract class Operation {
    public int calculate(int a, int b) {
        return calculateWithOperation(a, b);
    }

    abstract int calculateWithOperation(int a, int b);
}