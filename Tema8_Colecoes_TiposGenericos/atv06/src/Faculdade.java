import java.util.LinkedList;
public class Faculdade {
    private LinkedList<Curso> cursos;



    public Faculdade() {
        cursos = new LinkedList<>();
    }


    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }


    public void removerPrimeiroCurso() {
        cursos.removeFirst();
    }


    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }


    public void mostrarPrimeiroCurso() {
        System.out.println(cursos.getFirst());
    }


    public void mostrarUltimoCurso() {
        System.out.println(cursos.getLast());
    }


    public void quantidadeCursos() {
        System.out.println(cursos.size());
    }


    public void verificarListaVazia() {
        System.out.println(cursos.isEmpty());
    }

}
