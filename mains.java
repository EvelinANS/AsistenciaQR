public class mains {

    public static void main(String[] args) {
        usuario user = new usuario("Evelin", "Angeles");
        user.getNombre();
        System.out.println(user.getNombre());

        user.getRol();
        System.out.println(user.getRol());
    }
    
}
