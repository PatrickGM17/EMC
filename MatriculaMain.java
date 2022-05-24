public class MatriculaMain {

    public MatriculaMain() {
    }

    public static void main(String[] args) {
        Matricula matricula = new Matricula("Patrick Gomez", 2019110473);
        System.out.println("Estudiante: " + matricula .getalumno());
        System.out.println("Codigo: " + matricula .getCod());
        System.out.println();
        matricula.agregarCurso(new Curso("Calculo", "Ricardo Sachun"));
        System.out.println("Curso 1: "+matricula.mostrarCurso().getNombreCurso());
        System.out.println("Docente: "+matricula.mostrarCurso().getMaestro());
        System.out.println();
        matricula.agregarCurso(new Curso("Ingles", "Veronica Mendez"));
        System.out.println("Curso 3: "+matricula.mostrarCurso().getNombreCurso());
        System.out.println("Docente: "+matricula.mostrarCurso().getMaestro());

    }

}

