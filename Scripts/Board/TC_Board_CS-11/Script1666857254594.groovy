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

'User click "Board" Menu'
Mobile.tap(findTestObject('cicle.staging/Board/Board-Menu'), 0)

'User click one of "Card Name"'
Mobile.tap(findTestObject('cicle.staging/Board/Card/userCardAccount'), 0)

'User click "Add new comment" field'
Mobile.tap(findTestObject('cicle.staging/Board/Comment/AddNewComment-Button'), 0)

'User click "Tell your comment here" field'
Mobile.tap(findTestObject('cicle.staging/Board/Comment/AddComment2-Field'), 0)

'User click "+" on toolbar add comment'
Mobile.tap(findTestObject('cicle.staging/Board/Comment/AddAttachmentPopUPKeyboard-Button'), 0, FailureHandling.STOP_ON_FAILURE)

'User click "Image"button'
Mobile.tap(findTestObject('cicle.staging/Board/Comment/AddImageOnComment-Button'), 0)

'User click "By URL" button'
Mobile.checkElement(findTestObject('cicle.staging/Board/Comment/AddImageByURL-Comment'), 0)

'User click "URL"field'
Mobile.tap(findTestObject('cicle.staging/Board/Comment/InsertLinkHere-Image-Field'), 0)

'User input empty "URL"'
Mobile.setText(findTestObject('cicle.staging/Board/Comment/InsertLinkHere-Image-Field'), findTestData('Board/URL/URL').getValue(
        1, 2), 0)

'User click "Insert" button'
Mobile.tap(findTestObject('cicle.staging/Board/Comment/Comment-SelectInsert-Button'), 0)

'Showing alert "Not Valid URL"'
Mobile.verifyElementNotVisible(findTestObject('cicle.staging/Board/Comment/AssertionNotValidURL-Comment'), 0)

