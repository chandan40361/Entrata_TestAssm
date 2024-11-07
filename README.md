**Project Overview**
This project contains automated test cases for verifying key features of the Entrata.com website. The test cases are written using Selenium WebDriver under src/test/java/testCases file and are organized to cover various functionalities like verifying the homepage title, checking image display, scheduling a demo, and handling multiple browser windows.

**Test Cases**

**1. TC001_HomePageTitleTest**
Description: Verifies the title of the homepage to ensure it matches the expected title.

Steps: 
Launch the browser and open Entrata.com. 
Capture and validate the title of the homepage.

Expected Outcome: The homepage title should match the expected title.

**2. TC002_ImageDisplay**
3. Description: Checks that images on the homepage load and display correctly.

Steps: 
Navigate to the relevant page on Entrata.com. 
Verify that each targeted image element is displayed.

Expected Outcome: All images should be visible and loaded without errors.

**3. TC003_ScheduleDemo**
Description: Tests the scheduling demo feature, including handling dropdown menus.

Steps: 
Navigate to the demo scheduling page. 
Select values from dropdown menus as required. 
Complete the demo scheduling form and submit it.

Expected Outcome: The demo should be scheduled successfully, and dropdowns should function correctly.

**4. TC004_HandleBrowserWindows**
Description: Handles multiple browser windows, verifying the ability to interact with different pages.

Steps: 
Trigger actions that open new browser tabs. 
Switch between tabs as necessary. 
Verify content on each page.

Expected Outcome: All opened browser windows or tabs should be handled smoothly, and required actions should be performed without issues. Prerequisites

**Tools:** 
Java, Selenium WebDriver, TestNG

**Browser:**
Chrome (as supported by Selenium WebDriver) 

**Framework:**
Maven (for dependency management)

**How to Run the Tests**
Clone the repository. 
Open the project in an IDE like Eclipse. 
Configure the testng.xml file to run the desired test cases. 
Execute the test suite using TestNG.

**Results and Reporting Test**
results will be logged in the console.
