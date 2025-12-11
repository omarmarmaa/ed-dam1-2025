import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        //añadir datos
        cliente1.setTelefono("");
        cliente1.setNombre("juan");
        cliente1.setApellidos(" ");
        cliente1.setDireccion(" ");
        cliente1.setNif(" ");
        cliente1.setEmail(" ");
        cliente1.setLocalidad(" ");
        cliente1.setProvincia(" ");
        cliente1.setFacturas(new ArrayList<Factura>());


        //visualizar atributos
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getApellidos());
        System.out.println(cliente1.getDireccion());
        System.out.println(cliente1.getEmail());
        System.out.println(cliente1.getNif());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getLocalidad());
        System.out.println(cliente1.getProvincia());

        Factura factura1=new Factura();
        //añadir datos
        factura1.setNombre(" ");
        factura1.setConcepto(" ");
        factura1.setNif(" ");
        factura1.setNumFactura(" ");
        factura1.setFecha(" ");
        factura1.setImporte(" ");
        cliente1.getFacturas().add(factura1);


        //visualizar datos
        System.out.println(factura1.getNombre());
        System.out.println(factura1.getNif());
        System.out.println(factura1.getFecha());
        System.out.println(factura1.getConcepto());
        System.out.println(factura1.getNumFactura());
        System.out.println(factura1.getImporte());
        System.out.println(cliente1.getFacturas().get(0).getNombre());
    }
}