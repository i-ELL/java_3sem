package package_6to9;
import java.util.ArrayList;

public class Shop implements Printable{
    ArrayList<Computer> computers = new ArrayList<>();
    void addComputer(Computer computer){
        computers.add(computer);
    }
    void deleteComputer(String name){
        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).name.equals(name)){
                computers.remove(i);
            }
        }
    }
    void findComputer(String name){
        boolean flag = false;
        for(int i = 0; i < computers.size(); i++){
            if(computers.get(i).name.equals(name)) {
                flag = true;
            }
        }
        if(flag){
            System.out.println("have");
        }
        else{
            System.out.println("have not");
        }
    }
    public void print(){
        for(int i=0; i< computers.size(); i++) {
            System.out.println(computers.get(i).name);
        }
    }
}