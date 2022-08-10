package student;

public class Student {
   private String name = "John";
   private String classes = "C06";

   public Student(){
   }

   public    String setName(String name) {
        this.name = name;
        return name;
    }

   public   String setClasses(String classes) {
        this.classes = classes;
        return classes;
    }
}
