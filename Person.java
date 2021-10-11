public class Person{
  private String name;
  private int age;
  private int birthMonth;
  private int birthDay;
  private int birthYear;
  private String occupation;
  private String school;
  private int classYear;
  private String description;

  public Person(){
    name = "N/A";
    age = 0;
    birthMonth = 0;
    birthDay = 0;
    birthYear = 0;
    occupation = "N/A";
    school = "N/A";
    classYear = 0;
    description = "N/A";
  }

  public void setName(String newName){
    name = newName;
  }

  public void setAge(int newAge){
    age = newAge;
  }

  public void setBirthday(int aMonth, int aDay, int aYear){
    birthMonth = aMonth;
    birthDay = aDay;
    birthYear = aYear;
  }

  public void setOccupation(String anOccupation){
    occupation = anOccupation;
  }

  public void setSchool(String aSchool){
    school = aSchool;
  }

  public void setClassYear(int aClassYear){
    classYear = aClassYear;
  }

  public void setDescription(String aDescription){
    description = aDescription;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public String getOccupation(){
    return occupation;
  }

  public String toString(){
    return
    "Name: " + name + "\n" +
    "Age: " + age + "\n" +
    "Birthday: " + birthMonth + "/" + birthDay + "/" + birthYear + "\n" +
    "Occupation: " + occupation + "\n" +
    "Education: " + school + " class of " + classYear + "\n" +
    "Description: " + description + "\n";
  }





}
