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

Mobile.tap(findTestObject('navbar/nav_setelan_text'), 0)

Mobile.verifyElementVisible(findTestObject('setting/heading_dukungan'), 60)

Mobile.tap(findTestObject('setting/card_text_bantunaFAQ'), 60)

Mobile.verifyElementVisible(findTestObject('setting/heading_FAQ'), 60)

Mobile.tap(findTestObject('setting/faq1_label'), 60)

Mobile.verifyElementExist(findTestObject('setting/faq1_text'), 60)

Mobile.tap(findTestObject('setting/faq1_label'), 60)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('setting/faq1_text'), 2)

Mobile.tap(findTestObject('setting/faq2_label'), 60)

Mobile.verifyElementExist(findTestObject('setting/faq2_text'), 60)

Mobile.tap(findTestObject('setting/faq2_label'), 60)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('setting/faq2_text'), 2)

Mobile.tap(findTestObject('setting/faq3_label'), 60)

Mobile.verifyElementExist(findTestObject('setting/faq3_text'), 60)

Mobile.tap(findTestObject('setting/faq3_label'), 60)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('setting/faq3_text'), 2)

Mobile.tap(findTestObject('setting/faq4_label'), 60)

Mobile.verifyElementExist(findTestObject('setting/faq4_text'), 60)

Mobile.tap(findTestObject('setting/faq4_label'), 60)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('setting/faq4_text'), 2)

Mobile.tap(findTestObject('setting/faq5_label'), 60)

Mobile.verifyElementExist(findTestObject('setting/faq5_text'), 60)

Mobile.tap(findTestObject('setting/faq5_label'), 60)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('setting/faq5_text'), 2)

Mobile.tap(findTestObject('setting/faq6_label'), 60)

Mobile.verifyElementExist(findTestObject('setting/faq6_text'), 60)

Mobile.tap(findTestObject('setting/faq6_label'), 60)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('setting/faq6_text'), 2)

Mobile.closeApplication()

