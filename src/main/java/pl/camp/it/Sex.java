package pl.camp.it;

public enum Sex implements Interface {
    MAN(1, "Men"),
    WOMAN(2, "Woman"),
    OTHER(3, "Other");

    int i;
    String value;

    Sex(int i, String value) {
        this.i = i;
        this.value = value;
    }

    public void cos() {
        System.out.println("Cos z enuma !!");
    }

    @Override
    public void a() {

    }
}
