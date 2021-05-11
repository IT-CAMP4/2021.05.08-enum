package pl.camp.it;

public enum Console {
    PLAYSTATION5("Intel", "NVidia", 825, "Sony"),
    XBOXSERIESX("Ryzen", "Radeon", 500, "Microsoft"),
    NINTENDOSWITCH("ksjhdf", "jsahdgf", 32, "Nintendo");

    Console(String cpu, String graphicCard, int hdd, String brand) {
        this.cpu = cpu;
        this.graphicCard = graphicCard;
        this.hdd = hdd;
        this.brand = brand;
    }

    private String cpu;
    private String graphicCard;
    private int hdd;
    private String brand;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Console{" +
                "cpu='" + cpu + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", hdd=" + hdd +
                ", brand='" + brand + '\'' +
                '}';
    }
}
