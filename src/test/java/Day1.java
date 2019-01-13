
import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void test001() {
        System.out.println("Hello World!");
    }

    @Test
    public void test002() {
        System.out.println("Bye World!");
    }

    @Test
    public void test003() throws Exception{
        int number = 3;
        System.out.println(number);

    }

    @Test
    public void test004() {
        String myString = "String type variable value";
        System.out.println(myString);

    }

    public void myMethod(String myParameter)
    {
        System.out.println(myParameter);
    }

    @Test
    public void test005() {
        myMethod("Ruchika");
    }

    @Test
    public void test006() {
        String s1="ABC";
        String s2="DEF";
        System.out.println(s1+s2+"GHI"+23234);
    }

    @Test
    public void test007() {
        myAnotherMethod("Ruchika","Sinha");
    }

    private void myAnotherMethod(String message1, String message2) {
        System.out.println("Message1:" +message1+" "+"Message2:"+message2);
    }

    @Test
    public void test008() {
        addNumber(10,12);
    }

    private void addNumber(int i, int i1) {
        System.out.println("Sum of numbers:"+(i+i1));
    }

    @Test
    public void test009() {
        printMessage(4,6,"Sum of numbers:");
    }

    private void printMessage(int i, int i1, String s) {
        System.out.println(s+(i+i1));
    }

    @Test
    public void test010() {
        myAnotherMethod("first","second");
        addNumber(2,5);
    }

    @Test
    public void test011() {
        subtractNumber(10,4);
    }

    private void subtractNumber(int i, int i1) {
        System.out.println("Answer:"+(i-i1));
    }

    @Test
    public void testLogicalOperators() {
        boolean var1 = true;
        boolean var2 = false;
        printOR(var1,var2);
        printAND(var1,var2);
    }

    private void printAND(boolean var1, boolean var2) {
        System.out.println(var1&&var2);
    }

    @Test
    public void testName() {
        boolean elementIsVisisble = true;
        boolean elementNotVisible = false;
        if(elementIsVisisble) {
            System.out.println("Click on element");
        }
        else {
            System.out.println("Refresh the page OR wait OR fail the test");
        }

        if(!elementNotVisible) {
            System.out.println("Refresh the page OR wait OR fail the test");
        }

    }

    private void printOR(boolean var1, boolean var2) {
        System.out.println(var1||var2);
    }
}

