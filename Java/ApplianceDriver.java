import java.util.ArrayList;
import java.util.List;

public class ApplianceDriver {
    public static void main(String[] args) {
        ArrayList<Appliance> appliances = new ArrayList<>();

        appliances.add(new Appliance("LG Toaster", "7119", 125));
        appliances.add(new Appliance("Apple Fridge", "9803", 5000));
        appliances.add(new Appliance("LG Oven", "0914", 4500));
        appliances
                .add(new SmartAppliance("Smart TV", "8911", 800, SmartAppliance.OperatingSystem.APPLE_HOME_KIT, true));
        appliances
                .add(new SmartAppliance("Smart Watch", "9271", 550, SmartAppliance.OperatingSystem.GOOGLE_ASSISTANT,
                        true));
        appliances
                .add(new SmartAppliance("Smart MiniFridge", "5572", 2000, SmartAppliance.OperatingSystem.AMZ_ALEX_A,
                        false));
    }
}
