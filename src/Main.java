public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        //añadir datos
        cliente1.setTelefono(" ");
        cliente1.setNombre(" ");
        cliente1.setApellidos(" ");
        cliente1.setDireccion(" ");
        cliente1.setNif(" ");
        cliente1.setEmail(" ");
        cliente1.setLocalidad(" ");
        cliente1.setProvincia(" ");


        //visualizar atributos
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getApellidos());
        System.out.println(cliente1.getDireccion());
        System.out.println(cliente1.getEmail());
        System.out.println(cliente1.getNif());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getLocalidad());
        System.out.println(cliente1.getProvincia());


    }
}