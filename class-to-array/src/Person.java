

public class Person {
    String name;
    String Lastname;
    Integer age;

    public Person(String name, String lastname, Integer age) {
        this.name = name;
        this.Lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" + "{" + name + " , " + Lastname + " , " + age  + '}' + "\n";
    }
}
