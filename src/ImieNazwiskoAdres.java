import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImieNazwiskoAdres {

	PreparedStatement preparedStatement = null;

	public void insert(String imie, String nazwisko, String adres){
		try {
			if (Database.connection != null){
				preparedStatement = Database.connection.prepareStatement("INSERT into imie_nazwisko_adres (imie, nazwisko, adres) VALUES (?, ?, ?)");
				preparedStatement.setString(1, imie);
				preparedStatement.setString(2, nazwisko);
				preparedStatement.setString(3, adres);
				preparedStatement.executeUpdate();
			} else {
				System.out.print("Not connected to database");
			}
		} catch (SQLException e){
			e.printStackTrace();

		}
	}
}
