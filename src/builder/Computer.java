package builder;

public class Computer {
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int ssd;
    private final String motherBoard;
    private final String cooler;

    Computer(Builder builder){
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.motherBoard = builder.motherBoard;
        this.cooler = builder.cooler;
    }

    public static class Builder {
        private String cpu;
        private String gpu;
        private int ram;
        private int ssd;
        private String motherBoard;
        private String cooler;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder gpu(String gpu){
            this.gpu = gpu;
            return this;
        }

        public Builder ram(int ram){
            this.ram = ram;
            return this;
        }

        public Builder ssd(int ssd){
            this.ssd = ssd;
            return this;
        }

        public Builder motherboard(String motherBoard){
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder cooler(String cooler){
            this.cooler = cooler;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void showConfiguration(){
        System.out.println("Configurações da máquina: ");
        if (cpu != null) System.out.println("CPU: " + cpu);
        if (gpu != null) System.out.println("GPU: " + gpu);
        if (ram > 0) System.out.println("RAM: " + ram + "GB");
        if (ssd > 0) System.out.println("SSD: " + ssd + "GB");
        if (motherBoard != null) System.out.println("Placa Mãe: " + motherBoard);
        if (cooler != null) System.out.println("Cooler: " + cooler);


    }
}
