package albumBasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Track {

    private int idTrack;
    private String title;
    private Album album;
    private MediaType mediaType;
    private Genre genre;
    private String composer;
    private int milliseconds;
    private int bytes;
    private float unitPrice;
    private static Connection con = Connexio.getConnection();

    public Track() {
        this.album = new Album();
        this.mediaType = new MediaType();
        this.genre = new Genre();
    }

    public Track(int idTrack, String title, Album album, MediaType mediaType, Genre genre, String composer, int milliseconds, int bytes, float unitPrice) {
        this.idTrack = idTrack;
        this.title = title;
        this.album = album;
        this.mediaType = mediaType;
        this.genre = genre;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    public int getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(int idTrack) {
        this.idTrack = idTrack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Track{" +
                "idTrack=" + idTrack +
                ", title='" + title + '\'' +
                ", album=" + album.getTitol() +
                ", mediaType=" + mediaType.getName() +
                ", genre=" + genre.getName() +
                ", composer='" + composer + '\'' +
                ", milliseconds=" + milliseconds +
                ", bytes=" + bytes +
                ", unitPrice=" + unitPrice +
                '}';
    }

    public int creaTrack(String title, int albumId, int mediaTyeId, int genreId, String composer, int milliseconds, int bytes, float unitPrice) {
        Statement stmt = null;
        int idNewTrack = -1;
        try {
            String query = "INSERT INTO Track (Name,AlbumId,MediaTypeId, GenreId, Composer, Milliseconds, Bytes, UnitPrice) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, title);
            ps.setInt(2, albumId);
            ps.setInt(3, mediaTyeId);
            ps.setInt(4, genreId);
            ps.setString(5, composer);
            ps.setInt(6, milliseconds);
            ps.setInt(7, bytes);
            ps.setFloat(8, unitPrice);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            idNewTrack = rs.getInt(1);

            ps.close();
            System.out.println("Records created successfully");
            return idNewTrack;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return idNewTrack;
    }

    public Track llegeixTrack(int idTrack) {
        Statement stmt = null;
        Track track = null;
        try {
            String query = "SELECT * FROM Track WHERE TrackId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idTrack);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int trackId = rs.getInt("TrackId");
                String title = rs.getString("Name");
                int albumId = rs.getInt("AlbumId");
                int mediaTypeId = rs.getInt("MediaTypeId");
                int genreId = rs.getInt("GenreId");
                String composer = rs.getString("Composer");
                int bytes = rs.getInt("Bytes");
                float unitPrice = rs.getInt("UnitPrice");
                track = new Track(trackId, title, album.llegeixAlbum(albumId),
                        mediaType.llegeixMediaType(mediaTypeId), genre.llegeixGenre(genreId), composer, milliseconds, bytes, unitPrice);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Operation done successfully");
        return track;
    }




}