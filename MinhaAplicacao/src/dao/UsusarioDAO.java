
package dao;
import Factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.Usuario;

public class UsusarioDAO {
    private Connection connection;
    long id;
    String nome;
    String cfp;
    String email;
    String telefone;
    
    public UsusarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Usuario usuario){
        
    {
        String sql = "insert into usuarios (nome, CPF,email, telefone)"
        + "   VALUES('jorge','123 321 456 23','jorge@22.com','11 99009 0999')";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCPF());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    
    }
    }
}
