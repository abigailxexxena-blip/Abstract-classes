public class Main {
    public static void main(String[]args) {

        Doctor d = new Doctor("D22","Cardio",6);
        Nurse n = new Nurse("N44","Nursing",12);
        Pharmacist p = new Pharmacist("P33","Pharmacy",18);
        LabTechnican l = new LabTechnican("l11","Laboratory",8);

        d.displayinfo();
        d.PatientCare();

        n.displayinfo();
        n.PatientCare();

        p.displayinfo();
        p.PatientCare();

        l.displayinfo();
        l.PatientCare();
    }
}
