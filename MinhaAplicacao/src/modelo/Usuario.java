
package modelo;


public class Usuario {
    
    private long id;
    private String nome;
    private String CPF;
    private String email;
    private String telefone;

   
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCPF() {
        return CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}