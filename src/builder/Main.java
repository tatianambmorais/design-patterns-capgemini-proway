package builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel Core I9")
                .ram(16)
                .ssd(50)
                .build();

        computer.showConfiguration();

    }
    }