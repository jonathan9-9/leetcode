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

    public Patient(int patientID, String name, DoctorVisit firstVisit) {
        this(patientID, name);
        this.visitList.add(firstVisit);
    }

    public int getPatientID() {
        return this.id;
    }

    public String getPatientName() {
        return this.name;
    }

    public List<DoctorVisit> getPatientDoctorVisits() {
        return this.visitList;
    }

    public void setPatientID(int patientID) {
        this.id = patientID;
    }

    public void setPatientName(String patientName) {
        this.name = patientName;
    }

    public void addDoctorVisit(DoctorVisit visit) {
        this.visitList.add(visit);
    }
}
