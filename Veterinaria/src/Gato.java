public class Gato extends animal{


    private String tipo;


    public Gato() {
    }


    public Gato(String nombre, int edad, double peso, String propietario, String tipo) {
        super(nombre, edad, peso, propietario);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularAlimento() {
        return peso * 15;
    }

    @Override
    public String toString() {
        return "========== GATO ==========\n\n" +
                super.toString() +
                "\nTipo: " + tipo +
                "\n\nAlimento recomendado: " + calcularAlimento() + " gramos";
    }
}