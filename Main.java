package cms;

public class Main {
    public static void main(String[] args) {
Person p1 = new Person("kabilan","9677649819","kabilankabilan11107@gmail.com","college road tiruppur");
Person p2 = new Person("gokul","9952384528","something@gmail.com","college road tiruppur");
Phonebook ref = new Phonebook();
        ref.add(p1);
        ref.add(p2);
Person found = ref.search("kabilan");





if(found != null){
    System.out.println("contact found:"+found.getName());
}
else{
    System.out.println("contact not found");
}
ref.display();



    }
}
