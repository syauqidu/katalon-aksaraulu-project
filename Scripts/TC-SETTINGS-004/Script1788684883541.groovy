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

Mobile.tap(findTestObject('navbar/nav_setelan_text'), 60)

Mobile.enhancedScrollToText('DUKUNGAN', 60)

Mobile.tap(findTestObject('setting/card_text_feedback'), 60)

Mobile.verifyElementVisible(findTestObject('setting/text_beriUlasan'), 60)

Mobile.verifyElementVisible(findTestObject('setting/text_ajakan_feedback'), 60)

Mobile.tap(findTestObject('setting/button_feedback'), 60)

Mobile.tap(findTestObject('setting/button_playstore'), 60)

Mobile.tap(findTestObject('setting/button_opsi_sekalisaja'), 60)

Mobile.verifyElementVisible(findTestObject('setting/text_judul_app_playstore'), 60)

Mobile.closeApplication()

