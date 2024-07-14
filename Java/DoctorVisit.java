import java.text.NumberFormat;

public class DoctorVisit {

    private String reason;
    private double amountOwed; // amount due for the visit
    private PaymentMethod paymentMethod;
    private boolean followUpRequired; // whether the patient must return for a follow-up

    public DoctorVisit(String reason, double amountOwed, PaymentMethod paymentMethod, boolean followUpRequired) {
        this.reason = reason;
        this.amountOwed = amountOwed;
        this.paymentMethod = paymentMethod;
        this.followUpRequired = followUpRequired;
    }

    public String getReason() {
        return reason;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public boolean isFollowUpRequired() {
        return followUpRequired;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public boolean patientPays() {
        return paymentMethod.patientPays();
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyFormatted = formatter.format(amountOwed);

        return "Reason: " + reason +
                "\nAmount Owed: " + moneyFormatted +
                (patientPays() ? "Patient Pays" : "Patient Does Not Pay") +
                (followUpRequired ? "\t***Follow-Up Required" : "");
    }

}
