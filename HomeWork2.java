import java.util.ArrayList;
public class HomeWork2
{
    public static void main(String[] args) {
        System.out.println("..........First Question.........");
        String Names[] = {"Saleh", "Khalid", "Majed"};
        for (int i = 0; i < Names.length; i++) {
            System.out.println("The index number is " + i + " The names of related index  are :" + Names[i]);
        }
        // end1
        System.out.println("..........Second Question.........");
        for (int i = 1; i <= 33; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println("The number that multiple op 5 is " + i);
        }
        //end2
        System.out.println("..........Third Question.........");
        String[] reverseNames;
        reverseNames = new String[]{"Salha", "Noura", "Ameera", "Aisha", "Futais"};
        System.out.println("Original array: ");
        for (int j = 0; j < reverseNames.length; j++) {
            System.out.println(reverseNames[j]);
        }
        System.out.println("Array in reverse order: ");
        for (int c = reverseNames.length - 1; c >= 0; c--) {
            System.out.println(reverseNames[c]);
        }
        //end3
        System.out.println("..........Fourth Question.........");
        String[] Letters;
        Letters = new String[]{"Ahmad", "Noura", "Ali", "Aisha", "Saad", "Asma", "mohammad", "Naif", "Talal"
                , "Shama"};
        for (int i = 0; i < Letters.length; i++) {
            if (Letters[i].startsWith("A")) {
                continue;
            }
            System.out.println(Letters[i]);
        }
        //end4
        System.out.println("..........Fifth Question.........");
        int[] intArray = {10, 20, 30, 40, 50, 60, 70, 80};
        printArray(intArray);
        //end5
        System.out.println("..........Six Question.........");
        int a=5;
        int b =10;
        int c=20;

        System.out.println("the array list is"+numArray(a,b,c));
        System.out.println("..........Saven Question.........");
        helloMassage("Salha", "Alasmai");

        //end7
        System.out.println("..........eight Question.........");
        System.out.println("the average of the number 4 is");
        int res = average(4, 4, 4, 4);
        System.out.println(res);
        //end8
        System.out.println("..........Nine Question.........");
        int[] biggestArray = {11, 22, 33, 44, 55, 66, 77, 88};

        System.out.println("Largest:"+bigArray(biggestArray,8));
    }

    public static void printArray(int[] intArray) {
        System.out.println("Array contents printed through method:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void helloMassage(String fisrtName, String lastName) {
        System.out.println("Your full name is :" + fisrtName + " " + " " + lastName);

    }

    public static int average(int num1, int num2, int num3, int num4) {
        int total = ((num1 + num2 + num3 + num4) / 4);
        return total;
    }

    public static int bigArray(int[] biggestArray ,int total) {
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (biggestArray[i] > biggestArray[j])
                {
                    temp = biggestArray[i];
                    biggestArray[i] = biggestArray[j];
                    biggestArray[j] = temp;
                }
            }
        }
        return biggestArray[total-1];
    }
    public static ArrayList numArray(int a,int b , int c){
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        System.out.println("the array list "+arrayList);
        return  arrayList;
    }
}
