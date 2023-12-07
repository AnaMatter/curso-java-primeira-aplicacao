import modelo.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente( 2l, "VAL", "val@gmail.com");
        // cliente.setId(new Long(1));
        cliente.setId(1l);
        cliente.setNome("ANINHA");
        cliente.setEmail("anamatter@hotmail.com");


        System.out.println(cliente.transformarNomeEmMinusculo());
        System.out.println(cliente2.transformarNomeEmMinusculo());

   }


}