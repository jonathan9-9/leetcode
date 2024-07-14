import java.util.*;

public class Patient {
    private int id;
    private String name;
    private ArrayList<DoctorVisit> visitList;

    public Patient(int patientID, String name) {
        this.id = patientID;
        this.name = name;
        this.visitList = new ArrayList<DoctorVisit>();
    }

}
