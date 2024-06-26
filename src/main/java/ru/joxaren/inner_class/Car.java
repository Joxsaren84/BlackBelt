package ru.joxaren.inner_class;

public class Car {

    String color;
    int doorsCount;
    Engine engine;

    public Car(String color, int doorsCount, int horsePower) {
        this.color = color;
        this.doorsCount = doorsCount;
        this.engine = this.new Engine(horsePower);
    }

    public Car(String color, int doorsCount) {
        this.color = color;
        this.doorsCount = doorsCount;
    }

    public void setEngine(Engine engine){
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

    public class Engine{
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
