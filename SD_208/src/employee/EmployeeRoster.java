/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author 2ndyrGroupB
 */
public class EmployeeRoster {

    private Employee[] empList;
    private int count; //how many emp has been generate
    private int max;

    public EmployeeRoster() {
        this(100);
    }

    public EmployeeRoster(Employee[] empList) {
        this.empList = empList;
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new Employee[this.max];
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean addEmployee(Employee e) {
        if (!isFull()) {
            this.empList[this.count++] = e;
            return true;
        }
        return false;
    }

    /**
     *
     * @param id as the employee id to be deleted
     * @return the employee deleted in the case there is no employee return null
     */
    private boolean isFull() {
        return count == max;
    }

    public Employee removeEmployee(int id) {
        Employee emp = null;
        int index = searchEmployee(id);

        if (index >= 0) {
            emp = empList[index];
            for (int i = index; i < count - 1; ++i) {
                empList[i] = empList[i + 1];
            }
            count--;
        }
        return emp;
    }

    public int searchEmployee(int id) {
        int i;
        for (i = 0; i < count; ++i) {
            if (id == empList[i].getEmpID()) {
                break;
            }
        }
        return i == count ? -1 : i;
    }

    public int countHE() {
        int ctr = 0;
        for (int i = 0; i < count; ++i) {            
                ctr++;            
        }
        return ctr;
    }

    public int countPWE() {
        int ctr = 0;
        for (int i = 0; i < count; ++i) {
            ctr++;
        }
        return ctr;
    }

    public int countCE() {
        int ctr = 0;
        for (int i = 0; i < count; ++i) {

            ctr++;
        }
        return ctr;
    }

    public int countBPCE() {
        int ctr = 0;
        for (int i = 0; i < count; ++i) {
            ctr++;
        }
        return ctr;
    }

    public void empNumber() {
        System.out.printf("\n%20s", "Number of Employees");
        System.out.println("\n------------------------------");
        System.out.printf("\n %-10s | %-20s | %-20s | %-30s \n", "Hourly Employee", "Commission Employee", "Piece Worker Employee", "Base Employee");
        System.out.printf(" %-15d | %-20d | %-21d | %-30d \n", countHE(), countCE(), countPWE(), countBPCE());
    }

    public void summary() {
        System.out.printf(" %-10s | %-15s | %-20s | %-12s \n", "ID", "NAME", "SALARY", "TYPE");
        for (int i = 0; i < count; ++i) {
            System.out.printf(" %-10d | %-15s | Php%17.2f | %-15s \n",
                    empList[i].getEmpID(), empList[i].getEmpName(), empList[i].computeSalary(),
                    empList[i].getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "EmployeeRoster{" + "empList=" + empList + ", count=" + count + ", max=" + max + '}';
    }

    /**
     * ID | NAME | SALARY | TYPE
     */
}
