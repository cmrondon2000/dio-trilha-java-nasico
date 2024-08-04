import java.sql.Date;

public class Cliente {

    private String nome;
    private int idade;
    private Date dataNascimento;
    private String cidade;
    private String genero;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Date getDataNascimiento(){
        return dataNascimento;
    }

    public void setDataNascimiento(Date dataNascimiento){
        this.dataNascimento = dataNascimiento;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
}
