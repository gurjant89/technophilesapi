package fetchData.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import fetchData.beans.DataModel;

@RestController
@RequestMapping("/fetchdata")
public class FetchDataController {
	
	@GetMapping("/_ah/warmup")
	public String warmUp() {
		
		return "Healthy";
	}
	
	@GetMapping("/train")
	public List<DataModel> fetchTrainData() {
		Reader reader= null;
		try {
			InputStream in = new ClassPathResource("trainData/train.csv").getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
		}
		catch(Exception ex) {
			ex.printStackTrace();;
		}
		CsvToBean<DataModel> csvToBean = new CsvToBeanBuilder(reader)
                .withType(DataModel.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
		List<DataModel> listDataModel = csvToBean.parse();
		return listDataModel;
		
	}
	
	@GetMapping("/test")
	public List<DataModel> fetchTestData() {
		Reader reader= null;
		try {
			InputStream in = new ClassPathResource("testData/test.csv").getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
		}
		catch(Exception ex) {
			ex.printStackTrace();;
		}
		CsvToBean<DataModel> csvToBean = new CsvToBeanBuilder(reader)
                .withType(DataModel.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();
		List<DataModel> listDataModel = csvToBean.parse();
		return listDataModel;
		
	}
	
}
 

