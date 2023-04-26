public class App {
    public static void main(String[] args) throws Exception {
        Automovel C1 = new Automovel("AB2C45", "MOTO", "João Carlos", "Mario José", "Alfredo Da Rocha", "Maria Clara");

        System.out.println(C1);

        System.out.println("Removendo passageiro inexistente ");
        try {

            C1.removerPassageiro("Mario Paulo");
        } catch (Exception E) {

            System.out.println(E.getMessage());

        }
        System.out.println("Checando se João Carlos é o proprietario: ");
        System.out.println(C1.conferirProprietario("João Carlos"));

    }
}
