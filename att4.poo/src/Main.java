public class Main {
    public static void main(String[] arg) {
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Hilux ");
        meuCarro.setAno(2026);
        meuCarro.setCor("Branco");
        meuCarro.setPlaca("F0F0");

        Pessoa emily = new Pessoa();
        emily.setNome("Emily");
        emily.setIdade(21);
        emily.setGenero("Feminino");
        emily.setCnh(421462);


        emily.mostrarDados();
        meuCarro.mostrarDadosCarro();

        System.out.println("--------------------");
        System.out.println("     Ações    ");
        emily.colocarCinto(meuCarro);
        emily.usarCarro(meuCarro);
        emily.apertarAcelerador(meuCarro);



    }
}