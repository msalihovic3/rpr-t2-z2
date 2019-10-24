package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
     double pocetna, krajnja;
     boolean pripada_poc,pripada_kraj;
    public Interval(double poc, double kraj, boolean pripada1, boolean pripada2){
        if(poc>kraj) throw new IllegalArgumentException("Nije tacno");
        pocetna=poc;
        krajnja=kraj;
        pripada_poc=pripada1;
        pripada_kraj=pripada2;
    }
    public Interval(){
        pocetna=0;
        krajnja=0;
        pripada_poc=false;
        pripada_kraj=false;
    }
    boolean isNull(){
        if(pocetna==0 && krajnja==0 && pripada_poc==false && pripada_kraj==false){
            return true;
        }
        else{
            return false;
        }

    }
    boolean isIn(double tacka){
        if(pripada_poc == true && pripada_kraj == true){
            if(tacka>=pocetna && tacka<=krajnja) return true;
            else return false;
        }
        else if(pripada_poc == true && pripada_kraj == false){
            if(tacka>=pocetna && tacka<krajnja){
                return true;
            }
            else return false;
        }
        else if(pripada_poc== false && pripada_kraj == true){
            if(tacka>pocetna && tacka<=krajnja){
                return true;
            }
            else return false;
        }else{
            if(tacka>pocetna && tacka<krajnja){
                return true;
            }
            else return false;
        }
    }
   public Interval intersect(Interval int2){
        Interval int3;
        if(this.pocetna>=int2.pocetna && this.krajnja>=int2.krajnja){
            int3=new Interval(int2.pocetna,int2.krajnja,int2.pripada_poc,int2.pripada_kraj);
        }else if(this.krajnja< int2.pocetna || int2.krajnja<this.pocetna ) {

            int3 = new Interval();
        }
        else if
   }

}
