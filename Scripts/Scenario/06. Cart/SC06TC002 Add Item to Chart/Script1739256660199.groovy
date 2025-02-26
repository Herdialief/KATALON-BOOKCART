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

WebUI.callTestCase(findTestCase('Blocks/Browser/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Browser/Maximize Window'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Browser/Navigate to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Home Page/img_Book_1'))

WebUI.verifyElementPresent(findTestObject('Book Details/mat-card-title_Book Details'), 0)

WebUI.click(findTestObject('Book Details/span_Add to Cart'))

WebUI.callTestCase(findTestCase('Blocks/Cart/Open Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Cart/th_Title'), 0)

WebUI.verifyElementPresent(findTestObject('Cart/th_Image'), 0)

WebUI.verifyElementPresent(findTestObject('Cart/th_Action'), 0)

WebUI.verifyElementPresent(findTestObject('Cart/th_Price'), 0)

WebUI.verifyElementPresent(findTestObject('Cart/th_Quantity'), 0)

WebUI.verifyElementPresent(findTestObject('Cart/th_Total'), 0)

WebUI.callTestCase(findTestCase('Blocks/Browser/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

