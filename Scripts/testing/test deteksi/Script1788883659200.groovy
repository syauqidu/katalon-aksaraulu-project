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

Mobile.tap(findTestObject('deteksi kamera/android.view.View'), 60)

Mobile.tap(findTestObject('deteksi kamera/opsi_foto'), 60)

Mobile.tap(findTestObject('deteksi kamera/button_pilihVarian'), 60)

Mobile.tap(findTestObject('deteksi kamera/h1_deteksi_foto'), 60)

Mobile.tap(findTestObject('deteksi kamera/button_take_picture'), 60)

Mobile.tap(findTestObject('deteksi kamera/button_crop_lanjutkan'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi kamera/h1_menganalisis_aksara'), 60)

Mobile.verifyElementVisible(findTestObject('deteksi kamera/h2_tingkat_keyakinan'), 60)

Mobile.getText(findTestObject('deteksi kamera/h2_kemungkinan_lain'), 60)

Mobile.tap(findTestObject('deteksi kamera/button_feedback'), 60)

Mobile.getText(findTestObject('deteksi kamera/button_kemungkinan_lain_YA'), 60)

Mobile.tap(findTestObject('deteksi kamera/button_kemungkinan_lain_TIDAK'), 60)

Mobile.getText(findTestObject('deteksi kamera/h2_kasih_feedback'), 60)

Mobile.getText(findTestObject('deteksi kamera/text_kasih_feedback'), 60)

Mobile.getText(findTestObject('deteksi kamera/h3_pilih_prediksi_lain'), 60)

Mobile.tap(findTestObject('deteksi kamera/opsi_ketik_sendiri'), 60)

Mobile.tap(findTestObject('deteksi kamera/input_prediksi_yang_benar'), 60)

Mobile.sendKeys('tidak ada')

Mobile.pressBack(FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('deteksi kamera/button_kirim_feedback'), 60)

Mobile.getText(findTestObject('deteksi kamera/popup_feedback_berhasil_kirim'), 60)

Mobile.closeApplication()

