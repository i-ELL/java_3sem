package NewShops;

import java.util.Vector;

public class Shop {
    //private String[] Comps;
    private String[] Comps;
    private int n;
    public Shop(){}
    public Shop(int n, String[] comps){
        this.n = n;
        this.Comps =new  String[n];
    }
    public String[] add(String s){
        //this.Comps.add(i, s);
        String[] temp = new String[n+1];
        for(int i=0; i<n; i++){
            temp[i] = this.Comps[i];
        }
        temp[n] = s;
        Comps = temp;
        return Comps;
    }
    public String[] del(int k){
        //this.Comps.remove(i);

        return Comps;
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

   // public Vector getComps() {
      //  return Comps;
   // }

    //public void setComps(Vector comps) {
       // Comps = comps;
  //  }


}
