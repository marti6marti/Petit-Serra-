package albumBasicJDBC;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Artista {
    private int idArtista;
    private String nom;
    private static Connection con = Connexio.getConnection();

    public Artista(){
    }

    public Artista(int idArtista, String nom) {
        this.idArtista = idArtista;
        this.nom = nom;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Artista llegeixArtista (int idArtista){
        try {
            //Crear una consulta / query amb un object Statement
            String query = "SELECT * FROM Artist WHERE ArtistId = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,idArtista);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return new Artista(idArtista, nom);
            }else {
                return null;
            }

        }catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        return new Artista(idArtista, nom);
    }



    @Override
    public String toString() {
        return "Artista{" +
                "idArtista=" + idArtista +
                ", nom='" + nom + '\'' +
                '}';
    }
}
