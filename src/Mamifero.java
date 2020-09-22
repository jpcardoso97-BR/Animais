public class Mamifero extends Animal{
    public String corDoPelo;

    public Mamifero(String nome, int idade, int quantidadeDeMembros, double peso, String corDoPelo) {
        super(nome, idade, quantidadeDeMembros, peso);
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitiu um som de mamífero");
    }
}
