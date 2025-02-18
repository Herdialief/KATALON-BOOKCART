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

//Select book by title inputed on variable buku
TestObject selectedBookObj = new TestObject().addProperty('xpath', ConditionType.CONTAINS, ('//mat-card-title[text()=\'' + 
    buku) + '\']')

//Mapping Book on the catalogue
/*Map<String, String> BookTitle = [
		"A Court of Mist and Fury"	: "strong_A Court of Mist and Fury",
		"A Dance with Dragons"		: "strong_A Dance with Dragons"
	]
*/
Map<String, String> BookTitleObj = [:]

BookTitleObj.each({ def key, def value ->
        (selectedBookObj[key]) = ('strong_' + key) // Add "strong_" to the book title
    })

WebUI.waitForElementClickable(findTestObject('Object Repository/Booklist/' + (BookTitleObj[selectedBookObj])), 0)
WebUI.click(findTestObject('Object Repository/Booklist/' + (BookTitleObj[selectedBookObj])))



