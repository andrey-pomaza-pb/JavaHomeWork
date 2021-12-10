package com.pb.pomaza.hw11;


import java.sql.SQLOutput;
        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws ParseException {
        System.out.println("|----------Welcome to Phone's Book!----------|");
        ArrayList<Person> persons = new ArrayList<>();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
// Create test contact
        persons.add(new Person());
        persons.add(new Person());
        persons.add(new Person());

        while (true) {
            System.out.println("----------Enter number function:----------");
            System.out.println("1 - Add new contact\n" +
                    "2 - Remove contact\n" +
                    "3 - Search contact\n" +
                    "4 - View sorting contact\n" +
                    "5 - Edite contact\n" +
                    "6 - Save phone book in file *.json\n" +
                    "7 - Import phone book\n" +
                    "9 - View phone's book\n" +
                    "0 - EXIT!");
            int numComand = sc.nextInt();
// 1 - Create new contact
            if (numComand == 1){
                Person person = new Person();
                person.createContact();
                persons.add(person);
            }
// 2 - Remove contact
            else if (numComand == 2){
                System.out.print("Enter name for removing: ");
                String nameRemove = sc.next();
                persons.removeIf(ps -> Objects.equals(ps.getName(), nameRemove));
                System.out.println("Contact " + nameRemove + " removed!");
            }
// 3 - Search contact
            else if (numComand == 3){
                System.out.print("Enter name for searching: ");
                String nameSearch = sc.next();
                for (Person ps:persons){
                    if (Objects.equals(ps.getName(), nameSearch))
                        System.out.println(ps);
                }
            }
// 4 - Sorting book
            else if (numComand == 4) {
                System.out.println("How sorting contact? \n" +
                        "1 - For name\n" +
                        "2 - For Date Birthday\n");
                numComand = sc.nextInt();
                if (numComand == 1){
                    persons.sort(Comparator.comparing(Person::getName));
                    System.out.println(persons);
                }
                else if (numComand == 2){
                    persons.sort(Comparator.comparing(Person::getDateBirthday));
                    System.out.println(persons);
                }
            }
// 5 - Edite contact
            else if (numComand == 5){
                System.out.print("Enter name for editing");

            }
// 6 - Save phone book in file *.json
            else if (numComand == 6){
                System.out.print("Enter path file for save JSON file: ");

            }
// 7 - Import phone book
            else if (numComand == 7){
                System.out.print("Enter path file: ");

            }
// 9 - View phone book
            else if (numComand == 9) {
                System.out.println(persons);
            }
// 0 - Exit
            else if (numComand == 0) {
                System.out.println("Exit from \"Phone's book\"");
                break;
            }
        }
    }
}


