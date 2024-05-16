package ru.joxaren.parametrized;

public class ParametrizedClass2 <V1, V2>{

    private V1 parameter1;
    private V2 parameter2;

    public ParametrizedClass2(V1 parameter1, V2 parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }

    public V1 getParameter1() {
        return parameter1;
    }

    public V2 getParameter2() {
        return parameter2;
    }
}
