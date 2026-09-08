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

Mobile.tap(findTestObject('home/lonceng_home'), 0)

Mobile.verifyElementVisible(findTestObject('notif/h1_notifikasi_laman'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_text_10kaliTransliterasi'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_label_semakinmahir'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_text_transliterasipertama'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_label_transliterasipertama'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_label_beriFeedback'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_text_beriFeedback'), 60)

Mobile.swipeWithDuration(913, 2173, 938, 478, 905)

Mobile.verifyElementVisible(findTestObject('notif/card_label_selamatDatang'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_text_selamatDatang'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_label_fiturBaru'), 60)

Mobile.verifyElementVisible(findTestObject('notif/card_text_fiturBaru'), 60)

Mobile.closeApplication()

