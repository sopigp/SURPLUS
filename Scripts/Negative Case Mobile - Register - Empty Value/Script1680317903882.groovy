import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.VerifyMatchKeyword as VerifyMatchKeyword
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

Faker faker = new Faker()

String firstName = faker.name().firstName()

GlobalVariable.name = firstName

String email = CustomKeywords.'surplusKeywords.RandomEmail.getEmail'('emailUser', 'gmail.com')

GlobalVariable.email = email

System.out.println(email)

Path currentRelativePath = Paths.get('')

def s = currentRelativePath.toAbsolutePath().toString()

System.out.println('Current absolute path is: ' + s)

s = (s + '\\Data Files\\APK Android\\SampleAndroidApp-LoginTes_4.0_Apkpure.apk')

System.out.println('Current absolute path is: ' + s)

Mobile.startApplication(s, false)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/lbl_createAccount'), 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_name'), '', 0)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_email'), '', 0)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_password'), '', 0)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_confirmPassword'), '', 0)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/btn_register'), 10)

Mobile.verifyElementVisible(findTestObject('MOBILE OBJECT/Register/errorMessage_name'), 10)

errorMessageName = Mobile.getText(findTestObject('MOBILE OBJECT/Register/errorMessage_name'), 10)

Mobile.verifyMatch(errorMessageName, 'Enter Full Name', false)

Mobile.pressBack()

Mobile.tap(findTestObject('MOBILE OBJECT/Register/lbl_createAccount'), 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_name'), firstName, 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_email'), '', 0)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_password'), '', 0)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_confirmPassword'), '', 0)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/btn_register'), 10)

Mobile.verifyElementVisible(findTestObject('MOBILE OBJECT/Register/errorMessage_email'), 10)

errorMessageEmail = Mobile.getText(findTestObject('MOBILE OBJECT/Register/errorMessage_email'), 10)

Mobile.verifyMatch(errorMessageEmail, 'Enter Valid Email', false)

Mobile.pressBack()

Mobile.tap(findTestObject('MOBILE OBJECT/Register/lbl_createAccount'), 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_name'), firstName, 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_email'), email, 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_password'), '', 0)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_confirmPassword'), '', 0)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/btn_register'), 10)

Mobile.verifyElementVisible(findTestObject('MOBILE OBJECT/Register/errorMessage_password'), 10)

errorMessagePassword = Mobile.getText(findTestObject('MOBILE OBJECT/Register/errorMessage_password'), 10)

Mobile.verifyMatch(errorMessagePassword, 'Enter Password', false)

Mobile.pressBack()
Mobile.tap(findTestObject('MOBILE OBJECT/Register/lbl_createAccount'), 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_name'), firstName, 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_email'), email, 10)

Mobile.setEncryptedText(findTestObject('MOBILE OBJECT/Register/txt_add_password'), '7ZTatM+q3vAyZQd2ps7zRg==', 10)

Mobile.setText(findTestObject('MOBILE OBJECT/Register/txt_add_confirmPassword'), '', 0)

Mobile.tap(findTestObject('MOBILE OBJECT/Register/btn_register'), 10)

Mobile.verifyElementVisible(findTestObject('MOBILE OBJECT/Register/errorMessage_confirmPassword'), 10)

errorMessageConfirmPassword = Mobile.getText(findTestObject('MOBILE OBJECT/Register/errorMessage_confirmPassword'), 10)

Mobile.verifyMatch(errorMessageConfirmPassword, 'Password Does Not Matches', false)

Mobile.pressBack()
