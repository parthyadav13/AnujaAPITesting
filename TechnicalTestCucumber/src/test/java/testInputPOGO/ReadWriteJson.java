package testInputPOGO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import utils.Base;

public class ReadWriteJson {

	Base getJsonPath = new Base();

	public UserDetailsGenderNotCustom ReadJsonFile() {

		ObjectMapper mapper = new ObjectMapper();
		try {
			InputStream inputStream = new FileInputStream(getJsonPath.jsonPathInput());
			UserDetailsGenderNotCustom userData = mapper.readValue(inputStream, UserDetailsGenderNotCustom.class);
			return userData;

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return null;
		} catch (IOException e) {

			e.printStackTrace();
			return null;
		}

	}

	public UserDetailsGenderCustom ReadCustomGenderJson() {

		ObjectMapper mapper = new ObjectMapper();

		try {
			InputStream inputStream = new FileInputStream(getJsonPath.jsonPathForCustomInput());
			UserDetailsGenderCustom userData = mapper.readValue(inputStream, UserDetailsGenderCustom.class);
			return userData;

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return null;
		} catch (IOException e) {

			e.printStackTrace();
			return null;
		}

	}

	public LoginInfo LoginInfoJson() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			InputStream inputStream = new FileInputStream(getJsonPath.jsonPathLoginInfo());
			LoginInfo userData = mapper.readValue(inputStream, LoginInfo.class);
			return userData;

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return null;
		} catch (IOException e) {

			e.printStackTrace();
			return null;
		}

	}

	public void WriteIntoJasonFile(CreatedOutputStatus output) throws FileNotFoundException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		// OutputStream outPutStream = new
		// FileOutputStream(getJsonPath.jsonPathOutPut());
		mapper.writeValue(new File(getJsonPath.jsonPathOutPut()), output);

	}

}
