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

WebUI.callTestCase(findTestCase('Payments/Create new sundry account'), [('AccountName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Payments/Internal accounts/Button_Actions'))

WebUI.click(findTestObject('Payments/Internal accounts/Button_External payment'))

WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/Input_IBAN  Account number'), IBAN)

WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/Input_Bank code (BIC sort code or ABA)'), BIC)

WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/Input_Amount and currency'), Amount)

WebUI.delay(1)

WebUI.click(findTestObject('Payments/Sundry accounts/External payment/Button_Next step'))

if (CountryStep1 == 'Czech Republic') {
    WebUI.waitForElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Beneficiary name'), 
        10)

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Beneficiary name'))

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Address of beneficiary'), 
        0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Address of beneficiary'), 
        0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_City'), 0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_City'), 0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Post code'), 0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Post code'), 0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_State  province'), 
        0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_State  province'), 
        0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Country'), 0)

    WebUI.verifyElementNotPresent(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Select_Country'), 0)

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Remittance info'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Remittance info'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Operator note'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Operator note'))

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Beneficiary name'), BeneficiaryName)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Remittance info'), RemittanceInfo)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Operator note'), OperatorNote)
} else if (CountryStep1 == 'Bulgaria') {
    WebUI.waitForElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Beneficiary name'), 
        10)

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Beneficiary name'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Address of beneficiary'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Address of beneficiary'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_City'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_City'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Post code'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Post code'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_State  province'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_State  province'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Country'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Select_Country'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Remittance info'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Remittance info'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Operator note'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Operator note'))

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Beneficiary name'), BeneficiaryName)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Address of beneficiary'), AddressOfBeneficiary)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_City'), City)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Post code'), PostCode)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_State  province'), StateProvince)

    WebUI.selectOptionByLabel(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Select_Country'), CountryStep2, 
        false)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Remittance info'), RemittanceInfo)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Operator note'), OperatorNote)
} else {
    WebUI.waitForElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Beneficiary name'), 
        10)

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Beneficiary name'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Address of beneficiary'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Address of beneficiary'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_City'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_City'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Post code'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Post code'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_State  province'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_State  province'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Country'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Select_Country'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Remittance info'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Remittance info'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Label_Operator note'))

    WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Operator note'))

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Beneficiary name'), BeneficiaryName)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Address of beneficiary'), AddressOfBeneficiary)

    WebUI.selectOptionByLabel(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Select_Country'), CountryStep2, 
        false)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_City'), City)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Post code'), PostCode)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_State  province'), StateProvince)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Remittance info'), RemittanceInfo)

    WebUI.setText(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Input_Operator note'), OperatorNote)
}

WebUI.click(findTestObject('Payments/Sundry accounts/External payment/STEP 2/Button_Done'))

WebUI.click(findTestObject('Payments/Sundry accounts/External payment/Approve order/Button_Approve order'))

WebUI.verifyElementVisible(findTestObject('Payments/Sundry accounts/External payment/Approve order/Label_Payment detail'))

