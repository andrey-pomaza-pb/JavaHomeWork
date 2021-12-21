package com.pb.pomaza.hw12;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Person implements Comparable<Person>{
    private String name;

    private Date dateBirthday;
    private List <Integer> phone;
    private String address;
    private Date dateEdit;
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public Person(String name, Date dateBirthday, List<Integer> phone, String address, Date dateEdit) {
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.phone = phone;
        this.address = address;
        this.dateEdit = dateEdit;
    }
    public Person(){
        this.name = "Test";
        this.dateBirthday = new Date();
        this.address = "Test";
        this.dateEdit = new Date();
        this.phone = new ArrayList<>();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public void setPhone(List<Integer> phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    public String getName() {
        return name;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public List<Integer> getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateBirthday=" + formatDate.format(dateBirthday) +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", dateEdit=" + formatDate.format(dateEdit) +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(dateBirthday, person.dateBirthday) && Objects.equals(phone, person.phone) && Objects.equals(address, person.address) && Objects.equals(dateEdit, person.dateEdit) && Objects.equals(formatDate, person.formatDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateBirthday, phone, address, dateEdit, formatDate);
    }

    public void createContact() throws ParseException {
        System.out.println("----------Creating new contact:----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name - ");
        this.name = sc.nextLine();

        System.out.print("Enter date birthday (format DD/MM/YYYY ) - ");
        String strDateBirthday = sc.nextLine();
        //        System.out.println(formatDate.format(dateBirthday));
        this.dateBirthday = formatDate.parse(strDateBirthday);

        System.out.print("Enter phone - ");
        int phone = sc.nextInt();
        this.phone.add(phone)
        ;

        System.out.print("Enter address - ");
        this.address = sc.next();

        System.out.print("Date create contact - " + formatDate.format(new Date()));
        this.dateEdit = new Date();
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
