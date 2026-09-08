import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

Mobile.startExistingApplication('id.sumsel.kaganga')

Mobile.swipeWithDuration(58, 1662, 88, 580, 1543)

Mobile.swipeWithDuration(52, 1925, 164, 683, 500)

Mobile.tap(findTestObject('home/card_text_sejarah'), 60)

Mobile.getText(findTestObject('sejarah/h1_sejarah_aksara'), 60)

Mobile.verifyElementVisible(findTestObject('sejarah/img_p1'), 60)

Mobile.verifyElementVisible(findTestObject('sejarah/p1'), 60)

Mobile.swipeWithDuration(992, 2046, 1001, 1076, 409)

Mobile.getText(findTestObject('sejarah/p2'), 
    60)

Mobile.swipeWithDuration(992, 2113, 974, 417, 1224)

Mobile.swipeWithDuration(1022, 2146, 1010, 339, 1156)

Mobile.swipeWithDuration(995, 2152, 1007, 329, 1560)

Mobile.swipeWithDuration(1016, 2191, 980, 405, 1113)

Mobile.verifyElementVisible(findTestObject('sejarah/pAkhir'), 60)

Mobile.closeApplication()

