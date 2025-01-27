class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class CollectionMap {
    private Employee[] employeeMap;
    private int size;

    public CollectionMap() {
        employeeMap = new Employee[100]; 
        size = 0;
    }

    public Employee[] getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Employee[] employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1; 
        }

        for (int i = 0; i < size; i++) {
            if (employeeMap[i] != null && employeeMap[i].getId() == emp.getId()) {
                return 2; 
            }
        }

        employeeMap[size++] = emp; 
        return 0; 
    }

    
}