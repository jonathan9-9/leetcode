public enum PaymentMethod {
    INSURANCE_PAY(false),
    PAYMENT_PLAN(true),
    FULL_PAY(true);

    private final boolean patientPays;

    PaymentMethod(boolean patientPays) {
        this.patientPays = patientPays;
    }

    public boolean patientPays() {
        return this.patientPays;
    }

    @Override
    public String toString() {
        switch (this) {
            case FULL_PAY:
                return "Patient pays in full.";
            case INSURANCE_PAY:
                return "Patient does not pay.";
            case PAYMENT_PLAN:
                return "Patient pays by installments.";
            default:
                return "Payment method not specified.";
        }
    }
}
