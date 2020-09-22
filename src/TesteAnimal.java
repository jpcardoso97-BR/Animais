public class TesteAnimal {
    public static void main(String[] args) {
        Mamifero lobo = new Lobo("Lobo", 10, 4, 20, "Cinza");
        Mamifero cachorro = new Cachorro("Cachorro", 5, 4, 8, "Branco");

        lobo.emitirSom();
        cachorro.emitirSom();
    }
}
