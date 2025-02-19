import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// Step 2: Get Total Number of Books
WebUI.callTestCase(findTestCase('Blocks/Browser/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Browser/Navigate to URL'), [:], FailureHandling.STOP_ON_FAILURE)

//create a map for all the herf book from the https://bookcart.azurewebsites.net/ using looping Map<String, String> booklist = [:]
// Initialize an empty map to store book titles and their corresponding href links


// Step 1: Define the variable in the Variables tab
// Step 2: Initialize the map
Map<String, String> BookTitleObj = [:]

// Step 3: Populate the map from the buku variable with prefix strong_
if (buku.size() > 0) {
    BookTitleObj[buku] = 'strong_' + buku  // Use the first element directly
}

// Step 4: Print the populated map (for verification)
println BookTitleObj