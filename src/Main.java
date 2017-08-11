import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Ajandek implements Comparable<Ajandek>
{
    String nev;
    LinkedList<ajandekok> ajandekok = new LinkedList<>();

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public LinkedList<ajandekok> getAjandekok() {
        return ajandekok;
    }

    public void setAjandekok(LinkedList<ajandekok> ajandekok) {
        this.ajandekok = ajandekok;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       
        sb.append(nev).append(": ");
        for (int i = 0; i < ajandekok.size(); i++) {
            
            if(i != ajandekok.size()-1){
                sb.append(ajandekok.get(i)).append(", ");
            }else{
                sb.append(ajandekok.get(i));
            }
        }
        return sb.toString();
    }

    
    
    @Override
    public int compareTo(Ajandek o) {
        if(o.ajandekok.size() != this.ajandekok.size()){
            return Integer.compare(o.ajandekok.size(), this.ajandekok.size());
        }
        
        return this.nev.compareTo(o.nev);
    }

  
}
      class ajandekok implements Comparable<ajandekok>
      {
     String ajandeknev;

        public ajandekok(String ajandeknev) {
            this.ajandeknev = ajandeknev;
        }

       

        public String getAjandeknev() {
            return ajandeknev;
        }

        public void setAjandeknev(String ajandeknev) {
            this.ajandeknev = ajandeknev;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ajandeknev);
        return sb.toString();
    }

    @Override
    public int compareTo(ajandekok t) {
        return -t.ajandeknev.compareTo(this.ajandeknev);
    }
//     
        
     
  


}

public class Main {

    public static void main(String[] args) {
        LinkedList<Ajandek> list = new LinkedList<>();
        LinkedList<Ajandek> list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int db = 0;
        
//        while(sc.hasNextLine())
        while(db != 4)
        {
           String[] sor = sc.nextLine().split(":");
           String linere = sor[1].replace("->", ":");
           String[] ajNev = linere.split(";");
           
           int index = 0;
           boolean tartalmaz = false;
           
            for (int i = 0; i < ajNev.length; i++) {
                String[] adat = ajNev[i].split(":");
                ajandekok aj = new ajandekok(adat[0]);
                if(list.isEmpty()){
                    Ajandek newAjandek = new Ajandek();
                    newAjandek.nev = adat[1];
                    newAjandek.ajandekok.add(aj);
                    list.add(newAjandek);
                }else{
                    for (int j = 0; j < list.size(); j++) {
                        if(list.get(j).nev.equals(adat[1]))
                        {
                            tartalmaz = true;
                            index = j;
                        }
                    }
                    if(tartalmaz){
                        list.get(index).ajandekok.add(aj);
                        tartalmaz = false;
                    }else{
                    Ajandek newAjandek = new Ajandek();
                    newAjandek.nev = adat[1];
                    newAjandek.ajandekok.add(aj);
                    list.add(newAjandek);
                    }
                }
            }
           
             db++;     
        }
        
        
        Collections.sort(list);
        list2.add(list.getFirst());
        int darab = list.get(0).ajandekok.size();
        for (int i = 1; i < list.size()-1; i++) {
            if(list.get(i).ajandekok.size() == darab){
                list2.add(list.get(i));
            }
        }
        for (Ajandek l1: list2) {
            Collections.sort(l1.ajandekok);
        }
        for (Ajandek l : list2) {
            System.out.println(l);
        }
        
    }
    
}
