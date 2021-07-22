package sortingForObject.model;

public class Phone implements Comparable<Phone> {
    protected String model;
    protected String version;
    protected int year;
    protected int price;

    public Phone(String model, String version, int year, int price) {
        this.model = model;
        this.version = version;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder("{").append(model)
                .append(",")
                .append(version)
                .append(",")
                .append(year)
                .append(",")
                .append(price)
                .append("}").toString();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Phone o) {
        return this.getPrice() - o.getPrice();
    }
}
