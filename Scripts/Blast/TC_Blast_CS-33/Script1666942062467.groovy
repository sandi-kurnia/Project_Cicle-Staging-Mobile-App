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

'User click "Blast" Menu'
Mobile.tap(findTestObject('cicle.staging/Blast/Menu/BlastMenu'), 0)

'User click "+" button on the bottom right corner'
Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/MemberNotification/Notif-AddButtonOntheBottomRightSide'), 
    0)

for (int i = 1; i < 3; i++) {
    'User click "Add Member To Be Notified" button'
    Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/MemberNotification/Notif-AddMemberWhodoyouWannabenotified'), 
        0)

    'User click "Select All" check box button'
    Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/MemberNotification/Notif-CheckBoxSelectAllMember'), 
        0)

    'User click "Done" button'
    Mobile.tap(findTestObject('Object Repository/cicle.staging/Blast/MemberNotification/Notif-Donebutton'), 0)
}

Mobile.verifyElementVisible(findTestObject('Object Repository/cicle.staging/Blast/MemberNotification/Notif-AllMemberAssert'), 
    0)

