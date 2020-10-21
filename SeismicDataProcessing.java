package practicing;
import java.io.*;
import java.util.*;

public class SeismicDataProcessing {

	public static void main(String[] args) throws FileNotFoundException{
		//step 1 to set up a scanner to read from csv file
		File source=new File("C:\\Users\\vidya.krishnamoorthy\\eclipse-workspace\\cs210\\seismicActivitySeattle.csv");
		Scanner fileReader=new Scanner(source);
		fileReader.useDelimiter(",");//to read from a csv format
		//step 2 set up a destination file to store report
		File dest=new File("ActivityReport.txt");
		PrintStream output=new PrintStream(dest);
		output.println("ID"+"\t"+"Magnitude"+"\t"+"Time(UTC)"+"\t"+
				"Latitude"+"\t"+"Longitude"+"\t"+"Depth(Km)");
		//skip the header from csv file
		fileReader.nextLine();
		//read from csv file and save details of quakes larger than Magnitude 2
		while(fileReader.hasNextLine())
		{
			String row=fileReader.nextLine();
			Scanner lineScanner=new Scanner(row);
			lineScanner.useDelimiter(",");
			String id=lineScanner.next();//store the id
			double mag=lineScanner.nextDouble();
			lineScanner.next();//skip mag type
			lineScanner.next();//skip Epoch
			String time=lineScanner.next();//save time utc
			lineScanner.next();//skip local time
			lineScanner.next();//skip distance from station
			lineScanner.next();
			String lat=lineScanner.next();
			String lon=lineScanner.next();
			String depthkm=lineScanner.next();
			System.out.println(depthkm);
			if(mag>=2.0)
			{
				//save the above details into the report
				output.println(id+"\t"+mag+"\t"+time+"\t"+
				lat+"\t"+lon+"\t"+depthkm);
			}
		}
	}

}
