public class Perro extends animal{
    private String raza;


    public Perro() {
    }

    public Perro(String nombre, int edad, double peso, String propietario, String raza) {
        super(nombre, edad, peso, propietario);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double calcularDosis() {
        return peso * 2;
    }

    @Override
    public String toString() {
        return "========== PERRO ==========\n\n" +
                super.toString() +
                "\nRaza: " + raza +
                "\n\nDosis recomendada: " + calcularDosis() + " ml";
    }
}