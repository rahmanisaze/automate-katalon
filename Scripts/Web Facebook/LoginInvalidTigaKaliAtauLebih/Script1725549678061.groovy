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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'),
	email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'),
	'PNKhqrno+crZQceKVOcGnA==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in'))

String failedLogin = WebUI.getUrl()

String errorMessage = WebUI.getText(findTestObject('Object Repository/Page_1725545881244/errorMessage'))

String borderColor = WebUI.getCSSValue(findTestObject('Object Repository/Page_1725545881244/borderEmail'), 'border-bottom-color')

String checkBorderColor = WebUI.verifyEqual(borderColor, 'rgb(240, 40, 73)')

println (borderColor)

println (checkBorderColor)

println(failedLogin)

println(errorMessage)

if (checkBorderColor == 'true' && failedLogin.contains('https://www.facebook.com/login/?privacy_mutation_token=') && errorMessage == 'The email address or mobile number you entered isn\'t connected to an account. Find your account and log in.') {
	println('failed login sekali')
}

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'),
	email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'),
	'PNKhqrno+crZQceKVOcGnA==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in'))

String failedLogin2 = WebUI.getUrl()

String errorMessage2 = WebUI.getText(findTestObject('Object Repository/Page_1725545881244/errorMessage'))

String borderColor2 = WebUI.getCSSValue(findTestObject('Object Repository/Page_1725545881244/borderEmail'), 'border-bottom-color')

String checkBorderColor2 = WebUI.verifyEqual(borderColor, 'rgb(240, 40, 73)')

println (borderColor2)

println (checkBorderColor2)

println(failedLogin2)

println(errorMessage2)

if (checkBorderColor2 == 'true' && failedLogin2.contains('https://www.facebook.com/login/device-based/regular/login/?login_attempt=') && errorMessage2 == 'The email address or mobile number you entered isn\'t connected to an account. Find your account and log in.') {
	println('failed login dua kali')
}

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'),
	email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'),
	'PNKhqrno+crZQceKVOcGnA==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in'))

String failedLogin3 = WebUI.getUrl()

String errorMessage3 = WebUI.getText(findTestObject('Object Repository/Page_1725545881244/errorMessage'))

String borderColor3 = WebUI.getCSSValue(findTestObject('Object Repository/Page_1725545881244/borderEmail'), 'border-bottom-color')

String checkBorderColor3 = WebUI.verifyEqual(borderColor, 'rgb(240, 40, 73)')

println (borderColor3)

println (checkBorderColor3)

println(failedLogin3)

println(errorMessage3)

if (checkBorderColor3 == 'true' && failedLogin3.contains('https://www.facebook.com/login/device-based/regular/login/?login_attempt=') && errorMessage3 == 'The email address or mobile number you entered isn\'t connected to an account. Create a new Facebook account.') {
	println('failed login tiga kali')
}

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'),
	email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'),
	'PNKhqrno+crZQceKVOcGnA==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log in'))

String failedLogin4 = WebUI.getUrl()

String errorMessage4 = WebUI.getText(findTestObject('Object Repository/Page_1725545881244/errorMessage'))

String borderColor4 = WebUI.getCSSValue(findTestObject('Object Repository/Page_1725545881244/borderEmail'), 'border-bottom-color')

String checkBorderColor4 = WebUI.verifyEqual(borderColor, 'rgb(240, 40, 73)')

println (borderColor4)

println (checkBorderColor4)

println(failedLogin4)

println(errorMessage4)

if (checkBorderColor4 == 'true' && failedLogin4.contains('https://www.facebook.com/login/device-based/regular/login/?login_attempt=') && errorMessage4 == 'The email address or mobile number you entered isn\'t connected to an account. Create a new Facebook account.') {
	println('failed login empat kali')
	WebUI.closeBrowser()
}
