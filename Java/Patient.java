import java.util.*;

public class Patient {
    private static final double MAXIMUM_AMT_OWED = 1500.0;

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

    public int getNumberOfVisits() {
        return this.visitList.size();
    }

    public boolean hasAFollowUp() {
        for (DoctorVisit visit : visitList) {
            if (visit.isFollowUpRequired()) {
                return true;
            }
        }
        return false;
    }

    public double getTotalPaymentsOwed() {
        double totalOwed = 0.0;

        for (DoctorVisit visit : visitList) {
            if (visit.patientPays()) {
                totalOwed += visit.getAmountOwed();
            }
        }
        return totalOwed;
    }

    public boolean addDoctorVisit(DoctorVisit visit) {
        if (getTotalPaymentsOwed() <= MAXIMUM_AMT_OWED) {
            return this.visitList.add(visit);
        }
        return false;
    }

    public String toString() {
        String stringResult = "Patient ID: " + this.id + "\nPatient Name: " + this.name + "\n Number of Doctor Visits: "
                + getNumberOfVisits();
        return stringResult;
    }
}
