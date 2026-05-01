public class DocenteInvestigador extends Docente {
    private int publicaciones;


    public DocenteInvestigador(String codigo, String nombre, int edad, int horasClase, double valorHora, int publicaciones) {
        super(codigo, nombre, edad, horasClase, valorHora);
        setPublicaciones(publicaciones);
    }


    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        } else {
            System.out.println("Número de publicaciones inválido");
        }
    }

    @Override
    public double calcularPago() {
        double pagoBase = super.calcularPago();
        double bono = publicaciones * 20;
        return pagoBase + bono;


    }

    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente Investigador");
    }


}

