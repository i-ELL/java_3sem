package package_2_3;

public class Main {


        public static <E> void  sid  (String s, E [] arr){

            E [] a = arr;
            AnyTypeArray <E> sid = new AnyTypeArray <E> ();
            sid.setArr(a);

            System.out.print(s + "  ");

            for(int i = 0; i< sid.getLength(); i++)
                System.out.print(sid.getArrIndex(i)+" ");

            System.out.println();
            sid.printFirstFive();
        }



        public static void main(String [] args){

            String [] arr_str = {"line 1", "line 2", "line 3"};
            sid("String" , arr_str);

            Integer [] arr_int = { 0,1,2,3,4,5,6,7,8};
            sid("Integer" , arr_int);

            Double [] arr_double = {0.56, 450.56, 47.23, 78.8};
            sid("Double" , arr_double);


        }

    }

