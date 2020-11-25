import java.io.FileWriter;
import java.io.IOException;

public class SkrivBlogg {
    public static void main(String[] args) {

    }

    public static boolean skriv(Blogg samling, String mappe, String filnavn){

        try {
            FileWriter fs = new FileWriter(mappe + filnavn);

            fs.write(samling.toString());
            fs.close();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

class Innlegg {

    int id;
    String bruker;
    String dato;
    int likes;

    Innlegg() {
    }


    Innlegg(int id, String bruker, String dato) {

        this.id = id;
        this.bruker = bruker;
        this.dato = dato;

    }

    Innlegg(int id, String bruker, String dato, int likes) {

        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBruker() {
        return bruker;
    }

    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void doLike() {
        likes = likes + 1;
    }

    public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes;
    }

    public boolean erLik(Innlegg innlegg) {

        if (this.id != innlegg.getId()) {
            return false;
        }
        return true;
    }
}

class Tekst extends Innlegg {

    String tekst;

    Tekst() {

    }

    Tekst(String tekst, int id, String bruker, String dato) {

        this.tekst = tekst;
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;

    }

    Tekst(String tekst, int id, String bruker, String dato, int likes) {

        this.tekst = tekst;
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;

    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String toString(){
        return super.toString() + "\n" + tekst;
    }
}

class Bilde extends Tekst {

    String bildeURL;

    Bilde() {
    }

    Bilde(String url, int id, String bruker, String dato, int likes) {

        this.bildeURL = url;
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;

    }

    public String getBildeURL() {
        return bildeURL;
    }

    public void setBildeURL(String bildeURL) {
        this.bildeURL = bildeURL;
    }

    public String toString(){
        return super.toString() + "\n" + bildeURL;
    }
}

class Blogg{

    Innlegg[] innleggstabell;
    int nesteledig;

    Blogg(){
        this.innleggstabell = new Innlegg[20];
        nesteledig = 0;
    }

    Blogg(int lengde){
        this.innleggstabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    public int getAntall(){
        int antallInnlegg = 0;
        for (int i = 0; i < this.innleggstabell.length; i ++)
            if (this.innleggstabell[i] != null) {
                antallInnlegg++;
            }
        return antallInnlegg;
    }

    /*public Innlegg[] getSamling(){

    }*/

    public int finnInnlegg(Innlegg innlegg){

        for (int i = 0; i < this.innleggstabell.length; i ++)
            if (this.innleggstabell[i].erLik(innlegg)) {
                return i;
            }
        return -1;
    }

    public boolean finnes(Innlegg innlegg){
        for (int i = 0; i < this.innleggstabell.length; i ++)
            if (this.innleggstabell[i].erLik(innlegg)) {
                return true;
            }
        return false;
    }

    public boolean ledigPlass(){

        if(nesteledig < innleggstabell.length){
            return true;
        }
        return false;
    }

    public String toString(){
        return getAntall() + "\n" + innleggstabell.toString();
    }
}
