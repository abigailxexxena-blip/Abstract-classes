public class Pharmacist extends MedicalStaff{
    Pharmacist(String id, String Dept, int hours){
        super(id, Dept, hours);
    }
    public void PatientCare(){
        System.out.println("Pharmacist medicine to patient as prescribed by the doctor");
    }
}
