package cms;


import java.util.ArrayList;

public class Phonebook {
ArrayList<Person> contacts = new ArrayList<>();
public void add(Person person){
    contacts.add(person);
}
public void remove(Person person){
    contacts.remove(person);
}
public  Person search(String name){
    for(Person p: contacts){
        if (p.getName().equalsIgnoreCase(name)) {
           return p;
        }


    }
return null;
}
public void display(){
    for(Person p: contacts){
        System.out.println(p.getName()+" "+p.getPh()+" "+p.getEmail()+" "+p.getAddress());
    }

}

}
