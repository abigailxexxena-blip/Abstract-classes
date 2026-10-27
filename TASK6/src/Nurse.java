public class Nurse extends MedicalStaff {
    Nurse(String id, String Dept, int hours){
        super(id, Dept, hours);
    }
    public void PatientCare(){
        System.out.println("Nurse takes care of patients");
    }
}
