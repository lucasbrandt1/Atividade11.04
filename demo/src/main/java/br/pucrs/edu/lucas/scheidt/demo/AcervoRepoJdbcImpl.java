package br.pucrs.edu.lucas.scheidt.demo;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
@Primary
public class AcervoRepoJdbcImpl implements IAcervoRepository {
 private JdbcTemplate jdbcTemplate;
 @Autowired
 public AcervoRepoJdbcImpl(JdbcTemplate jdbcTemplate) {
 this.jdbcTemplate = jdbcTemplate;
 }
 @Override
 public List<Livro> getLivros() {
 List<Livro> resp = this.jdbcTemplate.query("SELECT * FROM livros",
 (rs, rowNum) -> new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),
 rs.getInt("ano")));
 return resp;
 }
 // Implemente os demais métodos, o mínimo para compilar
 @Override
 public boolean removeLivro(int id) {
 String sql = "DELETE FROM livros WHERE id = " + id;
 this.jdbcTemplate.batchUpdate(sql);
 return true;
 }


 @Override
 public List<String> getTitulos(){
    return null;
 }

 @Override
 public List<String> getAutores(){
    return null; 
 }

 @Override
 public List<Livro> getLivrosDoAutor(String autor){
    return null;
 }

 @Override
 public List<Livro> getLivrosDoAutor(String autor, int ano){
    return null;
 }

 @Override
 public Livro getLivroTitulo(String titulo){
    return null;
 }
 
 @Override
 public ResponseEntity<Livro> getLivroTituloResp(String titulo){
    return null;
 }

 @Override
 public boolean cadastraLivroNovo(Livro livro){
    return true;
 }

 @Override
 public List<String> getListaAutores(){
    return null;
 }

} 
    
