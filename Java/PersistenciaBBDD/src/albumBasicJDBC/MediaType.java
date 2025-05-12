package albumBasicJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MediaType {

    private int idMediaType;
    private String name;
    private static Connection con = Connexio.getConnection();

    public MediaType(int idMediaType, String name) {
        this.idMediaType = idMediaType;
        this.name = name;
    }

    public MediaType(){

    }

    public int getIdMediaType() {
        return idMediaType;
    }

    public void setIdMediaType(int idMediaType) {
        this.idMediaType = idMediaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "\nMediaType: " +
                "id=" + idMediaType +
                ", nom='" + name + '\'';
    }

    public MediaType llegeixMediaType(int idMediaType) {
        Statement stmt = null;
        MediaType mediaType = null;
        try {
            String query = "SELECT * FROM MediaType WHERE MediaTypeId = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idMediaType);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int mediaTypeId = rs.getInt("MediaTypeId");
                String name = rs.getString("Name");
                mediaType = new MediaType(mediaTypeId, name);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Operation done successfully");
        return mediaType;
    }


}