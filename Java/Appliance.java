
public class Appliance {

    private String description;
    private String id;
    private int price; // using an int for simplicity

    public Appliance(String description, String id, int price) {
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return description +
                "\n\tID: " + id + "\t\tPrice: $" + price;
    }

    private boolean equalsIgnoreCase(String string1, String string2) {
        return string1 != null && string1.equalsIgnoreCase(string2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Appliance other = (Appliance) obj;

        return price == other.price && equalsIgnoreCase(description, other.description) &&
                equalsIgnoreCase(id, other.id);
    }
}
