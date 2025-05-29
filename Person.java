package cms;

public class Person extends Phonebook {
    String name;
    String ph;
    String email;
    String address;
    Person(String name,String ph,String email,String address){
        this.name = name;
        this.ph = ph;
        this.email =email;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getPh() {
        return ph;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

