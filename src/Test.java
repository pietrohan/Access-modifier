public class Test {
   private int rollno;
   private String name;
   private static String college = "Phạm văn hân";

    public Test(int rollno, String n) {
        this.rollno = rollno;
        this.name = n;
    }
    static void  change (){
        college =" C0622G1 ";
    }
    void  display(){
        System.out.println(rollno + " "+name+""+college);
    }
}

