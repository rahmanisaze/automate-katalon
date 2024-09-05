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

String successLogin = WebUI.getUrl()

String username = WebUI.getText(findTestObject('Object Repository/Page_(20) Facebook/username'))

println(successLogin)

println(username)

if ((successLogin == 'https://www.facebook.com/') && (username == 'Rahma Nisa Z E')) {
	println('success login')
}

WebUI.click(findTestObject('Object Repository/Page_(20) Facebook/menuFacebook'))

WebUI.click(findTestObject('Object Repository/Page_(20) Facebook/div_Keluar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Facebook  log in or sign up/tooltip'), 20)

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Remove'))

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Facebook  log in or sign up/wording desc recent login'), 20)){
	WebUI.closeBrowser()
}