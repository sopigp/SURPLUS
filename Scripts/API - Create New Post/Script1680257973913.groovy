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
import groovy.json.JsonSlurper as JsonSlurper

response = WS.sendRequestAndVerify(findTestObject('API OBJECTS/Create New Post', [('url') : GlobalVariable.url, ('title') : GlobalVariable.title
            , ('body') : GlobalVariable.body, ('userId') : GlobalVariable.userId]))

System.out.println(response)

WS.verifyElementPropertyValue(response, 'title', GlobalVariable.title)

WS.verifyElementPropertyValue(response, 'body', GlobalVariable.body)

WS.verifyElementPropertyValue(response, 'userId', GlobalVariable.userId)

WS.verifyElementPropertyValue(response, 'id', '101')

WS.verifyResponseStatusCode(response, 201)

def response = '{"title": "Pentingnya Pendidikan Untuk Tingkatkan Kualitas Hidup", "body": "Pendidikan yang baik tentu saja sangat besar manfaatnya bagi kehidupan seseorang. Dan ada juga pepatah “tuntutlah ilmu setinggi langit” artinya kita harus belajar setinggi-tingginya untuk meningkatkan ajang kualitas hidup meski di rumah saja.", "userId": 100, "id": 101}'

def expectedTitle = 'Pentingnya Pendidikan Untuk Tingkatkan Kualitas Hidup'

def expectedBody = 'Pendidikan yang baik tentu saja sangat besar manfaatnya bagi kehidupan seseorang. Dan ada juga pepatah “tuntutlah ilmu setinggi langit” artinya kita harus belajar setinggi-tingginya untuk meningkatkan ajang kualitas hidup meski di rumah saja.'

def expectedUserId = 100

def expectedId = 101

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response)

assert expectedTitle == jsonResponse.title

assert expectedBody == jsonResponse.body

assert expectedUserId == jsonResponse.userId

assert expectedId == jsonResponse.id


