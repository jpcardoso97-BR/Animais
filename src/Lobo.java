public class Lobo extends Mamifero{
    public Lobo(String nome, int idade, int quantidadeDeMembros, double peso, String corDoPelo) {
        super(nome, idade, quantidadeDeMembros, peso, corDoPelo);
    }
    @Override
    public void emitirSom(){
        System.out.println("Emitiu um rugido");
    }
}
