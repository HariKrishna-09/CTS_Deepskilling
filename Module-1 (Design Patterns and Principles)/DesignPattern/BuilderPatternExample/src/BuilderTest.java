
public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder("Intel i9", "32 GB")
                .setStorage("1 TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officePC = new Computer.Builder("Intel i5", "16 GB")
                .setStorage("512 GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        Computer basicPC = new Computer.Builder("AMD Ryzen 3", "8 GB")
                .build();

        gamingPC.display();
        officePC.display();
        basicPC.display();
    }
}
