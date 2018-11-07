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

WebUI.click(findTestObject('Payments/Sundry accounts/Button_Sundry accounts - Create new account'))

// this will give you current timestamp in seconds
long ts = System.currentTimeMillis() / 1000

// you need string, so simply convert long to String
String tsAsString = ts.toString()

// and finally, use your unique number in setText method
WebUI.setText(findTestObject('Payments/Sundry accounts/Create new account/Input_Account name'), 'QAA test Katalon - ' + 
    tsAsString)

AccountName = ('QAA test Katalon - ' + tsAsString)

WebUI.selectOptionByValue(findTestObject('Payments/Sundry accounts/Create new account/Select_Type (asset or liability account)'), 
    'Liability', false)

WebUI.click(findTestObject('Payments/Sundry accounts/Create new account/Label_Check balance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Sundry accounts/Create new account/Button_Create new account'))

WebUI.verifyElementText(findTestObject('Payments/Internal accounts/Value_Account status'), 'OPEN')

WebUI.verifyElementText(findTestObject('Payments/Internal accounts/Value_Check balance'), 'No')

WebUI.verifyElementText(findTestObject('Payments/Internal accounts/Value_Type (asset or liability account)'), 'Liability')

