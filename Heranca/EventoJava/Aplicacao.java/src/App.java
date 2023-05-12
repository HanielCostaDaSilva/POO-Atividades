public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------");
        Participante P1 = new Participante("José Carlos Anxieta", "Carlos.Anxieta@gmail.com", 13);
        Participante P2 = new Participante("Fernando Naruto", "Naruto.Anxieta@gmail.com", 32);
        Participante P3 = new Participante("Fabricio Kyoko Neiew", "Kyoko.Neiew@gmail.com", 63);
        Convidado C1  = new Convidado("Maria Fagundes", "SakuraOnichan@gmail.com", 60,"Pernambucanas");
        Convidado C2  = new Convidado("Lucas Fagundes", "HakunaTimao@gmail.com", 10,"Pernambucanas");
        Convidado C3  = new Convidado("Jean Guedes", "MatintaPereira@gmail.com", 49,"Pernambucanas");

        System.out.println("Participante 1: "+P1);
        System.out.println("Participante 2: "+P2);
        System.out.println("Participante 3: "+P3);
        System.out.println("Convidado 1: "+C1);
        System.out.println("Convidado 2: "+C2);
        System.out.println("Convidado 3: "+C3);

        System.out.println("Ingresso:1000 Reais, Participante 1 Paga : "+P1.getValorPago(1000.00));
        System.out.println("Ingresso:1000 Reais, Participante 2 Paga : "+P2.getValorPago(1000.00));
        System.out.println("Ingresso:1000 Reais, Participante 3 Paga : "+P3.getValorPago(1000.00));
        System.out.println("Ingresso:1000 Reais, Convidado 1: "+C1.getValorPago(1000.00));
        System.out.println("Ingresso:1000 Reais, Convidado 2: "+C2.getValorPago(1000.00));
        System.out.println("Ingresso:1000 Reais, Convidado 3: "+C3.getValorPago(1000.00));
    }
}