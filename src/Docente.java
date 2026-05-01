public class Docente extends PersonaAcademica{
    private int horasClase;
    private double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        setValorHora(valorHora);
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente");
    }

    @Override
    public double calcularPago() {

        return horasClase*valorHora;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        if(horasClase>=1&&horasClase<=40){
            this.horasClase=horasClase;
        }else{
            System.out.println("Horas no admitidas");
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora>0){
            this.valorHora=valorHora;
        }else{
            System.out.println("Valor de hora no admitido");
        }
    }
}
