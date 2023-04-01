import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import com.github.javafaker.Faker as Faker
import groovy.json.JsonSlurper as JsonSlurper

Path currentRelativePath = Paths.get('')

def s = currentRelativePath.toAbsolutePath().toString()

System.out.println('Current absolute path is: ' + s)

s = (s + '\\Data Files\\APK Android\\SampleAndroidApp-LoginTes_4.0_Apkpure.apk')

System.out.println('Current absolute path is: ' + s)

Mobile.startApplication(s, false)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/lbl_createAccount'), 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_name'), 'a', 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_email'), 'a@gmail.com', 10)

Mobile.setEncryptedText(findTestObject('MOBILE OBJECT/Register/txt_add_password'), 'J7R4ejOak4Y=', 10)

Mobile.setEncryptedText(findTestObject('MOBILE OBJECT/Register/txt_add_confirmPassword'), 'J7R4ejOak4Y=', 10)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/btn_register'), 10)

Mobile.pressBack()

