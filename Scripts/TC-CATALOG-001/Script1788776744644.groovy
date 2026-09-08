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

Mobile.scrollToText('Naskah Ulu', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('home/card_text_naskah'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_banyuasin'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_oganilir'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_musirawas'), 2)

Mobile.scrollToText('Pagar Alam', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_muaraenim'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_panukal albab'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_lahat'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_pagaralam'), 2)

Mobile.scrollToText('Museum Balaputra Dewa', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_ogankomeringtimur'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_ogankomeringselatan'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_perpustakaannasional'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_museumbalaputra'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_palembang'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_prabumulih'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_empatlawang'), 2)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_musirawasutara'), 2)

Mobile.closeApplication()

