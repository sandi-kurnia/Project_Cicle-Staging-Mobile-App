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

'User click "Type Message" Field'
Mobile.tap(findTestObject('cicle.staging/Group Chat/TypeMessage-Field'), 0)

'User click "@" button'
Mobile.tap(findTestObject('cicle.staging/Group Chat/MentionUser-Button'), 0)

'User click "Mention All User" button'
Mobile.tap(findTestObject('cicle.staging/Group Chat/MentionAllUserOnChat-Button'), 0)

'User click Send button'
Mobile.tap(findTestObject('cicle.staging/Group Chat/SendChat-Button'), 0)

'Success Mentioned All User on Group Chat'
Mobile.verifyElementNotVisible(findTestObject('cicle.staging/Group Chat/AssertMentionAllUser'), 2)

