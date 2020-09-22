public class Animal {
    private String nome;
    private int idade;
    private int quantidadeDeMembros;
    private double peso;

    public Animal(String nome, int idade, int quantidadeDeMembros, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDeMembros = quantidadeDeMembros;
        this.peso = peso;
    }

    public void movimento(){
        System.out.println("Movimento");
    }

    public void emitirSom(){
        System.out.println("Emitiu um som");
    }
}
