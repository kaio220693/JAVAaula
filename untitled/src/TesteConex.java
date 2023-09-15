import java.sql.Connection;

public class TesteConex {
    public  static  void  main(String[] args){
        Conexao conexao = new Conexao();
        Connection conn = conexao.conectar();
    }
}