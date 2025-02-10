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

WebUI.callTestCase(findTestCase('Blocks/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Maximize Window'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Blocks/Navigate to URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Header/span_Login'))

WebUI.waitForElementPresent(findTestObject('Login Page/span_Register'), 0)

WebUI.click(findTestObject('Login Page/span_Register'))

WebUI.verifyElementPresent(findTestObject('Register Page/mat-card-title_User Registration'), 0)

WebUI.setText(findTestObject('Register Page/input_First name'), 'ableh', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Register Page/input_Last name'), 'helba')

WebUI.setText(findTestObject('Register Page/input_User name'), 'ableh1')

WebUI.setEncryptedText(findTestObject('Register Page/input_Password'), 'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.setEncryptedText(findTestObject('Register Page/input_Confirm Password'), 'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.click(findTestObject('Register Page/input_Male-radio'))

WebUI.waitForElementClickable(findTestObject('Register Page/span_Register'), 0)

WebUI.click(findTestObject('Register Page/span_Register'))

WebUI.verifyElementPresent(findTestObject('Login Page/div_Registration successful'), 0)

WebUI.verifyElementPresent(findTestObject('Login Page/mat-card-title_Login'), 0)

WebUI.callTestCase(findTestCase('Blocks/Close Browser'), [:], FailureHandling.STOP_ON_FAILURE)

