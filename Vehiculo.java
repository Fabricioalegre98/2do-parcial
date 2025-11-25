import java.util.Objects;



public abstract class Vehiculo implements Identificable {
    //atributos privados para cumplir con el encapsulamiento
    private String marca;
    private int modelo;
    private String patente;
    private int kilometraje;

    //constructor parametrizado
    public Vehiculo(String marca, int modelo, String patente, int kilometraje) {
    this.marca = marca;
    this.modelo = modelo; //año del modelo
    this.patente = patente.toUpperCase();
    this.kilometraje = kilometraje;
    }
    
    //getters y setters
    public String getMarca() { return marca;}
    public void setMarca(String marca){this.marca = marca;}
    public int getModelo(){return modelo;}
    public void setModelo(int modelo){this.modelo = modelo;}
    public String getPatente(){return patente; }
    public void setPatente(String patente){this.patente = patente.toUpperCase();}
    public int getKilometraje(){return kilometraje;}
    public void setKilometraje(int kilometraje){ this.kilometraje = kilometraje;}

//implementacion del metodo de la interfaz
    public String getIdentificador() {
        return this.patente;

    }


//metodo abstracto que las subclases deberar sobreescribir
    public abstract String mostrarDetalles();

    //metodo sobrecargado
    public void agregarRecorrido(int km){
        this.kilometraje += km;
        System.out.println("se agregaron" + km + "Km. kilometraje actual:" + this.kilometraje);
    }

    public void agregarRecorrido(double km){
        this.kilometraje += km;
        System.out.println("se agregaron" + km + "Km. kilometraje actual:" + this.kilometraje);
        
    }
    //redefinicion de equals() y hashcode()para identificar vehiculos por patente

     public boolean equals(Object o){
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;
     Vehiculo vehiculo = (Vehiculo) o;
     //Se utiliza el metodo equals de String para comparar las pantentes
     return patente.equals(vehiculo.patente);
     }

     public int hashCode(){
        //se basa en el hashcode de la patente
     return Objects.hash(patente);
     }

}
