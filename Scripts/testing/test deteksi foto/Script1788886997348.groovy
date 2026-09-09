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

Mobile.tap(findTestObject('deteksi foto/h1_upload_gambar'), 60)

Mobile.tap(findTestObject('deteksi foto/input_upload_foto_aksara'), 60)

Mobile.tap(findTestObject('deteksi foto/google_photo_dari_perangkat_ini'), 60)

Mobile.swipeWithDuration(542, 2083, 532, 1121, 1004)


Mobile.tap(findTestObject('deteksi foto/file_photo_pa'), 60)

Mobile.tap(findTestObject('deteksi foto/button_selesai_google'), 60)

Mobile.tap(findTestObject('deteksi foto/button_crop_klasifikasi_setelah_upload'), 60)

Mobile.getText(findTestObject('deteksi foto/h1_crop_gambar'), 60)

Mobile.tap(findTestObject('deteksi foto/button_crop_lanjutkan'), 60)

Mobile.getText(findTestObject('deteksi foto/h1_menganalisis_aksara'), 60)

Mobile.closeApplication()

