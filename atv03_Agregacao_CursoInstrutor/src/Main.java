public class Main {
     public static void main(String[] arg){
         Instrutor instrutor1 = new Instrutor("Julia Mendes", "Engenharia aeronautica", 10 , "julia@.com");
         Curso curso = new Curso("Aerodinâmica", 75, "Iniciante", "Curso focado em estudar o movimento do ar e sua interação com corpos sólidos");


         curso.associarInstrutor(instrutor1);

         curso.Curso();

         instrutor1.aplicarAvaliacao("Aerodinamica");
         instrutor1.agendarLive("hoje as 18h");


     }

}
