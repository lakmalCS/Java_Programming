package covid;

public class DataProcessor {
	private static final String FILE_PATH = "/Users/Acer/eclipse-workspace/Covid-19/src/covid/covid-19-data.json";
	
	public static void main(String[] args) {
		 DataReader reader = new DataReader();
	     reader.readData(FILE_PATH);
	}

}
