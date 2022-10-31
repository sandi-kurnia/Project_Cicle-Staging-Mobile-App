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
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-AddButtonOntheBottomRightSide'), 0)

'User click "Type a title" field'
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-TypeATitleField'), 0)

Mobile.setText(findTestObject('cicle.staging/Blast/Description/Desc-TypeATitleField'), findTestData('Blast/Desc/Desc').getValue(
        1, 1), 0)

Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-InsertLinkToolBar'), 0)

Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-TextToDisplay1Field'), 0)

Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-TextToDisplay2Field'), 0)

Mobile.setText(findTestObject('cicle.staging/Blast/Description/Desc-TextToDisplay2Field'), findTestData('Blast/Desc/Desc').getValue(
        2, 3), 0)

Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-URL1Field'), 0)

Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-URL2Field'), 0)

Mobile.setText(findTestObject('cicle.staging/Blast/Description/Desc-URL2Field'), findTestData('Blast/Desc/Desc').getValue(
        3, 3), 0)

Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/Description/Desc-InsertLinkOKButton'), 0)

Mobile.verifyElementVisible(findTestObject('cicle.staging/Blast/Description/Desc-Assert-PleaseEntrtURL'), 0)

