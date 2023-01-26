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

Mobile.startApplication('C:\\Users\\Muhifa\\Downloads\\Android-MyDemoAppRN.1.2.0.build-231.apk', true)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Sauce Labs Backpack'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Proceed To Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText'), 'bob@example.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Checkout/android.widget.EditText (1)'), 'dbXIBZ66cuht4KTRMDozZw==', 
    0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Rebecca Winter'), 'M iqbal', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Mandorley 112'), 'telukjambe timur', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Entrance 1'), 'puseurjaya', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Truro'), 'karawang', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Cornwall'), 'jawa barat', 0)

Mobile.scrollToText('Country')

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 89750'), '41361', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - United Kingdom'), 'Indonesia', 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - To Payment'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Rebecca Winter (1)'), 'Rebecca Winter', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 3258 1265 7568 789'), '325812657568789', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 0325'), '03/25', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 123'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Review Order'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Place Order'), 0)

Mobile.closeApplication()

