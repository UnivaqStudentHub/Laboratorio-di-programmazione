/*Esercizio 1. Scrivere un metodo statico iterativo che, dati un array bidimensionale di stringhe a, un array monodimensionale di caratteri c ed un intero k, 
restituisce true se in ogni riga a[i] esiste almeno una stringa il cui primo carattere e` uguale a c[i] e la cui lunghezza `e minore di k; altrimenti il metodo restituisce false.
Esempio: se a = {{"abc","bb","d"},{"rkr","rc"},{"mp","aqsfg","ats","ar"}},
c = {’b’,’r’,’a’} e k = 4, il metodo restituisce true.
Si assuma che gli array a e c abbiano lunghezza uguale, che ogni stringa in a sia non vuota e k > 0.
N.B. i) Occorre passare alla riga successiva non appena si trova in a[i] la prima stringa che soddisfa la condizione data.
ii) Occorre restituire false non appena si trova la prima riga a[i] che non soddisfa la condizione richiesta.
*/


public static boolean es1(String[][]a. char[]c, int k){
    int cont = new int[a.length];
    for(int i = 0; i<a.length;i++) {
        for(int j = 0, j<a[i].length && cont[i] = 0,  j++) {
            if(a[i][j].length<k && a[i][j].charAt[0] == c[i]) {
                cont[i] = 1;
            }
        }
    }
    if(cont[] == {1,1,1}){
        es1 = true;
    }
return es1;
}