public class App {
    public static void main(String[] args){

        Produto p1= new Produto("Arroz", 10, 6.32);
        System.out.println(p1);
        System.out.println("//*****************//*****************//");

        Venda v1= new Venda("10/03/2022", p1, 3);
        System.out.println("=== Primeira venda ===");
        System.out.println(v1);
        
        System.out.println("//*****************//*****************//");
        System.out.println("Situacao do Produto");
        System.out.println(p1);
        
    }
}
