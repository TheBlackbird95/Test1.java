import java.util.Arrays;

/**
 * TEST 1 JAVA
 * Oblasti pokrivene testom: PROMENLJIVE, GRANANJA, PETLJE, NIZOVI, METODE
 * Vreme trajanja testa: 120 minuta
 * Maksimalan broj poena: 100
 * Broj poena po zadatku: 20
 * <p>
 * Ime klase: ImePrezime(PeraPeric)
 * Napomena: Zadatak se smatra uradjenim ukoliko implementira zadatu funkcionalnost sa arbitrarnim argumentima.
 * Neki od mogucih argumenata su dati u javadoc opisu implementacije.
 * Ne menjati potpise metoda zbog brzeg i lakseg uvida u rad.
 * Voditi racuna da metoda vraca zahtevanu vrednost.
 * <p>
 * Po zavretku upload-ovati file na uploadLokacija.
 * UploadLokacija: https://drive.google.com/drive/folders/17gLXRxx8l7Y_JN8WsAlXVjpRGwd8dq4z
 */
public class Milos_Kos {

    /**
     * Implementirati deskripciju numericke ocene.
     * 5 - odlican
     * 4 - vrloDobar
     * 3 - dobar
     * 2 - dovoljan
     * 1 - nedovoljan
     * Za svaku ocenu koja nije 1-5 vratiti prazan string ""
     *
     * @param ocena ocena
     * @return deskripcija numericke ocene
     */
    public static String ocene(int ocena) {
        String opisOcene;
        switch (ocena) {
            case 1:
                opisOcene = "Nedovoljan";
                break;
            case 2:
                opisOcene = "Dovoljan";
                break;
            case 3:
                opisOcene = "Dobar";
                break;
            case 4:
                opisOcene = "Vrlo dobar";
                break;
            case 5:
                opisOcene = "Odlican";
                break;
            default:
                opisOcene = "";
        }
        return opisOcene;
    }

    /**
     * Implementirati metodu koja vraca sumu svih elemenata niza, i to tako da je
     * svaki element pomnozen sa indeksom na kojim se nalazi.
     * {1, 2, 3, 4, ...} -> (1 * 0) + (2 * 1) + (3 * 2) + (4 * 3) + ...
     * {99} -> 99 * 0
     * {} -> 0
     *
     * @param niz unos niz
     * @return suma
     */
    public static int proizvodElemenataNizaSaIndeksima(int[] niz) {
        int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            sum += niz[i] * i;
        }
        return sum;
    }

    /**
     * Implementirati metodu koja pretvara niz od String podataka u niz
     * u kome su svi stringovi mala slova.
     * {"Stefan", "Dusan", "Ana"} -> {"stefan", "dusan", "ana"}
     * {"ZDRAVO JA SAM PROGRAM"} -> {"zdravo ja sam program"}
     * {"ZDRAVO JA", "SAM PROGRAM"} -> {"zdravo ja", "sam program"}
     * {} -> {}
     *
     * @param niz unos niz
     * @return novi niz sa malim slovima
     */
    public static String[] lowerCaseNiz(String[] niz) {
        String[] maliNiz = new String[niz.length];
        for (int i = 0; i < niz.length; i++) {
            maliNiz[i] = niz[i].toLowerCase();
        }
        return maliNiz;
    }

    /**
     * Implementirati metodu koja vraca indeks na koji treba ubaciti element,
     * tako da je redosled elemenata sacuvan. Pretpostaviti da je niz rastuci.
     * ({1, 2, 3, 4, 5}, 1.5) -> 1
     * ({77, 78, 79, 80, 81}, 76.999999) -> 0
     * ({-11, -10, -9, -8, -7}, 7) -> 5
     *
     * @param element broj
     * @param niz     niz kao input
     * @return index
     */
    public static int indexGdeElementPripada(int element, int[] niz) {
        // ukoliko je niz iskljucivo rastuci
        // da ne bismo brinuli o ljudskoj gresci, mozemo dodati Arrays.sort

        int index = 0;
        for (int i = 0; i < niz.length; i++) {
            if (element > niz[niz.length - 1]) {
                index = niz.length;
                break;
            }
            if (element <= niz[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Implementirati metodu koja vraca slovo koje fali u nizu alfabeta.
     * Alfabet : A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
     * ABD -> "C"
     * IJKLN -> "M"
     * WXYZ -> ""
     *
     * @param nizSlova niz slova. Ne mora pocinjati sa "A"
     * @return slovo koje nedostaje, ili prazan string "" ukoliko je redosled ispravan
     */
    public static String abeceda(String nizSlova) {
        String izvorIstine = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int indexSlova = izvorIstine.indexOf(nizSlova.charAt(0));
        String karakterKojiNedostaje = "";
        for (int i = indexSlova, indexNizaSlova = 0; indexNizaSlova < nizSlova.length(); i++, indexNizaSlova++) {
            if (nizSlova.charAt(indexNizaSlova) != izvorIstine.charAt(i)) {
                karakterKojiNedostaje = String.valueOf(izvorIstine.charAt(i));
                break;
            }
        }
        return karakterKojiNedostaje;
    }

    public static void main(String[] args) {
        //    System.out.println("Deskripcija ocene je " + ocene(5));
        //    System.out.println(proizvodElemenataNizaSaIndeksima(new int[] {1,2,3,4}));
        //    System.out.println(Arrays.toString(lowerCaseNiz(new String[]{"Cao, JA", "Sam Milos"})));
        //    System.out.println(indexGdeElementPripada(12, new int[] {1,2,3,5,6}));
        System.out.println(abeceda("abc"));
    }
}
