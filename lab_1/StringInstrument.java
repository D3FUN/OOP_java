
public class StringInstrument extends MusicalInstrument {
    private int stringCount;
    private String stringMaterial;
    private boolean tuned;

    public StringInstrument(
        String name,
        String manufacturer,
        int year,
        int stringCount,
        String stringMaterial,
        boolean tuned
    ) {
        super(name, manufacturer, year);
        setStringCount(stringCount);
        setStringMaterial(stringMaterial);
        setTuned(tuned);
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        if (stringCount > 0) {
            this.stringCount = stringCount;
        }
    }

    public String getStringMaterial() {
        return stringMaterial;
    }

    public void setStringMaterial(String stringMaterial) {
        if (stringMaterial != null && !stringMaterial.isBlank()) {
            this.stringMaterial = stringMaterial;
        }
    }

    public boolean isTuned() {
        return tuned;
    }

    public void setTuned(boolean tuned) {
        this.tuned = tuned;
    }

    public void tune() {
        tuned = true;
        System.out.println("Инструмент " + getName() + " настроен.");
    }

    public void loosenStrings() {
        tuned = false;
        System.out.println("Струны инструмента " + getName() + " ослаблены.");
    }

    public void replaceStrings(String newMaterial) {
        setStringMaterial(newMaterial);
        setTuned(false);
        System.out.println("На инструменте " + getName() + " установлены струны из материала " + stringMaterial);
    }
}
