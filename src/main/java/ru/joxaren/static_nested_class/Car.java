package ru.joxaren.static_nested_class;

public class Car {

    String color;
    int doorsCount;
    Engine engine;

    private static String var = "Это статичная приватная переменная класса Engine";

    public Car(String color, int doorsCount, Engine engine) {
        this.color = color;
        this.doorsCount = doorsCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorsCount=" + doorsCount +
                ", engine=" + engine +
                '}';
    }

    public void showCountOfEngines(Engine engine){
        System.out.println(Engine.counterOfEngines);
        System.out.println(engine.horsePower);
    }

    public static class Engine{
        private int horsePower;
        private static int counterOfEngines;

        public Engine(int horsePower) {
            System.out.println(var);
            this.horsePower = horsePower;
            counterOfEngines++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
