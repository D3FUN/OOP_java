package OOP_java.lab_1;

public class Violin extends StringInstrument {
    private String bowMaterial;
    private double sizeInCentimeters;
    private boolean hasShoulderRest;

    public Violin(
        String name,
        String manufacturer,
        int year,
        int stringCount,
        String stringMaterial,
        boolean tuned,
        String bowMaterial,
        double sizeInCentimeters,
        boolean hasShoulderRest
    ) {
        super(name, manufacturer, year, stringCount, stringMaterial, tuned);
        setBowMaterial(bowMaterial);
        setSizeInCentimeters(sizeInCentimeters);
        setHasShoulderRest(hasShoulderRest);
    }

    public String getBowMaterial() {
        return bowMaterial;
    }

    public void setBowMaterial(String bowMaterial) {
        if (bowMaterial != null && !bowMaterial.isBlank()) {
            this.bowMaterial = bowMaterial;
        }
    }

    public double getSizeInCentimeters() {
        return sizeInCentimeters;
    }

    public void setSizeInCentimeters(double sizeInCentimeters) {
        if (sizeInCentimeters > 0) {
            this.sizeInCentimeters = sizeInCentimeters;
        }
    }

    public boolean hasShoulderRest() {
        return hasShoulderRest;
    }

    public void setHasShoulderRest(boolean hasShoulderRest) {
        this.hasShoulderRest = hasShoulderRest;
    }

    public void playWithBow() {
        if (isTuned()) {
            System.out.println(getName() + " играет смычком из материала " + bowMaterial);
        } else {
            System.out.println(getName() + " сначала нужно настроить.");
        }
    }

    public void playPizzicato() {
        if (isTuned()) {
            System.out.println(getName() + " играет пиццикато.");
        } else {
            System.out.println(getName() + " сначала нужно настроить.");
        }
    }

    public void attachShoulderRest() {
        if (hasShoulderRest) {
            System.out.println("Плечевой упор уже установлен.");
        } else {
            setHasShoulderRest(true);
            System.out.println("Плечевой упор установлен.");
        }
    }
}
