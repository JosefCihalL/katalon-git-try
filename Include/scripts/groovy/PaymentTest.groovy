import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class PaymentTest {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to log in to the system")
	def I_want_to_log_in_to_the_system() {
		println "Pokus"
		WebUI.openBrowser("https://dvk.deltecdev.com/operator")
		WebUI.setText(findTestObject('Login page/Input_Email'), "john.doe@leveris.com")
		WebUI.setText(findTestObject('Login page/Input_Password'), "Password1122")
		WebUI.click(findTestObject('Login page/Button_Log in'))
		WebUI.verifyElementVisible(findTestObject('Home page/Label_Home'))
	}

	@When("I go to Payments app")
	def I_go_to_Payments_app() {
		WebUI.click(findTestObject('Home page/Button_Home'))
		WebUI.click(findTestObject('Home page/Dropdown_Payments'))
	}

	@Then("I can see all Payments guideposts with correct inner text")
	def I_can_see_all_Payments_guideposts_with_correct_inner_text() {
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
	}
}