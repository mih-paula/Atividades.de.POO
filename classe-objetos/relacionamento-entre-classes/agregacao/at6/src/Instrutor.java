public class Instrutor {
    private String nome, formacao, email;
    private int experienciaAnos;

    public Instrutor(String nome, String formacao, int experienciaAnos, String email){
        this.nome=nome;
        this.formacao=formacao;
        this.experienciaAnos=experienciaAnos;
        this.email=email;
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getFormacao(){
        return formacao;
    }
    public int getExperienciaAnos(){
        return experienciaAnos;
    }



    public void Instrutor(){
        System.out.println("Instrutor: " + nome);
        System.out.println("Formação: " + formacao);
        System.out.println("Experiência: " + experienciaAnos + "anos");
        System.out.println("Email: " + email);
    }


    public void aplicarAvaliacao(String cursoNome){
        System.out.println("O instrutor " + nome + " está aplicando avaliação no curso: " + cursoNome);
    }


    public void responderDuvidas(String duvida){
        System.out.println("Respondendo dúvida: " + duvida);
        System.out.println("Resposta: Verifique no material de apoio, por gentileza." );
    }


    public void criarMaterialDeApoio(String titulo){
        System.out.println("Material " + titulo + " criado pelo instrutor " + nome);

    }


    public void agendarLive(String dataHora){
        System.out.println("Live agendada para " + dataHora + " com o instrutor " + nome);

    }

}
