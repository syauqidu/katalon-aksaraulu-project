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

Mobile.tap(findTestObject('navbar/nav_scan_text'), 0)

Mobile.tap(findTestObject('navbar/heading_scan_upload'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi foto/h1_upload_gambar'), 60)

Mobile.tap(findTestObject('deteksi foto/input_upload_foto_aksara'), 60)

Mobile.tap(findTestObject('deteksi foto/google_koleksi'), 60)

Mobile.swipeWithDuration(542, 2083, 532, 1121, 1004)

Mobile.tap(findTestObject('deteksi foto/google_photo_dari_perangkat_ini'), 60)

Mobile.swipeWithDuration(542, 2083, 532, 900, 1004)

Mobile.tap(findTestObject('deteksi foto/google_album_testing'), 60)

Mobile.tap(findTestObject('deteksi foto/file_photo_pa'), 60)

Mobile.tap(findTestObject('deteksi foto/button_selesai_google'), 60)

Mobile.tap(findTestObject('deteksi foto/button_crop_klasifikasi_setelah_upload'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi foto/h1_crop_gambar'), 60)

Mobile.tap(findTestObject('deteksi foto/button_crop_lanjutkan'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi kamera/h1_menganalisis_aksara'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi canvas/h2_gambar_yang_diproses'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi canvas/h3_status_proses'), 60)

Mobile.waitForElementPresent(findTestObject('deteksi canvas/h1_hasil_prediksi'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi canvas/gambar_buatan_kiri'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi canvas/gambar_hasil_kanan'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi kamera/button_feedback'), 60)

Mobile.closeApplication()

