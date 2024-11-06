import java.time.LocalDate;

public class mentoria extends conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20 ;
    }

    public mentoria(){

    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }


}
