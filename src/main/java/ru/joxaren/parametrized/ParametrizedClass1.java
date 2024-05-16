package ru.joxaren.parametrized;

public class ParametrizedClass1 <T>{

    public T parameter;

    ParametrizedClass1(T parameter){
        this.parameter = parameter;
    }


    @Override
    public String toString(){
        return "[" + parameter + "]";
    }

}
