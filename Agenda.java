import java.util.Arrays;

/** NO MODIFICAR: modelo simple de contacto */
class Contacto {
    private final String nombre;
    private final String email;
    private final String telefono; // puede venir con espacios
    private final boolean favorito;

    public Contacto(String n, String e, String t, boolean f){
        nombre=n; email=e; telefono=t; favorito=f;
    }
    public String getNombre(){ return nombre; }
    public String getEmail(){ return email; }
    public String getTelefono(){ return telefono; }
    public boolean isFavorito(){ return favorito; }

    @Override public String toString(){
        return nombre+" <"+email+"> "+telefono+(favorito?" ★":"");
    }
}

public class Agenda {

    /**
     * Devuelve el índice del PRIMER contacto cuyo nombre EMPIEZA por el prefijo dado.
     * Ignora mayúsculas/minúsculas. Si no existe, -1.
     */
    public static int buscarNombreParcial(Contacto[] a, String prefijo) {
        // TODO
        for(i=0; i<a.length; i++){
            if(a[i].getNombre().startsWith(prefijo)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Devuelve un NUEVO array con los contactos marcados como favoritos (favorito==true).
     * Mantén el orden de aparición.
     */
    public static Contacto[] soloFavoritos(Contacto[] a) {
        int t=0;
        for(i=0; i<a.length; i++){
            if(a[i].isFavorito()){
                t++;
            }
        }
        Contacto[] indice=new Contacto[t];
        t=0;
        for(i=0; i<a.length; i++){
            if(a[i].isFavorito()){
                indice[t]=a[i];
                t++;
            }
        }
                // TODO
        return indice;
    }

    /**
     * Devuelve un NUEVO array de contactos donde el teléfono de cada uno está “limpio” (sin espacios).
     * No modifiques los objetos originales: crea Contacto nuevo por cada posición.
     */
    public static Contacto[] telefonosNormalizados(Contacto[] a) {
        Contacto[] indice =new Contacto[a.length];
        for(i=0; i<a.length; i++){
            boolean fav=a[i].isFavorito();
            String telefono=a[i].getTelefono().replace(" ","");
            String nombre=a[i].getNombre();
            String email=a[i].getEmail();
            indice[i]=new Contacto(fav,nombre,email,telefono);
        }
     
        return indice;
    }

    /**
     * Devuelve un subarray [from, to) de contactos (to excluido).
     * Ajusta límites a 0..length y, si from>to, iguala from=to para evitar errores.
     */
    public static Contacto[] pagina(Contacto[] a, int from, int to) {
from=Math.max(0, from);
to=Math.min(a.length, to);
if(from>to){
    from=to;
        // TODO
        
    }
    return Arrays.copyOfRange(a, from, to);
    }
    public static void main(String[] args) {
        Contacto[] ag = {
                new Contacto("Alba","a@x.com","600 111 222", true),
                new Contacto("miguel","m@x.com","  699 333", false),
                new Contacto("Bea","b@x.com","612444555", true)
        };
        // Pruebas si lo deseas:
        System.out.println("Empieza por 'mi': " + buscarNombreParcial(ag, "mi"));
        System.out.println("Favoritos: " + Arrays.toString(soloFavoritos(ag)));
        System.out.println("Tel. normalizados: " + Arrays.toString(telefonosNormalizados(ag)));
        System.out.println("Página [0,2): " + Arrays.toString(pagina(ag, 0, 2)));
    }
}


