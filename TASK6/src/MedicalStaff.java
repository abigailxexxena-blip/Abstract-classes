public abstract class MedicalStaff {
    String EmployeeID;
    String Department;
    int Workinghours;
    MedicalStaff(String id, String Dept, int hours ){
        EmployeeID=id;
        Department=Dept;
        Workinghours=hours;
    }
}
