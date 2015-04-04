public class Run {

	public static void main(String[] args){

		ImieNazwiskoAdres dane = new ImieNazwiskoAdres();

		Database.connectToDatabase();
		dane.insert("Lubie", "Placki", "Ziemniaczane");
		Database.closeConnectionToDatabase();
	}

}
