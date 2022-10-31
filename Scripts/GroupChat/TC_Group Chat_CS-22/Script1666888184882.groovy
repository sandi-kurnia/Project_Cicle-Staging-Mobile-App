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

'User click "Group Chat" menu'
Mobile.tap(findTestObject('cicle.staging/Group Chat/GroupChatMenu'), 0)

'User click "Type Message" field'
Mobile.tap(findTestObject('cicle.staging/Group Chat/TypeMessage-Field'), 0)

'User click "Attachment" button'
Mobile.tap(findTestObject('cicle.staging/Group Chat/GroupChat-AttachmentButtonPopUpKeyboard'), 0)

'Navigate user to user files'
Mobile.tap(findTestObject('cicle.staging/Group Chat/DocumentandVideoAttachment-Button'), 0)

'User click "Audio" button'
Mobile.tap(findTestObject('cicle.staging/Group Chat/Audio button - Files'), 0)

'User click "Audio" file'
Mobile.tap(findTestObject('cicle.staging/Group Chat/Audio File - Files'), 0)

