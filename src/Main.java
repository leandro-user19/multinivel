import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Horas: ");
        int horas = sc.nextInt();

        System.out.print("Valor hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Publicaciones: ");
        int publicaciones = sc.nextInt();

        PersonaAcademica p = new DocenteInvestigador(codigo, nombre, edad, horas, valorHora, publicaciones);

        DocenteInvestigador d= new DocenteInvestigador(codigo, nombre, edad, horas, valorHora, publicaciones);
        d.mostrarDatos();
        d.describirRol();
        System.out.println("Publicaciones: " + d.getPublicaciones());
        System.out.println("Valor por hora: " + d.getValorHora());
        System.out.println("Pago: " + d.calcularPago());


    }
}
