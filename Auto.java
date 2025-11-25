public class Auto extends Vehiculo implements Mantenible{
    private int cantPuertas;

    public Auto(String marca, int modelo, String patente, int kilometraje, int cantPuertas) {
        super(marca, modelo, patente, kilometraje);
        this.cantPuertas = cantPuertas;
    }
    public int getCantPuertas(){ return cantPuertas;}
    public void setCantPuertas(int cantPuertas){this.cantPuertas = cantPuertas;}

    //sobreescritura del metodo abstracto
    public String mostrarDetalles(){
        return String.format("auto  | %-10s | %-5d | %-8s | %-10d | Puertas:%d",getMarca(), getModelo(), getPatente(), getKilometraje(), cantPuertas); }
    

    //implementacion del metodo de la interfaz mantenible
    public double calcularCostoMantenimiento(int kilometraje, int anio){
        return 5000 + (kilometraje * 0.15) + (2024-anio) * 300;
    }
}


