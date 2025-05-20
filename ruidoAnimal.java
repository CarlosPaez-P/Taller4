public class Ejercicio3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal perro = new Perro();

        a.hacerSonido();
        perro.hacerSonido();

        // Si descomentas el método hacerSonido(String tipo) en Perro,
        // no sobrescribe el método de Animal, solo lo sobrecarga.
        // Además, si no usas @Override, puedes cometer errores de firma
        // y el compilador no te avisará.
    }
} {
    
}
