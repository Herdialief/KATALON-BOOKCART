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

// Mapping the book title
Map<String, String> BookTitleObj = [:]

if (buku.size() > 0) {
    (BookTitleObj[buku]) = ('strong_' + buku)
}

// Print the populated map (for verification)
println(BookTitleObj)

//Click on the book title
WebUI.click(findTestObject('Object Repository/Booklist/' + (BookTitleObj[buku])))

//Verify book details page
WebUI.verifyElementPresent(findTestObject('Book Details/mat-card-title_Book Details'), 0)

//Verify book title are equal to the variable value
WebUI.verifyElementText(findTestObject('Book Details/td_Title'), buku)

// Set variable to be called in another TC
def hargaDetails = WebUI.getText(findTestObject('Book Details/td_Price'))
return hargaDetails
