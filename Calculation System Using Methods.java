package methods.in.real.world;

import java.util.Scanner;

public class MethodsInRealWorld {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String msg = "Please Follow the instruction";

        Boolean m = true, n = true, s = true;
        int ans;

        String ans1;

        for (; m;) {
            s = true;
            System.out.println("                                                                         Welcome                                                                                                       ");
            System.out.println("                                                        ******** Developed By IIT Group No 6 *********                                                                                        ");
            System.out.println("                                                                                                                                                      ");
            System.out.println(" 1.Largest  2.LargestPro  3.Square root  4.Multiplication Table  5.Multiplication Table Pro  6.Find (odd OR even)  7.Student Marks  8.MyETF  9.MyEPF  10.Employee Details\n");
            ans = scan.nextInt();

            if (ans == 1) {
                for (; s;) {
                    Largest();
                    n = true;
                    s = true;
                    m = false;

                    for (; n;) {
                        System.out.println(" \nE. Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);             // Please Follow the instruction
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }

                    }//for n
                }//for s
            }//if ans1

            if (ans == 2) {
                for (; s;) {
                    Largestpro();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 3) {
                for (; s;) {
                    Squareandcube();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 4) {
                for (; s;) {
                    multiplicationtable();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 5) {
                for (; s;) {
                    advancemultiplicationtable();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE. Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 6) {
                for (; s;) {
                    find();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 7) {
                for (; s;) {
                    studentmarks();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 8) {
                for (; s;) {
                    myetf();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

            if (ans == 9) {
                for (; s;) {
                    myepf();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }
            if (ans == 10) {
                for (; s;) {
                    empdetails();
                    n = true;
                    for (; n;) {
                        System.out.println(" \nE.  Exit  \nM. Main Menu \nR.Retry");
                        System.out.println("***************************************\n");
                        ans1 = scan.next();
                        if (!ans1.equals("E") && !ans1.equals("M") && !ans1.equals("R")) {
                            n = true;
                            System.out.println(msg);
                        }
                        if (ans1.equals("R")) {
                            s = true;
                            n = false;
                        }

                        if (ans1.equals("E")) {
                            m = false;
                            n = false;
                            s = false;
                        }
                        if (ans1.equals("M")) {
                            m = true;
                            n = false;
                            s = false;
                        }
                    }
                }
            }

        }//for m

    }

    public static void Largest() {                          // Find the largest Number            // 1. Largest
        float n1, n2, n3, result;

        System.out.print("Enter the First  Number : ");       // 7
        n1 = scan.nextFloat();
        System.out.print("Enter the Second  Number : ");    // 3
        n2 = scan.nextFloat();
        System.out.print("Enter the Third  Number  : ");     //9
        n3 = scan.nextFloat();
        if (n1 > n2 && n1 > n3) {
            result = n1;
        } else if (n2 > n3) {
            result = n2;
        } else {
            result = n3;
        }
        System.out.print("\nLargest Number is  " + result);     //9.0

    }

//....................................................................................................................
    public static void storearray(double x[]) {   // storing array 
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {

            x[i] = scan.nextDouble();

        }
    }

//...................................................................................................................
    public static void Largestpro() {              // find large number and small number 
        Scanner sc = new Scanner(System.in);
        System.out.print("How many data input you want to Enter : ");
        int x = sc.nextInt();
        double nums[] = new double[x];

        storearray(nums);
        double largest = nums[0];
        double smallest = nums[0];

        for (int y = 0; y < nums.length; y++) {

            if (nums[y] > largest) {
                largest = nums[y];
            }
            if (nums[y] < smallest) {
                smallest = nums[y];
            }

        }

        System.out.println("largest number is : " + largest);
        System.out.println("Smallest number is : " + smallest);

    }
//...................................................................................................................

    public static void Squareandcube() {                                                               // 2. Square root

        int value, square, cube, sorce;
        System.out.print("Enter the value : ");        // input = 6
        value = scan.nextInt();
        sorce = value;
        square = (sorce) * (sorce);
        cube = (sorce) * (sorce) * (sorce);
        System.out.println("Square is  " + square);      //36
        System.out.println("Cube is  " + cube);          // 216
    }

//....................................................................................................................
    public static void multiplicationtable() {                                                           //3.Multiplication Table

        int value, rows;
        System.out.print("Enter Multiplication value : ");   // 3
        value = scan.nextInt();
        System.out.print("How many Rows you want : ");       // 5
        rows = scan.nextInt();
        for (int x = 1; x <= rows; x++) {
            System.out.println(x + " x " + value + " = " + x * value);
            /*  1 x 3 = 3
                                                                               2 x 3 = 6
                                                                               3 x 3 = 9
                                                                               4 x 3 = 12
                                                                               5 x 3 = 15  */

        }
    }
//....................................................................................................................

    public static void advancemultiplicationtable() {                                                // 4. Multiplication Table2

        String succesMsg = ("Please Follow the instruction.");  // This Multiplication Table only start with Small number input to high number input    
        short z;
        boolean l = true;

        for (; l;) {
            System.out.print("Enter the Start Number : ");  //  only start with Small to high number ,  if you input 10
            short start = scan.nextShort();
            System.out.print("Enter the End Number : ");    // 2                                     ,  2 and it's going wrong input
            short ends = scan.nextShort();

            if (ends >= 12) {
                ends = 12;
            }

            if (start >= ends && ends <= start) {
                System.out.println("Wrong input" + "\n");         //   if you start 10 and it is second number is 2, then it is wrong Input
                boolean m = true;
                short x = 0;

                while (m) {

                    System.out.println("please press - 1 - to exit" + "\t" + "please press - 0 - to Retry");

                    z = scan.nextShort();
                    x++;

                    if (z == 1) {
                        l = false;
                        m = false;
                    } else if (z == 0) {
                        l = true;
                        m = false;
                    }

                    if (z != 0 && z != 1) {
                        System.out.println(succesMsg);
                    }

                }//while m

            } else {
                for (int x = start; x <= ends; x++) {

                    for (int y = start; y <= ends; y++) {
                        System.out.print(x + " x " + y + " =   " + y * x + "\t");   // Print Multiplication Table
                    }
                    System.out.println();
                }
                break;
            }
        }	//for l
    }

//....................................................................................................................
    public static void find() {                                                              // 6. find the odd number

        float x;
        System.out.print("Enter the Number : ");    //10
        x = scan.nextFloat();
        String res;
        if (x % 2 == 0) {
            res = ("This Number is EVEN");     // 10 is Even Number
        } else {
            res = ("This Number is ODD ");
        }
        System.out.println(res);

    }
//....................................................................................................................

    public static void studentmarks() {                                                               // 5. AL Student Marks (3 subject)

        float m1, m2, m3, total, average;
        String result;
        System.out.print("Enter the first  Mark  :  ");    //30
        m1 = scan.nextFloat();
        System.out.print("Enter the second  Mark :  ");   //49
        m2 = scan.nextFloat();
        System.out.print("Enter the third  Mark  :  ");   //78
        m3 = scan.nextFloat();
        total = m1 + m2 + m3;
        average = total / 3;

        if (average >= 0 && average <= 40) {
            result = "W";
        } else if (average > 40 && average <= 55) {
            result = "S";
        } else if (average > 55 && average <= 65) {
            result = "C";
        } else if (average > 65 && average <= 75) {
            result = "B";
        } else if (average > 75 && average <= 100) {
            result = "A";
        } else {
            result = "\n Error ";
        }
        System.out.println("\nResult is	" + "---- " + result + " ----");   //S
        System.out.println("\nTotal is		" + total);                //157.0
        System.out.println("\nAverage is	" + average);             //52.333332
    }

    //....................................................................................................................
    public static void myepf() {                                                // 7. EPF Amount  
        System.out.print("Enter the value : ");     //  100,000
        Scanner scan = new Scanner(System.in);
        double epf, sal;
        sal = scan.nextDouble();
        epf = sal * 12 / 100;
        System.out.println("your EPF is : " + epf);   // 12000.0

    }

    //....................................................................................................................
    public static void myetf() {     // ETF Amount
        System.out.print("Enter the value : ");   // 100000
        Scanner scan = new Scanner(System.in);

        double etf, sal;
        sal = scan.nextDouble();
        etf = sal * 3 / 100;
        System.out.println("your ETF is : " + etf);    //4000.0
    }
//....................................................................................................................

    public static void empdetails() {    // Collect Employee Details
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int m;
        double tot = 0, totallo = 0;

        //System.out.println("How may records you enter");
        System.out.print("How many Employee(s) data want you Enter : ");           //2 
        m = scan.nextInt();
        double sal[] = new double[m];
        double allow[] = new double[m];
        String name[] = new String[m];
        double epfs[] = new double[m];
        for (int x = 0; x < sal.length; x++) {

            System.out.print("Please Enter the Name : ");       // (if you entered 2, ask 2 times name and salary)
            name[x] = scan.next();
            System.out.print("Please Enter the Salary : ");

            sal[x] = scan.nextInt();
            allow[x] = sal[x] * 10 / 100;
            epfs[x] = sal[x] * 12 / 100;
            tot = tot + sal[x];
            totallo = totallo + allow[x];

            /*  for (; i <= x; i++) {
                System.out.println(" " + name[x] + "   Allowance is  " + allow[x] + "  epf is  " + epfs[x]);

            }*/
            System.out.println("\n");

        }
        for (int s = 0; s < allow.length; s++) {
            System.out.println("*" + name[s] + " Salary is " + sal[s] + " |" + " Allowance is " + allow[s] + " |" + " EPF is " + epfs[s]);
            //output 
            //*Sanoj Salary is 100000.0 | Allowance is 10000.0 | EPF is 12000.0
            // *Ahamed Salary is 20000.0 | Allowance is 2000.0 | EPF is 2400.0
        }

        System.out.print("\nEmployees Total Sallary is " + tot);
        System.out.print("\nEmployees Total Allowance is " + totallo);

    }
//....................................................................................................................

}//class
