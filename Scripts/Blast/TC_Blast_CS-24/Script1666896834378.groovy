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

'User click "Blast" menu'
Mobile.tap(findTestObject('cicle.staging/Blast/Menu/BlastMenu'), 0)

'User click "+" button on the bottom right corner'
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Post/POST-AddButtonOnTheBottomRightSide'), 0)

'User click "Type a Title" field'
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Post/POST-TypeATitleField'), 0)

'User input text in "Type a Title" field'
Mobile.setText(findTestObject('cicle.staging/Blast/Post/POST-TypeATitleField'), findTestData('Blast/Post/PostData').getValue(
        1, 1), 0)

'User click "Description" field'
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Post/POST-YourTextHereField'), 0)

'User input text in "Description" field'
Mobile.setText(findTestObject('cicle.staging/Blast/Post/Post-DescriptionField1'), findTestData('Blast/Post/PostData').getValue(
        2, 1), 0, FailureHandling.STOP_ON_FAILURE)

'User hide keyboard'
Mobile.hideKeyboard()

'User "Swipe Up" untill find "Publish" button'
Mobile.swipe(724, 1830, 724, 1000)

'User click "Publish" button '
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Post/POST-PublishButton'), 0)

