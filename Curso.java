package ProjetoBootcamp;

public class Curso extends Conteudo{

    private
    Integer cargaHoraria;

    public Curso() {    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n" + "Curso" + "\n" +
                "Título: " + getTitulo() + "\n" +
                "Descricao: " + descricao + "\n" +
                "Carga Horária do curso: " + cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}