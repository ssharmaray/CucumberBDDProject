package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// tags - @bvt, @prod, @staging, @datatable, @Search-Cars, @Search-Cars-Positive

//tags="@Search-Cars or @Used-Search-Cars",
//tags="@New-Search-Cars-Positive or @New-Search-Cars-Negative",
//tags="@Find-a-Dealer-Positive or @Find-a-Dealer-Negative",
@CucumberOptions(
	features="src/test/resources/features", 
	glue= {"steps"}, 
	tags="@scenario2",
	plugin = {"pretty","html:target/cucumber-reports/cucumber-html-report.html",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
public class RunCuke extends AbstractTestNGCucumberTests {

	/*
	@BeforeClass
    public static void setup() {
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\" + strDate+".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		//static report name
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
       
    } */

}
