package json;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.Car;
import json.CarEngine;
import json.CarFleet;

public class JsonToObject {

	public static void main(String args[]) {

		ObjectMapper mapper = new ObjectMapper();

		/**
		 * Read object from file
		 */
		CarFleet value = null;
		try {
			value = mapper.readValue(new File("result.json"), CarFleet.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(value);

	}

}