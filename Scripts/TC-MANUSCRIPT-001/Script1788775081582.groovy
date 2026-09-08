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

Mobile.tap(findTestObject('naskah/card_text_banyuasin'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/h1_banyuasin'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/h2_daftar_naskah'), 0)

Mobile.tap(findTestObject('naskah/card_detail_glp1'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/label_gambarAtefak'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/image_artefak'), 0)

Mobile.tap(findTestObject('naskah/image_artefak'), 0)

Mobile.tap(findTestObject('naskah/opsi_gallery'), 60)

Mobile.tap(findTestObject('naskah/button_sekaliinisaja'), 60)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('naskah/h2_judul_naskah'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/text_lokasi_naskah_banyuasin'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/card_informasi_naskah'), 0)

Mobile.scrollToText('Deskripsi', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('naskah/card_judul_deskripsi'), 0)

Mobile.scrollToText('Lokasi Naskah', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_deskripsi'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/card_judul_lokasi'), 0)

Mobile.verifyElementVisible(findTestObject('naskah/card_text_lokasi'), 0)

Mobile.closeApplication()

