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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\com.yoesuv.androidroom-v1(2.1.6)-production-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Mobile/addTask'), 20)

Mobile.setText(findTestObject('Object Repository/Mobile/fieldTitle'), 'testTitle', 20)

Mobile.setText(findTestObject('Object Repository/Mobile/fieldTaskContent (1)'), 'testTaskContent', 20)

Mobile.tap(findTestObject('Object Repository/Mobile/btSave'), 20)

Mobile.closeApplication()

//def title = Mobile.getText(findTestObject('Object Repository/Mobile/cekTitle (1)'), 10)
//def taskContent = Mobile.getText(findTestObject('Object Repository/Mobile/fieldTaskContent (1)'), 10)
//def cekTitle = Mobile.verifyEqual(title, 'testTitle')
//def cekTaskContent = Mobile.verifyEqual(taskContent, 'testTaskContent')

//println title
//println taskContent
//println cekTitle
//println cekTaskContent

//if (cekTitle == 'true' && cekTaskContent == 'true') {
//	println('success add task')
//	Mobile.closeApplication()
//}


