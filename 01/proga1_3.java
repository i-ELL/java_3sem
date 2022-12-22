public class proga1_3 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double sum=0;
        for (int i = 0; i < 10; i++){
            arr[i] = 1 / ((double)i+1);
            sum+= arr[i];
            System.out.printf("%.2f", arr[i]);
            System.out.print(" ");
            //System.out.print(arr[i]);
        }
        System.out.println();
        String result = String.format("%.2f",sum);
        System.out.print(result);
    }
}


