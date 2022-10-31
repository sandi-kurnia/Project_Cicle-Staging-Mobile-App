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

'User click "Group Chat" Menu'
Mobile.tap(findTestObject('cicle.staging/Group Chat/GroupChatMenu'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'User click "Type Message" Field'
Mobile.tap(findTestObject('cicle.staging/Group Chat/TypeMessage-Field'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'User Input Text in "Type Message" Field'
Mobile.setText(findTestObject('cicle.staging/Group Chat/TypeMessage-Field'), findTestData('GroupChat/sendMessageonGroupChat').getValue(
        1, 1), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'User click Send button'
Mobile.tap(findTestObject('cicle.staging/Group Chat/SendChat-Button'), 0)

'Success to send Message on Group Chat'
Mobile.verifyElementVisible(findTestObject('cicle.staging/Group Chat/Assertion-SendChat'), 0)

