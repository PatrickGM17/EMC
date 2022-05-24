public class Matricula {
    private String Alumno;
    private int codigo;

    private Curso curso;

    public Matricula(String estudiante, int cod) {
        this.Alumno = estudiante;
        this.codigo = cod;
    }

    public String getalumno() {
        return this.Alumno;
    }

    public int getCod() {
        return this.codigo;
    }

    public void agregarCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso mostrarCurso() {
        return this.curso;
    }

}

class Curso {
    private String nombreCurso;
    private String Maestro;

    public Curso(String numCurso, String docente) {
        this.nombreCurso = numCurso;
        this.Maestro = docente;
    }

    public String getNombreCurso() {
        return this.nombreCurso;
    }

    public void setNumbreCurso(String numCurso) {
        this.nombreCurso = numCurso;
    }

    public String getMaestro() {
        return this.Maestro;
    }

    public void setMaestro(String docente) {
        this.Maestro = docente;
    }


}
