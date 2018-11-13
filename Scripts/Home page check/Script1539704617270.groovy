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

WebUI.callTestCase(findTestCase('Login'), [('Username') : 'john.doe@leveris.com', ('Password') : 'Password1122'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Home page/Picture_LeverisHome'))

WebUI.verifyElementVisible(findTestObject('Home page/Label_Home'))

WebUI.verifyElementVisible(findTestObject('Home page/Label_TodayIs'))

WebUI.verifyElementVisible(findTestObject('Home page/Widget_Calendar'))

WebUI.verifyElementVisible(findTestObject('Home page/Button_Tasks'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Operator'))

WebUI.click(findTestObject('Home page/Button_Home'))

WebUI.verifyElementVisible(findTestObject('Home page/Drawdown_Home'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Deposits'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_SVC'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Onboarding'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Operator'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Payments'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Administration'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Tasks'))

WebUI.verifyElementVisible(findTestObject('Home page/Dropdown_Cards'))

WebUI.closeBrowser()

