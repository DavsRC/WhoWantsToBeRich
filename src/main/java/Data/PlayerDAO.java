package Data;

import Entity.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerDAO {
    public static void createPlayerBD(Player player) {
        Data.Connection db_connect = new Data.Connection();

        try(Connection connection = db_connect.get_connection()){
            PreparedStatement preparedStatement = null;
            try{
                String query="INSERT INTO player (`name`, `sofkaCoins`) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, player.getName());
                preparedStatement.setInt(2, player.getSofkaCoins());
                preparedStatement.executeUpdate();
                System.out.println("The player has been created successfully");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
