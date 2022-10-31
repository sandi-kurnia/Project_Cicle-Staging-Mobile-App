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

'User click "Board" menu'
Mobile.tap(findTestObject('cicle.staging/Board/Board-Menu'), 0)

'User click one of "Card Name"'
Mobile.tap(findTestObject('cicle.staging/Board/Card/userCardAccount'), 0)

'User click "Label" button'
Mobile.tap(findTestObject('cicle.staging/Board/Label/Label-Button'), 0)

'User click "New Label" button'
Mobile.tap(findTestObject('cicle.staging/Board/Label/Label-CreateNewLabel'), 0, FailureHandling.OPTIONAL)

'User click "Name your label" field'
Mobile.tap(findTestObject('cicle.staging/Board/Label/NameYourLabel-Field'), 0)

'User Input Text "Name of Label"'
Mobile.setText(findTestObject('cicle.staging/Board/Label/NameYourLabel-Field'), findTestData('Board/Label/LabelName').getValue(
        1, 1), 0)

'User click one of "Label Color"'
Mobile.tap(findTestObject('cicle.staging/Board/Label/LabelColor-Green01'), 0)

'User Hide Keyboard'
Mobile.hideKeyboard()

'User click Submit Button'
Mobile.tap(findTestObject('cicle.staging/Board/Label/SubmitLabel-Button'), 0)

'User get notificiation creating Label for this Board Success'
Mobile.verifyElementVisible(findTestObject('cicle.staging/Board/Label/Assertion-Label-CreatingLabelForThisBoardSuccess'), 
    0)

