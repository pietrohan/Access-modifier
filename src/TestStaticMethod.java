public class TestStaticMethod {
    public static void main(String[] args) {
        Test.change();

        Test t1 = new Test(111, "phạm hân");
        Test t2 = new Test(112, "phạm hoan");
        Test t3 = new Test(113, "phạm yến");

        t1.display();
        t2.display();
        t3.display();
    }
}
