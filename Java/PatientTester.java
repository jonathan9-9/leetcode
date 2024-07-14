/*
 * ******************************************************************************
 * THIS TESTER WILL NOT COMPILE UNTIL YOU HAVE COMPLETED PARTS ONE, TWO, AND THREE
 * ******************************************************************************
 */

public class PatientTester {

    public static void main(String[] args) {
        Patient patientA = new Patient(123, "PatientA");
        Patient patientB = new Patient(234, "PatientB");

        /* *******************IMPORTANT******************* */
        // replace the nulls below so you can run the driver!

        // visit1: replace null with your value for full payment method
        DoctorVisit visit1 = new DoctorVisit("sore knee", 200, null, true);
        if (visit1.getPaymentMethod() == null) {
            System.err.println(
                    "ERROR! You must replace the nulls in your driver with the values of your enum in order to use the driver.");
            System.err.println("Exiting the driver.");
            System.exit(1);
        }
        Patient patientC = new Patient(345, "PatientC", visit1);

        // visit2: replace null with your value for full payment method
        DoctorVisit visit2 = new DoctorVisit("flu", 100, null, false);

        // visit3: replace null with your value for insurance payment method
        DoctorVisit visit3 = new DoctorVisit("hip pain", 2500, null, false);

        // visit4: replace null with your value for payment plan method
        DoctorVisit visit4 = new DoctorVisit("earache", 500, null, true);

        // visit5: replace null with your value for payment plan method
        DoctorVisit visit5 = new DoctorVisit("broken ankle", 1400, null, true);

        // visit6: replace null with your value for full payment method
        DoctorVisit visit6 = new DoctorVisit("store throat", 100, null, false);

        patientA.addDoctorVisit(visit2);
        patientA.addDoctorVisit(visit3);
        patientC.addDoctorVisit(visit4);
        patientC.addDoctorVisit(visit5);

        System.out.println("PatientA toString:\n\tExpected=" + "ID: 123	Name: PatientA	Visits: 2");
        System.out.println("\tActual  =" + patientA);
        System.out.println("PatientB toString:\n\tExpected=" + "ID: 234	Name: PatientB	Visits: 0");
        System.out.println("\tActual  =" + patientB);
        System.out.println("PatientC toString:\n\tExpected=" + "ID: 345	Name: PatientC	Visits: 3");
        System.out.println("\tActual  =" + patientC);

        System.out.println("\nPatientA number of visits:\n\tExpected=2\n\tActual  =" + patientA.getNumberOfVisits());
        System.out.println("PatientB number of visits:\n\tExpected=0\n\tActual  =" + patientB.getNumberOfVisits());
        System.out.println("PatientC number of visits:\n\tExpected=3\n\tActual  =" + patientC.getNumberOfVisits());

        System.out.println(
                "\nPatientA total payments owed: \n\tExpected=100.0\n\tActual  =" + patientA.getTotalPaymentsOwed());
        System.out.println(
                "PatientB total payments owed: \n\tExpected=0.0\n\tActual  =" + patientB.getTotalPaymentsOwed());
        System.out.println(
                "PatientC total payments owed: \n\tExpected=2100.0\n\tActual  =" + patientC.getTotalPaymentsOwed());

        System.out.println("\nPatientA has a follow up:\n\tExpected=false\n\tActual  =" + patientA.hasAFollowUp());
        System.out.println("PatientB has a follow up:\n\tExpected=false\n\tActual  =" + patientB.hasAFollowUp());
        System.out.println("PatientC has a follow up:\n\tExpected=true\n\tActual  =" + patientC.hasAFollowUp());

        System.out.println("\nPatientA wants to add a visit. Success?\n\tExpected=true\n\tActual  ="
                + patientA.addDoctorVisit(visit6));
        System.out.println("PatientA number of visits:\n\tExpected=3\n\tActual  =" + patientA.getNumberOfVisits());

        System.out.println("\nPatientC wants to add a visit. Success?\n\tExpected=false\n\tActual  ="
                + patientC.addDoctorVisit(visit6));
        System.out.println("PatientC number of visits:\n\tExpected=3\n\tActual  =" + patientC.getNumberOfVisits());

        System.out.println("\nNumber of patients:\n\tExpected=3\n\tActual  ="); // YOU CONCATENATE THE METHOD CALL HERE
                                                                                // TO CHECK!

    }

}
