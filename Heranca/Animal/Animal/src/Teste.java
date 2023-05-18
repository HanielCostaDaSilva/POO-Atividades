import java.util.ArrayList;

public class Teste {

    public  static void main(String[] args){

        Gato G1= new Gato("Julio",23,4);
        Gato G2= new Gato("Gaita",34,2);
        Gato G3= new Gato("Linda",34,7);
        Cachorro C1= new Cachorro("SuaMae",60);
        Cachorro C2= new Cachorro("SuaTia",12);
        Cachorro C3= new Cachorro("SuaVó",03);
        
        /* System.out.println("=========================");
        System.out.println(G1);
        System.out.println(G2);
        System.out.println(G3);
        System.out.println("=========================");
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println("========================="); */
        
        /* Animal Bode1= new Animal("seuPai",60);
        System.out.println("=========================");
        System.out.println(Bode1); */
        
        Veterinario V1 = new Veterinario("Jacinto Pereira", "984896");
        
        /* 
        System.out.println(V1.aplicarInjecao(G1));
        
        System.out.println("=========================");
        System.out.println(V1.aplicarInjecao(C2));
        System.out.println("=========================");
        System.out.println(V1.aplicarInjecao(Bode1));
        System.out.println();
        */
        
        /*Lista polimórfica */
        
        
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        
        listaAnimais.add(C1);
        listaAnimais.add(G1);
        listaAnimais.add(C2);
        listaAnimais.add(G2);
        listaAnimais.add(C3);
        listaAnimais.add(G3);
        
        for (Animal A : listaAnimais){
            System.out.println("=========================");
            System.out.println(A);
            
        };
        System.out.println("=========================");

        float peso=0;
        Animal animalMaisPessado = null;

        for(Animal a : listaAnimais){
            if (peso< a.getPeso()){
                peso=a.getPeso();
                animalMaisPessado= a;
            }
        }

        System.out.println("o animal mais pesado da lista é: "+ animalMaisPessado.toString());
        System.out.println("=========================");
        System.out.println("o veterinário: "+ V1.nome +"irá aplicar injeções em gatos....");
        System.out.println("=========================");
        for(Animal a : listaAnimais){
        	if ( a instanceof Gato ) V1.aplicarInjecao(a);
            };
        }
}
