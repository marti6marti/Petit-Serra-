package albumBasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Genre {

    private int idGenre;
    private String name;
    private static Connection con = Connexio.getConnection();

    public Genre(int idGenre, String name) {
        this.idGenre = idGenre;
        this.name = name;
    }

    public Genre(){

    }

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "\nGenre: " +
                "id=" + idGenre +
                ", nom='" + name + '\'';
    }
    public Genre llegeixGenre(int idGenre) {
        Statement stmt = null;
        Genre genre = null;
        try {
            String query = "SELECT * FROM Genre WHERE GenreId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idGenre);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int genreId = rs.getInt("GenreId");
                String name = rs.getString("Name");
                genre = new Genre(genreId, name);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Operation done successfully");
        return genre;
    }


}
