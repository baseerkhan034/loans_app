package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.valid.DataValidator;

public class CSVReader {
	public static void main(String[] args) {
		DataValidator validator = new DataValidator();
		String path = "C:\\Users\\User\\Desktop\\Employee.csv";
		String line;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine())!=null) {
				validate(validator, line);
				System.out.println(line);
			}
		br.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void validate(DataValidator validator, String theLine) {
		if(theLine !=null) {
			theLine = theLine.trim();
			if(theLine.length() >0) {
				String[] parts = theLine.split(",");
				if(parts != null && parts.length >0) {
					String firstName = parts[0];
					String middleName = parts[1];
					String lastName = parts[2];
					if(!validator.nameValid(firstName+" "+middleName+" "+ lastName)) {
						System.err.println("The line is not valid. Name is not present: "+theLine);
					}
					String ageStr = parts[3];
					if(ageStr != null && ageStr.trim().length()>0) {
						if(!validator.isNumber(ageStr)) {
							System.err.println("The line is not valid. Age is not a number: "+theLine);
						}else {
							Integer age = Integer.parseInt(ageStr);
							if(!validator.ageValid(age)) {
								System.err.println("The line is not valid. Age is not valid (Too Young or Too old): "+theLine);
							}
						}
					}else {
						System.err.println("The line is not valid. Age is not present: "+theLine);
					}
					String gender = parts[4];
					String street1 = parts[5];
					String street2 = parts[6];
					String city = parts[7];
					String zip = parts[8];
					String country = parts[9];
					String phone = parts[10];
					if(!validator.phoneValid(phone)) {
						System.err.println("The line is not valid. Bad phone number: "+theLine);
					}
				}
				
						
			}
		}
		
	}
}
