
public class Computer {

    // Required Parameters
    private String cpu;
    private String ram;

    // Optional Parameters
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private Constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Display Method
    public void display() {
        System.out.println("Computer Configuration");
        System.out.println("----------------------");
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram);
        System.out.println("Storage : " + storage);
        System.out.println("Graphics Card : " + graphicsCard);
        System.out.println("Operating System : " + operatingSystem);
        System.out.println();
    }

    // Static Builder Class
    public static class Builder {

        private String cpu;
        private String ram;
        private String storage = "Not Selected";
        private String graphicsCard = "Not Selected";
        private String operatingSystem = "Not Installed";

        // Constructor
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
