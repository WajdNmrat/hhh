/**
 * Created by nmrat on 20/01/2018.
 */

public class Person {
    protected int id;
    protected String name;
    protected String adress
    protected String phone;
    protected String email;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", adress=" + adress +
                ", phone=" + phone +
                ", email=" + email +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setAdress(string adress) {
        this.adress = adress;
    }

    public void setPhone(string phone) {
        this.phone = phone;
    }

    public void setEmail(string email) {
        this.email = email;
    }

    public int getId() {

        return id;
    }

    public string getName() {
        return name;
    }

    public string getAdress() {
        return adress;
    }

    public string getPhone() {
        return phone;
    }

    public string getEmail() {
        return email;
    }

    public Person(int id, string name, string adress, string phone, string email) {

        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }
}
