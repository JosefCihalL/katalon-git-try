import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.Environment)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Login page/Logo_Leveris'))

WebUI.verifyElementVisible(findTestObject('Login page/Label_Login'))

WebUI.verifyElementVisible(findTestObject('Login page/Label_Email'))

WebUI.verifyElementVisible(findTestObject('Login page/Input_Email'))

WebUI.verifyElementVisible(findTestObject('Login page/Label_Password'))

WebUI.verifyElementVisible(findTestObject('Login page/Input_Password'))

WebUI.verifyElementVisible(findTestObject('Login page/Picture_PasswordVisible'))

WebUI.verifyElementVisible(findTestObject('Login page/Button_Forgotten password'))

WebUI.verifyElementVisible(findTestObject('Login page/Button_Log in'))

WebUI.closeBrowser()

