package albumBasicJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Album {

    private int idAlbum;
    private String titol;
    private Artista artista;
    private static Connection con = Connexio.getConnection();

    public Album(){
        this.artista = new Artista();
    }


    public Album(int idAlbum, String titol, Artista artista) {
        this.idAlbum = idAlbum;
        this.titol = titol;
        this.artista = artista;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "idAlbum=" + idAlbum +
                ", titol='" + titol + '\'' +
                ", artista=" + artista +
                '}';
    }

    public int creaAlbum(String titol, int idArtista) {
        Artista artista = null;
        if (artista.llegeixArtista(idArtista) != null) {
            Statement stmt = null;
            int idAlbumNou = -1;

            try {
                //Creem la consulta de la PreparedStatement
                String query = "INSERT INTO Album (Title,ArtistId) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(query);

                //Modifiquem i executem la PreparedStatement
                ps.setString(1, titol);
                ps.setInt(2, idArtista);
                ps.executeUpdate();

                // Obtenim claus autogenerades
                ResultSet rs = ps.getGeneratedKeys();
                rs.next(); // Sabem que només n'hi ha una
                idAlbumNou = rs.getInt(1);

                ps.close();
                System.out.println("Records created successfully");
                return idAlbumNou;
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }

            return idAlbumNou;
        }
        return -0;
    }

    public Album llegeixAlbum(int idAlbum)
    {
        Statement stmt = null;
        Album album = null;
        try {
            String query = "SELECT * FROM Album WHERE AlbumId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,idAlbum);

            ResultSet rs = ps.executeQuery();
            while ( rs.next() ) {
                int albumId = rs.getInt("AlbumId");
                String  title = rs.getString("Title");
                int  artistId = rs.getInt("ArtistId");
                album = new Album(albumId, title, artista.llegeixArtista(artistId));
            }
            rs.close();
            ps.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("Operation done successfully");
        return album;
    }

    public void modificaAlbum(int idAlbum, String nouTitol, int nouIdArtista)
    {
        Statement stmt = null;

        if (artista.llegeixArtista(nouIdArtista) != null){


        try {
            con.setAutoCommit(false);
            String query = "UPDATE Album set Title = ?, ArtistId = ? WHERE AlbumId = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1,nouTitol);
            ps.setInt(2,nouIdArtista);
            ps.setInt(3,idAlbum);
            ps.executeUpdate();
            con.commit();
            ps.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("Operation done successfully");
        }
    }

    public void eliminaAlbum(int idAlbum)
    {
        try {
            con.setAutoCommit(false);
            String query = "DELETE from Album where AlbumId=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,idAlbum);
            ps.executeUpdate();
            con.commit();
            ps.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("Operation done successfully");
    }

    public List<Album> seleccionaAlbums()
    {
        Statement stmt = null;
        List<Album> albums = new ArrayList<>();
        try {
            //Crear una consulta / query amb un object Statement
            stmt = con.createStatement();
            //Executar la consulta
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Album;" );
            //Procesar el resultat amb l’objecte ResultSet
            while ( rs.next() ) {
                int albumId = rs.getInt("AlbumId");
                String  title = rs.getString("Title");
                int  artistId = rs.getInt("ArtistId");
                albums.add(new Album(albumId, title, artista.llegeixArtista(artistId)));
            }
            rs.close();
            stmt.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("Operation done successfully");
        return albums;
    }
}
