import java.util.Scanner;


public class proga2_3 {
    public static void f(double x, int ss){
        String res = "";
        int xx = (int)x;
        int k =0;
        while(xx>0){
            if (xx % ss >=10) {
               // char t = (char)(xx%ss) ;
                char r = (char)(xx%ss + 55);
                //res  = Character.toString(r)  + res;
                res  = r + res;
            }
            else  res = xx%ss + res;
            xx = xx / ss;
        }
       // System.out.println(res);
        res = res+',';
        int xr = 0;
        double xd =0;
        x = x - (int)x;
        for(int i=0; i<3; i++){
            xd = (x * ss);
            xr = (int)xd;
            if(xr > 9 ){
                res  = res + (char)(xr+55);
            }
            else    res = res + xr;
            x = xd - xr;
        }
        System.out.println("ss = " +  ss + "   res = " +res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int ss = in.nextInt();
        in.close();
        f(x, 2);
        f(x, 16);
        f(x, ss);


    }
}
