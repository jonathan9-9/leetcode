public class SmartAppliance {
    private String description;
    private String id;
    private int price;
    private OperatingSystem OS;
    private boolean voiceActivated;

    private static final boolean VOICE_ACTIVATED = true;

    public enum OperatingSystem {
        AMZ_ALEX_A, APPLE_HOME_KIT, GOOGLE_ASSISTANT
    };

    public SmartAppliance(String description, String id, int price, OperatingSystem OS, boolean voiceActivated) {
        this.description = description;
        this.id = id;
        this.price = price;
        this.OS = OS;
        this.voiceActivated = voiceActivated;
    }

    public SmartAppliance(String description, String id, int price, OperatingSystem os) {
        this(description, id, price, os, VOICE_ACTIVATED);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOS(OperatingSystem os) {
        this.OS = os;
    }

    public void setVoiceActivated(boolean voiceActivated) {
        this.voiceActivated = voiceActivated;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public OperatingSystem getOS() {
        return OS;
    }

    public boolean getVoiceActivated() {
        return voiceActivated;
    }

    public String toString() {
        String output = description + "\n\t" +
                "ID: " + id + "\t" + "Price: " + price + "\n\t" + "OS: " + OS + "\t" + "Voice-Activation: "
                + voiceActivated;
        return output;
    }

    public boolean canBeFeatured(OperatingSystem OS, int maxPrice) {
        if (getOS().equals(OS) && price <= maxPrice) {
            return true;
        }
        return false;
    }

    public static boolean isCompatible(SmartAppliance applianceOne, SmartAppliance applianceTwo) {
        return applianceOne.OS == applianceTwo.OS && applianceOne.voiceActivated == applianceTwo.voiceActivated;
    }
}
