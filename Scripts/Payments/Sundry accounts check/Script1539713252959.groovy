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

WebUI.click(findTestObject('Home page/Button_Home'))

WebUI.click(findTestObject('Home page/Dropdown_Payments'))

WebUI.click(findTestObject('Payments/Guidepost_Sundry accounts'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Label_Product area'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Input_Product area'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Select_Product area'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Button_Search'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Button_Sundry accounts - Create new account'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Label_Product area'))

WebUI.click(findTestObject('Payments/Sundry accounts/Button_Sundry accounts - Create new account'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_External number'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_Create new account'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_Check balance'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Button_Close'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_Account name'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Select_Currency'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Button_Cancel'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_Product area'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_Type (asset or liability account)'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Button_Create new account'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Label_Currency'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Input_External number'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Input_Account name'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Select_Product area'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/Create new account/Select_Type (asset or liability account)'))

WebUI.closeBrowser()

