public class LabTechnican extends MedicalStaff{
    LabTechnican(String id, String Dept, int hours){
        super(id,Dept,hours);
    }
    public void PatientCare(){
        System.out.println("LabTechnican examises samples");
    }
}
