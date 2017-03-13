/**
 * Created by Emil Käck on 2017-03-13.
 */
public class Kort {
    //class för alla kort.
    public  static  final int klöver = 0;
    public  static  final int ruter = 1;
    public  static  final int hjärter = 2;
    public  static  final int spader = 3;

    public static final int knäkt = 11;
    public static final int dam = 12;
    public static final int kung = 13;
    public static final int ess = 14;

    int färg;
    int nummer;

    public String toString(){
        //inte klar
        if(this.färg == 0){
            this.färg = "Klöver";
        } else if (this.färg == 1){
            this.färg = "Ruter";
        } else if (this.färg == 2){
            this.färg = "Hjärter";
        } else
            this.färg = "Spader";

        if(this.nummer == 11){
            this.nummer == "Knäkt";
        } else if(this.nummer == 12){
            this.nummer == "Dam";
        } else if(this.nummer == 13){
            this.nummer == "Kung";
        } else if(this.nummer == 14){
            this.nummer == "Ess";
        } else
            return this.färg + " " + this.nummer;

        return this.färg + " " + this.nummer;

    }
}
