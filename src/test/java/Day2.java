import org.testng.annotations.Test;

public class Day2 {

    @Test
    public void test001(){
        System.out.println("Welcome to Day 2");
    }

    @Test
    public void test002(){
        printString("Test");
    }

    public void printString(String a){
        System.out.println(a);
    }
    @Test
    public void test004()
    {
        name("Ruchika","Sinha");
    }

    private void name(String firstName, String lastName)
    {
        System.out.println("Name is "+firstName +" "+lastName);
    }

    @Test
    public void test003(){
        printString(true,"Some Text");
        printString(false,"Some Another Text");
    }

    private void printString(boolean isEnablePrint, String printValue)
    {
        if(isEnablePrint) {
            System.out.println(printValue);
        }
        else
        {
            System.out.println("False");
        }
    }

    @Test
    public void test005() {
        printNameIfEnabled(true,"Ruchika","Sinha");
        printNameIfEnabled(false,"Annika","Srivastava");
    }


    private void printNameIfEnabled(boolean isEnable, String firstName, String lastName) {
        if(isEnable) {
            System.out.println(firstName+" "+lastName);
        }
    }

    @Test
    public void test006()
    {
        checkNum(12);
        checkNum(8);
    }

    private void checkNum(int num)
    {
        if(num > 10)
        {
            System.out.println("More");

        }
        else
        {
            System.out.println("Less");
        }
    }


    @Test
    public void test007()
    {
        compareIntegers(12,15);
        compareIntegers(15,12);
    }

    private void compareIntegers(int num1, int num2)
    {
        if(num1>num2)
        {
            System.out.println("Ok");
        }
    }

    @Test
    public void test008()
    {
        printNumber(10,8,7);
        printNumber(5,8,7);

    }

    private void printNumber(int num1, int num2, int num3)
    {
        if(num1 > num2)
        {
            System.out.println(num3);
        }
        else
        {
            System.out.println("Happy Saturday");
        }
    }

    @Test
    public void test009()
    {
        checkNumWithBoolean(true,20,12);
        checkNumWithBoolean(true,8,12);
        checkNumWithBoolean(false,20,12);
        checkNumWithBoolean(false,8,12);
    }

    private void checkNumWithBoolean(boolean check, int num1, int num2){
        if(num1>num2 && check)
        {
            System.out.println("Hello World!");
        }
        else
        {
            System.out.println("Portnov Computer School");
        }

    }

    @Test
    public void test010()
    {
        int[] array1 ={10,20,30,40,50,60,70};
        //System.out.println(array1[3]);
        arrFunc(array1,5);
        arrFunc(array1,8);
        arrFunc(array1,-8);
    }

    private void arrFunc (int[] arr, int i)
    {
        if(i < arr.length && i>=0) {
            System.out.println(arr[i]);
        }
        else
        {
            System.out.println("Index Out of bound");
        }
    }

    @Test
    public void test011()
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,5,7,7};
        compareArray(arr1,arr2);
    }

    private void compareArray(int[] arr1 , int[] arr2)
    {
        if(arr1.length > arr2.length)
        {
            System.out.println("Array 1 has more elements");
        }
        else if(arr1.length == arr2.length)
        {
            System.out.println("Both arrays have same number of elements");
        }
        else
        {
            System.out.println("Array 2 has more elements");
        }
    }

    @Test
    public void test012()
    {
       int[] arr = {1,2,5,7,3,9,5};
        iterateArray(arr);
    }

    private void iterateArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Print Number: "+arr[i]);
        }
    }

    @Test
    public void test015(){
        int[] arr = {1,2,5,7,3,9,5};
        multiplyArrayElements(arr,5);
    }

    private void multiplyArrayElements(int[] arr, int i)
    {
       // for(int j=0;i<arr.length;j++)
        //{
        //    System.out.println("Print Number: "+arr[i]*i);
       // }

        for(int el : arr)
        {
            System.out.println("Print Number: "+el*i);
        }
    }

    @Test
    public void test014()
    {
        int[] arr = {1,2,5,7,3,9,5};
        ifLessOk(arr,6);
    }

    private void ifLessOk(int[] arr,int i)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] > i) {
                System.out.println("Print Number: " + arr[j]+" is greater");
            }
            else
            {
                System.out.println("Print Number: " + arr[j]+" is less");
            }
        }
    }

    @Test
    public void test016()
    {
        int[] arr ={1,2,3,4,5,6};
        countElements(arr,4);
    }

    private void countElements(int[] arr,int i)
    {
        int lessCount=0;
        int greaterCount = 0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] < i) {
                lessCount +=1;
            }

        }
        System.out.println(lessCount);
    }

    @Test
    public void test017()
    {
        int[] arr ={1,2,3,4,5,6};
        printReverse(arr);
    }

    private void printReverse(int[] arr) {
        for (int k= arr.length-1;k>=0;k--)
        {
            System.out.println(arr[k]);
        }
    }

    @Test
    public void test018()
    {
      boolean elementIsNotVisible = true;
      int i =0;
      while(elementIsNotVisible && i<10)
      {
          System.out.println("Element is still not visible");
          i++;
      }
    }


    @Test
    public void test019() {
        int[] integerArray = {1,2,3,4,5,6,6,7};
        for (int eachElement : integerArray){
            System.out.println((eachElement));
        }

    }

    @Test
    public void test020() {
        int i = 0;
        for(i=0;i<5;i++) {
           if(i >= 2)
           {
               break;
           }
            System.out.println("Yuhu");
        }
        System.out.println(i);
    }

    @Test
    public void test021() {
        String myString1 = "Value1";
        String myString2 = "Value2";
        String newString = combineTwoStrings(myString1,myString2);
        System.out.println(newString);
    }

    private String combineTwoStrings(String myString1, String myString2) {
        return (myString1+" "+myString2);
    }

    @Test
    public void test022() {
        int num1 = 10;
        int num2 = 20;
        int sum = returnAddition(num1,num2);
        System.out.println(sum);
    }

    private int returnAddition(int a, int b)
    {
        return a+b;
    }

    @Test
    public void test023() {
        int num1 = 10;
        int num2 = 20;
        int product = returnMultiplication(num1,num2);
        System.out.println(product);
    }

    private int returnMultiplication(int a, int b)
    {
        return a*b;
    }

    @Test
    public void test24() {
        int[] arr = {1,3,4,6,8,9};
        int num = equalValue(arr,10);
        //int num1 = equalValue(arr,10);
        if(num != -1) {
            System.out.println(num);
        }
        else {
            System.out.println("Number does not exist");
        }
    }

    private int equalValue(int[] arr, int num)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                return arr[i];
            }
        }
        return -1;
    }

    @Test
    public void test025() {
        int[] arr1 ={1,2};
        int[] arr2 = {3,4};
        int[] arr3 = addArrays(arr1,arr2);
        for(int elem: arr3)
        {
            System.out.println(elem);
        }
    }

    private int[] addArrays(int[] arr1, int[] arr2)
    {
        int newSize = arr1.length+arr2.length;
        //System.out.println(newSize);
        int[] newArr = new int[newSize];
        int k =0;
        for (int i=0;i<arr1.length;i++)
        {
            newArr[k] =arr1[i];
            k++;
        }
        for (int j = 0;j<arr2.length;j++)
        {
            newArr[k] = arr2[j];
            k++;
        }
        return newArr;
    }

    @Test
    public void test026() {
        Point myPointObject = new Point();
        myPointObject.x = 10;
        Dog myPetBuddy = new Dog("Chip",5,"Labrador");
        /*myPetBuddy.name="Chip";
        myPetBuddy.age = 5 ;
        myPetBuddy.breed = "Labrador";*/
        System.out.println(myPetBuddy.age);
        myPetBuddy.bark();
        myPetBuddy.run();
        myPetBuddy.eat("dog food");
        myPetBuddy.eat("candy");
    }

    @Test
    public void test027() {
        Dog.run();
    }

    @Test
    public void test0028() {
        int[] arr1 = {3, 6, 7};
        int[] arr2 = {4, 5, 6};
        int[] resultArray = joinTwoArrays(arr1, arr2);
        for (int x : resultArray) {
            System.out.println(x);
        }
    }

    private int[] joinTwoArrays(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];

        for(int i = 0; i < newArray.length; i++){
            if(i < array1.length){
                newArray[i] = array1[i];
            }else
            {
                newArray[i] = array2[i-array1.length];
            }
        }
        return newArray;
    }
}
