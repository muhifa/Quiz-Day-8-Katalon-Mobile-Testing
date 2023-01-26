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

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Sauce Labs Backpack (2)'), 0)

Mobile.scrollToText('Add To Cart')

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Add To Cart (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Proceed To Checkout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - bobexample.com (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Login (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Rebecca Winter (4)'), ' ', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Mandorley 112 (2)'), ' ', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Entrance 1 (2)'), ' ', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Truro (2)'), ' ', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Cornwall (2)'), ' ', 0)

Mobile.scrollToText('Country')

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 89750 (2)'), ' ', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - United Kingdom (2)'), ' ', 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - To Payment (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - Rebecca Winter (5)'), 'Rebecca Winter', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 3258 1265 7568 789 (2)'), '325812657568789', 
    0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 0325 (2)'), '03/25', 0)

Mobile.setText(findTestObject('Object Repository/Checkout/android.widget.EditText - 123 (2)'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Review Order (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.TextView - Place Order (1)'), 0)

Mobile.closeApplication()

