package SPproject7.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates ID
    @Column(name = "emp_id")
    private Long empId;

    @Column(name = "emp_name", nullable = false)
    private String empName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "salary")
    private int salary;

    @Column(name = "department")
    private String department;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    // --- Constructors ---
    public Employee() {
    }

    public Employee(Long empId, String empName, String jobTitle, int salary, String department, LocalDate hireDate) {
        this.empId = empId;
        this.empName = empName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
        this.hireDate = hireDate;
    }

    // --- Getters and Setters ---
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
