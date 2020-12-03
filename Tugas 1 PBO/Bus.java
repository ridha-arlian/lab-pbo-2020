import java.util.ArrayList;

public class Bus{
    private ArrayList <Penumpang> penumpangBiasa;
    private ArrayList <Penumpang> penumpangPrioritas;
    
    public Bus(){
        this.penumpangBiasa = new ArrayList <Penumpang>();
        this.penumpangPrioritas = new ArrayList <Penumpang>();
    }
    
    public ArrayList <Penumpang> getPenumpangBiasa(){
        return this.penumpangBiasa;
    }

    public ArrayList <Penumpang> getPenumpangPrioritas(){
        return this.penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        return this.penumpangBiasa.size();
    }

    public int getJumlahPenumpangPrioritas(){
        return this.penumpangPrioritas.size();
    }

    public boolean NaikPenumpang(Penumpang penumpang){
        if(penumpang.getHamil() ==true || penumpang.getUmur() <10 || penumpang.getUmur() >60){
            if(getJumlahPenumpangPrioritas() <2){
                this.penumpangPrioritas.add(penumpang);
                return true;
            }

        }else if(penumpangPrioritas.size() == 2 && penumpangBiasa.size() <= 4){
            this.penumpangBiasa.add(penumpang);
            return true;
        }

        if(getJumlahPenumpangBiasa() <4){
            this.penumpangBiasa.add(penumpang);
            return true;
        }

        return false;
    }

    public boolean turunkanPenumpang(String nama){
        ArrayList<Penumpang> penumpangBia = getPenumpangBiasa();
        for(Penumpang pB : penumpangBia){
            String temp = pB.getNama();
            if(temp.equalsIgnoreCase(nama)){
                this.penumpangBiasa.remove(pB);
                return true;
            }
        }

        ArrayList<Penumpang> penumpangPrio = getPenumpangPrioritas();
        for(Penumpang pP : penumpangPrio){
            String temp = pP.getNama();
            if(temp.equalsIgnoreCase(nama)){
                this.penumpangPrioritas.remove(pP);
                return true;
            }
        }

        return false;
    }

    public String toString(){
        int i=0;
        String temp = "Penumpang Biasa: ";
        ArrayList<Penumpang> penumpangBia = getPenumpangBiasa();
        for(Penumpang pB : penumpangBia){
            if(i!=0){
                temp += ", ";
            }
            temp += pB.getNama();
            i += 1;
        }
        if(i==0){
            temp += "Tidak Ada Penumpang";
        }
        temp += "\nPenumpang Prioritas: ";
        i = 0;

        ArrayList<Penumpang> penumpangPrio = getPenumpangPrioritas();
        for(Penumpang pP : penumpangPrio){
            if(i!=0){
                temp += ", ";
            }
            temp += pP.getNama();
            i += 1;
        }
        if(i==0){
            temp += "Tidak Ada Penumpang";
        }
        temp += "\nJumlah Penumpang: " +Integer.toString(getJumlahPenumpangBiasa() + getJumlahPenumpangPrioritas());
        
        return temp;
    }
}