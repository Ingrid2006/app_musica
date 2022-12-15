import java.util.Date;

public class Categoria {
    private String pais;
    private String lingua;
    private Date data_lac;

    public Categoria(){
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLingua() {
        return this.lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public Date getData_lac() {
        return this.data_lac;
    }

    public void setData_lac(Date data_lac) {
        this.data_lac = data_lac;
    }



}
