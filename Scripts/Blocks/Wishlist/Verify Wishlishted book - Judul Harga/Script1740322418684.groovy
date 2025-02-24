import com.kms.katalon.core.testobject.TestObject as TestObject
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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.ObjectBrowser as ObjectBrowser
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType


//Verify link nama bukunya muncul
WebUI.verifyElementPresent(findTestObject('Wishlist/a_bookDetailLink'), 0)

String bookLinkTitle = WebUI.getText(findTestObject('Wishlist/a_bookDetailLink'))

WebUI.verifyMatch(bookLinkTitle, buku, false)

//Verify Harga Buku
WebUI.getText(findTestObject('Wishlist/th_Price'))

//call variables from TC Verify Book Details
def hargaDetails = WebUI.callTestCase(findTestCase('Test Cases/Blocks/Verify Book Details'), [:])
//Check if the price match from the book details page
WebUI.verifyElementText(findTestObject('Wishlist/td_priceWishlist'), hargaDetails)