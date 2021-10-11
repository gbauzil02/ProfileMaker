import java.util.*;
public class TestPerson{
  public static void main(String[] args)
  {
    String userName;
    int choice;
    int i;
    String schoolName;
    int gradYear;
    boolean adding;
    boolean switching;
    Scanner scan = new Scanner(System.in);
    LinkedList<Person> Profile = new LinkedList<>();
    Person person;
    int personId;

    personId = 1;
    i = 0;
    adding = true;
    switching = false;

    while (adding == true){
      System.out.print(
      "\n"+
      "------------------------------------------------------------------------\n"+
      "To begin creating or editing profiles, select an item from the list:\n" +
      "1. Add a new person\n" +
      "2. Set age\n" +
      "3. Set birthday\n"+
      "4. Set occupation\n"+
      "5. Set education\n"+
      "6. Set description sentence\n"+
      "7. Switch profiles\n"+
      "8. Print your profile\n"+
      "9. Print all profiles\n"+
      "10. Search filter\n"+
      "11. Leave\n"+
      "------------------------------------------------------------------------\n"

      );
      System.out.print("What do you want to do? ");
      choice = scan.nextInt();

      switch(choice){
        case 1:
          System.out.print("Welcome! What is your name? ");
          userName = scan.nextLine();
          scan.nextLine();
          person = new Person();
          person.setName(userName);
          Profile.add(person);
          if (Profile.size() < 2){
            personId = 0;
          }else if (Profile.size() == 1){
            personId = Profile.size();
          }else{
            personId = Profile.size() - 1;
          }
          break;
        case 11:
          adding = false;
          break;
        case 2:
          person = Profile.get(personId);
          System.out.print("How old are you? ");
          person.setAge(scan.nextInt());
          break;
        case 3:
          person = Profile.get(personId);
          System.out.print("When is your birthday? (M-D-YYYY)");
          person.setBirthday(scan.nextInt(), scan.nextInt(), scan.nextInt());
          break;
        case 7:
          System.out.print("Whose information would you like to switch to and edit? ");
          userName = scan.nextLine();
          scan.nextLine();
          while (i < Profile.size()){
            if (Profile.get(i).getName().equals(userName)){
              person = Profile.get(i);
            }
            i++;
          }
          i = 0;
          break;
        case 4:
          person = Profile.get(personId);
          System.out.print("What is your occupation? ");
          person.setOccupation(scan.nextLine());
          scan.nextLine();
          break;
        case 5:
          person = Profile.get(personId);
          System.out.print("What is the name of the last school you attended " +
          "or are currently attending ");
          schoolName = scan.nextLine();
          scan.nextLine();
          System.out.print("Class year: ");
          gradYear = scan.nextInt();
          person.setSchool(schoolName);
          person.setClassYear(gradYear);
          break;
        case 6:
          person = Profile.get(personId);
          System.out.print("Post a short sentence to say something about" +
          "yourself: ");
          person.setDescription(scan.nextLine());
          break;
        case 8:
          person = Profile.get(personId);
          System.out.print(person);
        case 9:
        case 10:
          System.out.println("Path not programmed. Make another " +
          "selection.");
          break;
      }
    }
  }
}
