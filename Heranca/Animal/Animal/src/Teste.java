import jdk.dynalink.beans.StaticClass;

public class Teste {

    public  static void main(String[] args){

        Gato gato1= new Gato("Julio",23,4);
        Cachorro cachorro1= new Cachorro("SuaMae",60);
        
        System.out.println("=========================");
        System.out.println(gato1);
        System.out.println("=========================");
        System.out.println(cachorro1);
        System.out.println("=========================");
        
        /* Animal Bode1= new Animal("seuPai",60);
        System.out.println(Bode1); */
        System.out.println("=========================");
        
        Veterinario V1 = new Veterinario("Jacinto Pereira", "984896");

        System.out.println(V1.aplicarInjecao(gato1));
        
        System.out.println("=========================");
        System.out.println(V1.aplicarInjecao(cachorro1));
        System.out.println("=========================");
        /* System.out.println(V1.aplicarInjecao(Bode1)); */
        System.out.println();
    } 
}
