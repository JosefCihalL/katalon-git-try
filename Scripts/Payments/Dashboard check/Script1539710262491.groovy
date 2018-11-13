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

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Credit Transfer'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Credit Transfer'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_SEPA Payment order'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_SEPA Payment order'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Payment orders'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Payment orders'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Internal payment order'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Internal payment order'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Statements'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Statements'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_AML'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_AML'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Payment files'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Payment files'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Sundry accounts'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Sundry accounts'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Reconciliation'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Reconciliation'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_External nostro accounts'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_External nostro accounts'))

WebUI.verifyElementVisible(findTestObject('Payments/Guidepost_Internal accounts'))

WebUI.verifyElementVisible(findTestObject('Payments/Innertext_Internal accounts'))

WebUI.closeBrowser()

