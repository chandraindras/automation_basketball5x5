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
WebUI.navigateToUrl('https://basketball5x5-dev.fotogrit.id/')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/a_Sign Up_flex items-center gap-2 font-arti_73f0ba'))

// POSITIVE CASE - Valid Email & Valid Password
WebUI.setText(findTestObject('Object Repository/Page_Fotogrit/input__email'), 'chandraindras31@gmail.com')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__password'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fotogrit/input__password'), 'TCdEHGtpZOB0FxRQb+YUrQ==')
// Centang I'm not robot secara manual
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__robot'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__w-full h-44px rounded-md text-white _3c447d'))
// Inputkan kode OTP secara manual yang dikirimkan melalui email
WebUI.delay(25)
WebUI.delay(15)
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/img_Cart_min-w-10 max-w-10 lgmin-w-12 lgmax_cf1124'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/button_Change Password_w-full text-left px-_f8de96'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/button_Are you sure you want to log out_btn_b1065a'))

// NEGATIVE CASE - Invalid Email & Valid Password
WebUI.navigateToUrl('https://basketball5x5-dev.fotogrit.id/')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/a_Sign Up_flex items-center gap-2 font-arti_73f0ba'))
WebUI.setText(findTestObject('Object Repository/Page_Fotogrit/input__email'), 'cobaemail@gmail.com')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__password'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fotogrit/input__password'), 'TCdEHGtpZOB0FxRQb+YUrQ==')
// Centang I'm not robot secara manual
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__robot'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__w-full h-44px rounded-md text-white _3c447d'))
WebUI.delay(15)

// NEGATIVE CASE - Valid Email & Invalid Password
WebUI.navigateToUrl('https://basketball5x5-dev.fotogrit.id/')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/a_Sign Up_flex items-center gap-2 font-arti_73f0ba'))
WebUI.setText(findTestObject('Object Repository/Page_Fotogrit/input__email'), 'chandraindras31@gmail.com')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__password'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fotogrit/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')
// Centang I'm not robot secara manual
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__robot'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__w-full h-44px rounded-md text-white _3c447d'))
WebUI.delay(15)

// NEGATIVE CASE - Leave Email
WebUI.navigateToUrl('https://basketball5x5-dev.fotogrit.id/')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/a_Sign Up_flex items-center gap-2 font-arti_73f0ba'))
WebUI.setText(findTestObject('Object Repository/Page_Fotogrit/input__email'), ' ')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__password'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fotogrit/input__password'), 'TCdEHGtpZOB0FxRQb+YUrQ==')
// Centang I'm not robot secara manual
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__robot'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__w-full h-44px rounded-md text-white _3c447d'))
WebUI.delay(15)

// NEGATIVE CASE - Password Blank
WebUI.navigateToUrl('https://basketball5x5-dev.fotogrit.id/')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/a_Sign Up_flex items-center gap-2 font-arti_73f0ba'))
WebUI.setText(findTestObject('Object Repository/Page_Fotogrit/input__email'), 'chandraindras31@gmai.com')
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__password'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fotogrit/input__password'), ' ')
// Centang I'm not robot secara manual
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__robot'))
WebUI.click(findTestObject('Object Repository/Page_Fotogrit/input__w-full h-44px rounded-md text-white _3c447d'))
WebUI.delay(15)

// cek script