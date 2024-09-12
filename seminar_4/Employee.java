import java.util.List;

public class Employee {
    List<Employee> employees;
    private final Integer PersonnelNumber;
    private final String PhoneNumber;
    private final String Name;
    private Integer Experience;

    public Employee(Integer personnelNumber, String phoneNumber, String name, Integer experience) {
        PersonnelNumber = personnelNumber;
        PhoneNumber = phoneNumber;
        Name = name;
        Experience = experience;
    }

    public List<Employee> getListEmployees() {
        return employees;
    }

    public Integer getPersonnelNumber() {
        return PersonnelNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public Integer getExperience() {
        return Experience;
    }


    @Override
    public String toString() {
        return "\nEmployee{" +
                ", PersonnelNumber=" + PersonnelNumber +
                ",\n PhoneNumber='" + PhoneNumber + '\'' +
                ",\n Name='" + Name + '\'' +
                ",\n Experience=" + Experience +
                "}\n";
    }
}
