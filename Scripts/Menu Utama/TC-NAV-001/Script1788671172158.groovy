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

Mobile.verifyElementExist(findTestObject('navbar/nav_home_text'), 0)

Mobile.verifyElementExist(findTestObject('navbar/nav_riwayat_text'), 0)

Mobile.verifyElementExist(findTestObject('navbar/nav_aksara_text'), 0)

Mobile.verifyElementExist(findTestObject('navbar/nav_setelan_text'), 0)

Mobile.verifyElementExist(findTestObject('home/card_mengenalAksaraUlu'), 0)

Mobile.verifyElementExist(findTestObject('home/card_DeteksiAksaraUlu'), 0)

Mobile.verifyElementExist(findTestObject('home/card_transliterasi'), 0)

Mobile.verifyElementExist(findTestObject('home/card_naskah'), 0)

Mobile.verifyElementExist(findTestObject('home/lonceng_home'), 0)

Mobile.scrollToText('Aktivitas Terakhir', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('home/heading_aktivitasTerakhir'), 0)

Mobile.scrollToText('Sejarah Aksara Ulu', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('home/card_sejarah'), 0)

Mobile.closeApplication()

