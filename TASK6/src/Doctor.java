public class Doctor extends MedicalStaff{
    Doctor(String id,String Dept,int hours){
     super(id,Dept,hours);
    }
    public void PatientCare(){
        System.out.println("Doctor diagnosis patient");
    }
}
