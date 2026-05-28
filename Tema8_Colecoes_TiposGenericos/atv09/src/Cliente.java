public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) obj;
        return nome.equals(cliente.nome);
    }


    @Override
    public int hashCode() {
        return nome.hashCode();
    }


}
