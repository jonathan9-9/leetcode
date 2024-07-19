public class SmartAppliance {
    private String description;
    private String id;
    private int price;
    private OperatingSystem os;
    private boolean voiceActivated;

    private static final boolean VOICE_ACTIVATED = true;

    public enum OperatingSystem {
        AMZ_ALEX_A, APPLE_HOME_KIT, GOOGLE_ASSISTANT
    };

    public SmartAppliance(String description, String id, int price, OperatingSystem os, boolean voiceActivated) {
        this.description = description;
        this.id = id;
        this.price = price;
        this.os = os;
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
        this.os = os;
    }

    public void setVoiceActivated(boolean voiceActivated) {
        this.voiceActivated = voiceActivated;
    }

    public String getDescription() {
        return description;
    }
}
