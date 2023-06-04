import java.util.UUID;

public class Usuario {
    private String nome, cpf, email, senha, saldo;
    private UUID id;

    public Usuario(String nome, String cpf, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void criarConta(){
        Conta conta1 = new Conta();
        this.id = conta1.getId();

    }

    public UUID getId(){
        return this.id;
    }
}
