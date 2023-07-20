public class Main{

    public static void main(String[] args) {

        int[] method1Input = {10,20,30,31,32,33,32,31};

        int method1Output[] = IntegerUtility.greaterThan(method1Input,30);

        for(int number: method1Output){

            System.out.print(number + " ");
        }

        System.out.println();


        int[] method2Input = {1,3,4,5,6,7,-3,-5,78};

        int[] method2Output = IntegerUtility.getOdds(method2Input);

        for(int number: method2Output){

            System.out.print(number + " ");
        }

        System.out.println();


        int[] method3Input = {1,2,3,4,5,6,7,8,9};

        int method3Output = IntegerUtility.search(method3Input,5);

        System.out.print(method3Output);

        System.out.println();

        int[] method4Input = {1,2,3,4,5,5,5,5,3,3};

        int[] method4Output = IntegerUtility.sort(method4Input);

        for(int number: method4Output){

            System.out.print(number + " ");
        }
        System.out.println();


        int[] method5Input = {2147483647, 2147483647};

        double method5Output = IntegerUtility.median(method5Input);

        System.out.print("median is " + method5Output);

        System.out.println();

        int[] a = {1,2,3,4,5,5,5,5,3,3};

        int[] b = {1,3,4,5,6,8,4,4,5,5};

        int[] method6Output = IntegerUtility.common(a,b);

        for(int number: method6Output){

            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println(5 / 2);
    }
}