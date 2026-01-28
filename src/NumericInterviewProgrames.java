public class NumericInterviewProgrames  {
    //to print odd numbers from 1 to 100 and their count
    public void count() {
        int count = 0;
        int oddsum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                oddsum = oddsum + i;
                count++; //to get count of odd numbers
            }
        }
        System.out.println("Sum of odd numbers: " + oddsum);
        System.out.println("Total odd numbers: " + count);
        System.out.println("----------------------------------------------");
    }

    //to print even numbers from 1 to 100 and their count
    public void even() {
        int evencount = 0;
        int evensum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                evensum = evensum + i;
                evencount++;  //to get count of even numbers
            }
        }
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Total even numbers: " + evencount);

    }

    public void palindromNumbers() { //palindrom number and reverse the number

        int a = 1551, b = 0, rev = 0;
        while (a > 0) {

            b = a % 10;
            rev = (rev * 10) + b;
            a = a / 10;
        }
        System.out.println("Reversed Number =====> " + rev);
        if (rev == a) {
            System.out.println("Palindrom Number");
        } else {
            System.out.println("Not a Palindrom Number");
        }
    }

    public void digitCount() {
        int a = 123456, count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        System.out.println("Digit Count =====> " + count);

    }


    public static void main(String[] args) {

        NumericInterviewProgrames num = new NumericInterviewProgrames();
        num.count();
        num.even();
        num.palindromNumbers();
        num.digitCount();

    }
}
