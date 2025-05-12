package albumBasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Track {
    private int idTrack;
    private String name;
    private Album album;
    private MediaType mediaType;
    private Genre genere;
    private static Connection con = Connexio.getConnection();

    public Track(int idTrack, String name, Album album, MediaType mediaType, Genre genere) {
        this.idTrack = idTrack;
        this.name = name;
        this.album = album;
        this.mediaType = mediaType;
        this.genere = genere;
    }

    public int getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(int idTrack) {
        this.idTrack = idTrack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Genre getGenere() {
        return genere;
    }

    public void setGenere(Genre genere) {
        this.genere = genere;
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        Track.con = con;
    }

    @Override
    public String toString() {
        return "Track{" +
                "idTrack=" + idTrack +
                ", name='" + name + '\'' +
                ", album=" + album +
                ", mediaType=" + mediaType +
                ", genere=" + genere +
                '}';
    }

    public int creaTrack(int idTrack, String name, Album album, MediaType mediaType, Genre genere) {

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
}
