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

WebUI.callTestCase(findTestCase('Sign in/TC_Sign in_CS-40'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('cicle.staging/Board/Board-Menu'), 0)

Mobile.tap(findTestObject('cicle.staging/Board/Card/userCardAccount'), 0)

Mobile.tapAndHoldAtPosition(410, 750, 3)

Mobile.tap(findTestObject('cicle.staging/Board/AddDescription-Button'), 0)	

for ( int i = 1; i < 3; i++) {
	Mobile.swipe(550, 331, 90, 331)

Mobile.tapAndHoldAtPosition(157, 331, 2)

}

Mobile.tap(findTestObject('cicle.staging/Board/InsetLinkNotes(Description)-ToolbarButton'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('cicle.staging/Board/TextToDisplayInsertLink-Field'), 0)

Mobile.setText(findTestObject('cicle.staging/Board/TextToDisplayInsertLink-Field'), '', 0)

Mobile.tap(findTestObject('cicle.staging/Board/URLInsertLink-Field'), 0)

Mobile.setText(findTestObject('cicle.staging/Board/URLInsertLink-Field'), URL, 0)

Mobile.tap(findTestObject('cicle.staging/Board/OkInsertLink-Button'), 0)

