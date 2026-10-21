//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Total: " + Dispositivo.getTotalCreados()); // 0

        Dispositivo d1 = new Dispositivo("Laptop Dell", "Computadora");
        System.out.println("Total: " + Dispositivo.getTotalCreados()); // 1

        Dispositivo d2 = new Dispositivo("iPhone 15", "Teléfono");
        Dispositivo d3 = new Dispositivo("Impresora HP", "Periférico");
        System.out.println("Total: " + Dispositivo.getTotalCreados()); // 3

        // Cada objeto conserva sus propios datos
        d1.mostrarInfo();
        d2.mostrarInfo();
        d3.mostrarInfo();

        Dispositivo d4 = new Dispositivo("Router TP-Link", "Red");
        Dispositivo d5 = new Dispositivo("Tablet Samsung", "Tableta");
        System.out.println("Total: " + Dispositivo.getTotalCreados()); // 5
    }
}