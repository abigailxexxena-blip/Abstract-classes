public abstract class MedicalStaff {
    String EmployeeID;
    String Department;
    int Workinghours;
    MedicalStaff(String id, String Dept, int hours ){
        EmployeeID=id;
        Department=Dept;
        Workinghours=hours;
    }
    public void displayinfo(){
        System.out.println("EmployeeID: " +EmployeeID);
        System.out.println("Department: " +Department);
        System.out.println("Workinghours: " +Workinghours);
    }
    public abstract void PatientCare();
}
