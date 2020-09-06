## Easy

#### Assignment 1 
* Create a new project in Android Studio.
* Create a greeting  "Happy Birthday to " and someone with a recent birthday.
* Change the background of the app using a birthday-themed image.

#### Assignment 2
* Create a coffee ordering app.
* Add buttons to change the number of coffees ordered.
* Calculate and display the total price.

#### Assignment 3
* Create an app to work with Android Fragments.
* Add 5 different fragments and add tabs to navigate between them.
* Also change the background color.

#### Assignment 4
* Create an app to work with different type of menus.
* Add an options menu with icons one for date picker and time picker
* Add 2 textviews in the xml file.
* By choosing date picker should display date on first textview in bold and fontfamily as aclonica
* By choosing time picker should display time on second textview in italic and fontfamily as cusrsive

#### Assignment 5
* Create an android application to work with intents.
* Add an edittext and 2 buttons in the first activity and a textview in the second activity.
* Add an explicit intent, to read the data from the first activity and display it in the second activity.
* Add an implicit imtent to another button , by clicking on should navigate you to gmail.

#### Assignment 6
* Create an android application to work with textview and scrollview.
* Add 5 textviews to the application and add some data regarding your interested topics.
* Make sure every topic include some numbers,mails and links and they have to be displayed with color code : #009624
* Use auto link option to the textview.

#### Assignment 7
* Create an android application to work with recyclerview.
* Create a row file in which imageview and textview should be vertically alligned.
* Choose any movies you like from the internet add their images manually and display them in the recyclerview.

## Normal

#### Assignment 1
* Create an app which consists of google android workshop Registration form in the launcher screen. The registration form must contain the following fields.
  * NAME OF THE STUDENT (EditText, The string “Enter your name” must be displayed as a hint to the user)
  * NAME OF THE COLLEGE (EditText, The string “Enter your College name” must be displayed as a hint to the user )
  * STUDENT PHONE NUMBER (EditText – which allows only 10 digits as your phone number, The string “Enter your Phone Number” must be displayed as a hint to the user)
  * STUDENT EMAIL ID(EditText – must display the keyboard with @ symbol, The string “Enter your  Email” must be displayed as a hint to the user)
  * Select your Branch (List all the branch names in your college in a spinner)
  * Select your year of study (List 1st,2nd ,3rd & 4th values in strings.xml file as an array and display them on the spinner for selection)
  * Gender (Two radio buttons, only one must be selectable [values: male and female])
  * Select your Interests (This option should display 5 check boxes to the user, Allow multiple selection [values: ANDROID, PHP, JAVA, PYTHON].)
  * Submit Button (This button must take you to the next activity with all the selections and inputs given above).
  * In the details activity which opens as soon as a button is clicked, show all the details got from the first screen and display them in a scrollable text view (Style: LargeText).
  
#### Assignment 2
* Create an android application to work with navigation components.
* Create 5 fragments in the application
* Connect first 3 fragments with the mainactivity 
* Connect remaining 2 fragments with all the 3 fragments by adding buttons to establish connectivity between them.
* make sure that each fragment will have a different color and unique name to be displayed in the fragment.

#### Assignment 3
* Change the icon for the floating action button from Basic Activity Template that appears at the bottom of the MainActivity screen in your app.
  * For this Assignment:
    * Change the icon for the floating action button to an appropriate icon for a map, such as the world icon.
    * In MainActivity, replace the action to display a snackbar with an implicit intent to launch the Maps app when the floating action button is tapped.
    * Add the following specific coordinates (for Google headquarters) and the zoom level (12) to a string resource called google_mtv_coord_zoom12
    * ```<string name="google_mtv_coord_zoom12">geo:37.422114,-122.086744?z=12</string>```
    * Write code to Load a map with the above given location in string on fab
button click.

## Hard

#### Assignment 1
* Create a calculator app to perform all type of arthimatical operations on it.

#### Assignment 2
* Create a new android application to work with recyclerview.
* Create a layout file to display an image and text in each item (row.xml).
* Use retrofit concept and parse books api .( Link : https://www.googleapis.com/books/v1/volumes?q=c ).
* Display the book image and the book name in the recyclerview.
 ###### Optional :
  * Add an edittext where user can type a book name and can fetch the books in the recyclerview.
  
#### Assignment 3
* Create an app that displays an ImageView and plus and minus buttons.
* The ImageView contains a level list drawable that is a battery level indicator.
* Pressing the plus or minus button changes the level of the indicator.
* Use the battery icons from the Vector Asset Studio to represent 7 different values for the battery level.
  * The app has the following properties:
    * The plus button increments the level, causing the battery indicator to appear more full.
    * The minus button decrements the level, causing the indicator to empty one level.
