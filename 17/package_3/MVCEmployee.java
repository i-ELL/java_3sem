package package_3;

public class MVCEmployee {
    public static void main(String[] args) {
        EmployeeModel model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("someone");
        controller.updateView();
    }

    private static EmployeeModel retrieveEmployeeFromDatabase() {
        EmployeeModel employee = new EmployeeModel();
        employee.setName("Starukhina");
        employee.setSalary(500);
        employee.setHoursWorked(10);
        return employee;
    }
}
