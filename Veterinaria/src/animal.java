public class animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String propietario;

    public animal() {
    }

    public animal(String nombre, int edad, double peso, String propietario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad + " años" +
                "\nPeso: " + peso + " kg" +
                "\nPropietario: " + propietario;
    }

}