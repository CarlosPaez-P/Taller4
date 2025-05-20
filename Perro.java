public class Perro extends Animal {
    // Esto NO es sobrescritura, es sobrecarga(no polimórfico) lo cual es una mala practica y genera mas problemas 
    // public void hacerSonido(String tipo) {
    //     System.out.println("El perro ladra: " + tipo);
    // }
    @Override
    // Esto es sobrescritura (polimórfico)
    // El método hacerSonido() de la clase Animal es sobreescrito
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
