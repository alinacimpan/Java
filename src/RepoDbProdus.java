import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class RepoDbProdus {

    private final String url = "jdbc:postgresql://localhost:5432/postgres2";
    private final String username = "postgres";
    private final String password = "postgres";


    private static RepoDbProdus instance = null;
    private  RepoDbProdus(){}
    public static RepoDbProdus getInstance()
    {
        if(instance == null)
        {
            instance = new RepoDbProdus();
        }
        return instance;
    }

    public List<Produs> findAll()
    {   List<Produs> Produss = new ArrayList<>();
        try (Connection connection = getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * from produs2");
             ResultSet resultSet = statement.executeQuery())
        {
            while (resultSet.next())
            {
                long id = resultSet.getLong("id");
                String nume = resultSet.getString("nume");
                String categorie = resultSet.getString("categorie");
                String descriere = resultSet.getString("descriere");
                double pret = resultSet.getDouble("pret");

                Produs utilizator = new Produs(id,nume,categorie,descriere,pret);
                Produss.add(utilizator);
            }
            return Produss;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return Produss;
    }




}
