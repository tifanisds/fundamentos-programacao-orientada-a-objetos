class Pessoa {
    String nome;
    int idade;
    
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    void apresentar() {
        System.out.println("Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n");
    }
    
}

class Main {
    public static void main(String[] args) {
        Pessoa tifani = new Pessoa("Tífani", 19);
        
        tifani.apresentar();
    }
}