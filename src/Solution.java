import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int[] arr = {1,2,10,20,5,30,20,30};
        System.out.println("(1) Sum of All Elemnts: "+SumOfAllElements(arr));
        System.out.println("(2) Largest Element: "+getMax(arr));
        EvenOrOdd(arr,5);
        ReverseArray(arr);
        System.out.println("(5) Factorial using Loop: "+FactoralCalculation(5));
        System.out.println("(5.1) Factorial using Recursion: "+FactorialUsingRecursion(5));
        char[] str = {'a','b','b','a'};
        System.out.println("(6) Palindrome Check: "+isPalindrome(str));
        System.out.println("(7) Prime Check: "+isPrime(17));
        FibonacciSeries(8);
        System.out.println(" ");
        int n = 8;
        System.out.print("(8.1) Fibonacci Series using Recursion: ");
        for(int i = 0; i < n; i++){
            System.out.print(FibonacciRecursion(i) + " ");
        }
        System.out.println(" ");
        System.out.println("(9) Linear Search to find an element: "+LinearSearch(arr,10));
        BinarySearch(arr,20);
        System.out.println(DuplicateElement(arr));
        char[] chr = {'a','p','w','e','q','b','i','t'};
        CountVowelsAndConsonant(chr);
        MultiplicationTable(2);

        System.out.println("(14) Matrix Addition Table: ");
        int[][] x = {{1, 2 , 6 , 7 , 5}, {3, 4 , 4 , 9 , 5}, {3, 4 , 2 , 6 , 7}, {3, 4 , 6 , 8 , 5}, {3, 4 , 5 , 1 , 4}};
        int[][] y = {{5, 6 , 1 , 2 , 4}, {7, 8 , 9 , 4 , 8}, {3, 4 , 5 , 7 , 2}, {3, 4 , 4 , 6 , 9}, {3, 4 , 2 , 6 , 5}};
        int[][] z = MatrixSum(x,y);

        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[i].length;j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("(15) Average of Elements in an array: "+AverageOfElements(arr));
        System.out.println("(16) Leap Year: "+LeapYear(2012));
        PyramidPattern(5);
        System.out.print("(18) Reversed String: ");
        char[] st = {'a','p','p','l','e'};
        char[] st2 = ReversedString(st);
        for(int i = 0; i < st2.length ; i++){
            System.out.print(st2[i]+" ");
        }
        System.out.println();
        System.out.println("(19) Armstrong Number: "+ArmstrongNumber(153));
        int[] ar2 = MaximumAndMinimumValue(arr);
        System.out.print("(20) Maximum value is: "+ar2[0]+" and "+"Minimum value is: "+ar2[1]);
        System.out.println();
        System.out.println("(21) Simple Interest is: "+SimpleInterest(120000,7,2));
        double[] ar = ConvertTemperature(40.0, 100.0);
        System.out.println("(22) Fahrenheit to Celsius: "+ar[0]+" and "+"Celsius to Fahrenheit: "+ar[1]);
        System.out.print("(23) Character Check: ");
        CheckCharacter('5');
        System.out.println("(24) Second Largest Element: "+getSecondLargest(arr));
        String s = "abs5kj6";
        System.out.println("(25) Sum Of All numbers in a String: "+SumOfNumbersInString(s));
    }

    public static int SumOfAllElements(int[] arr){
        int summ=0;
        for(int i=0;i< arr.length;i++){
            summ = summ + arr[i];
        }
        return summ;
    }
    public static int getMax(int[] arr){
        int maxx = arr[0];
        for(int i=1;i<arr.length;i++){
            if(maxx<arr[i]){
                maxx = arr[i];
            }
        }
        return maxx;
    }
    public static void EvenOrOdd(int[] arr , int num){
        if(num % 2 == 0){
            System.out.println("(3) Number is Even");
        }
        else{
            System.out.println("(3) Number is Odd");
        }
        int cnt1=0,cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0 && arr[i] != 0){
                cnt1++;
            }
            else if(arr[i] % 2 != 0 && arr[i] != 0){
                cnt2++;
            }
        }
        System.out.println("(3) Total Even Numbers: "+cnt1+" and "+"Total Odd Numbers: "+cnt2);
    }
    public static void ReverseArray(int[] arr){
        System.out.print("(4) Reversed Array: ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static int FactoralCalculation(int n){
        int fact=1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int FactorialUsingRecursion(int n){
        int fact = 0;
        if(n==0 || n==1){
            return 1;
        }
        else{
            fact = n * FactorialUsingRecursion(n-1);
        }
        return fact;
    }
    public static boolean isPalindrome(char[] str){
        int flag = 0;
        for(int i = 0 ; i< str.length;i++){
            int k = -1;
            int j = str.length-1;
            while(k!=j){
                k++;
                if(str[k] != str[j]){
                    flag = 1;
                    break;
                }
                else{
                    j--;
                }
            }
        }
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2 ; i < n ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void FibonacciSeries(int n){
        int num1 = 0, num2 = 1,sum = 0;
        System.out.print("(8) Fibonacci Series: ");
        System.out.print(num1 + " " + num2 + " ");
        for(int i=0;i<n;i++){
            if(i == 0 || i == 1){
                continue;
            }
            sum = num1+num2;
            System.out.print(sum+" ");
            num1 = num2;
            num2 = sum;
        }
    }
    public static int FibonacciRecursion(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return FibonacciRecursion(n-1) + FibonacciRecursion(n-2);
        }
    }
    public static boolean LinearSearch(int[] arr,int n){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
    public static void BinarySearch(int[] arr,int n){
        Arrays.sort(arr);
        int flag = 0;
        int left = 0 , right = arr.length-1;
        int mid = (left + right) / 2;
        while(left<=right){
            if(n < arr[mid]){
                right = mid-1;
            }
            else if(n>arr[mid]){
                left = mid+1;
            }
            else if(n==arr[mid]){
                flag=1;
                break;
            }
            mid = (left + right) / 2;
        }
        if(flag == 1){
            System.out.println("(10) Element Found ");
        }
        else{
            System.out.println("(10) Element Not Found ");
        }
    }
    public static boolean DuplicateElement(int[] arr){
        int flag = 0;
        System.out.print("(11) Duplicate Elements: ");
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                    flag = 1;
                }
            }
        }
        if(flag == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void CountVowelsAndConsonant(char[] chr){
        int cnt1=0,cnt2=0;
        for(int i = 0 ; i < chr.length; i++){
            if(chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u'
                    || chr[i] == 'A' || chr[i] == 'E' || chr[i] == 'I' || chr[i] == 'O' || chr[i] == 'U'){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        System.out.println("(12) Number of vowels are: "+cnt1+" and "+"Number of consonants are: "+cnt2);
    }
    public static void MultiplicationTable(int n){
        System.out.println("(13) Multiplication table for number "+n+" is: ");
        for(int i=1;i<=10;i++){
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }
    public static int[][] MatrixSum(int[][] x, int[][] y){
        int[][] z = new int[5][5];
        for(int i = 0 ; i < x.length ; i++){
            for(int j = 0 ; j < x[i].length ; j++){
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
    }
    public static double AverageOfElements(int[] arr){
        double sz = arr.length , sum = 0 , avg = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        avg = sum / sz;
        return avg;
    }
    public static boolean LeapYear(int n){
        if(n % 4 == 0){
            return true;
        }
        if(n % 100 == 0){
            if(n % 400 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void PyramidPattern(int n){
        System.out.println("(17) Pyramid Pattern: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int k = 0;
            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }
    public static char[] ReversedString(char[] st){
        int sz = st.length , j = 0;
        char[] st2 = new char[sz];
        for(int i=sz-1;i>=0;i--){
            st2[j] = st[i];
            j++;
        }
        return st2;
    }
    public static boolean ArmstrongNumber(int n){
        int a=0,b=0,sum=0,x=0,y=n;
        while(y!=0){
            y = y/10;
            b++;
        }
        y = n;
        while(y!=0){
            x = y%10;
            sum = (int) (sum + Math.pow(x,b));
            y = y/10;
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static int[] MaximumAndMinimumValue(int[] arr){
        int max=arr[0],min=arr[0];
        int[] ar2 = new int[2];
        for(int i=0;i< arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        ar2[0] = max;
        ar2[1] = min;
        return ar2;
    }
    public static float SimpleInterest(float pricipal, float rate_of_interest, float time){
        float simple_interest;
        simple_interest = (pricipal * rate_of_interest * time) / 100;
        return simple_interest;
    }
    public static double[] ConvertTemperature(double cels, double fht){
        double c,f;
        double[] ar = new double[2];
        c = ((fht - 32) * 5) / 9;
        ar[0] = c;
        f = ((cels * 9) / 5) + 32;
        ar[1] = f;
        return ar;
    }
    public static void CheckCharacter(char ch){
        if(ch >= 65 && ch <= 90)
            System.out.println("Uppercase letter");
        else if(ch >= 97 && ch <= 122)
            System.out.println("Lowercase letter");
        else if(ch >= 48 && ch <= 57)
            System.out.println("It is a digit");
        else
            System.out.println("Special Character");
    }
    public static int getSecondLargest(int[] arr){
        int max2 = getMax(arr);
        int max3 = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max3<arr[i] && arr[i] < max2){
                max3 = arr[i];
            }
        }
        return max3;
    }
    public static int SumOfNumbersInString(String str){
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                temp = temp + ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}