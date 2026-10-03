public class MusicalInstrument {
    private String name;
    private String manufacturer;
    private int year;

    public MusicalInstrument(String name, String manufacturer, int year) {
        setName(name);
        setManufacturer(manufacturer);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if (manufacturer != null && !manufacturer.isBlank()) {
            this.manufacturer = manufacturer;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    public void play() {
        System.out.println(name + " начинает играть.");
    }

    public void stopPlaying() {
        System.out.println(name + " перестает играть.");
    }

    public void printInfo() {
        System.out.println("Инструмент " + name + " производитель " + manufacturer + " год " + year);
    }
}
