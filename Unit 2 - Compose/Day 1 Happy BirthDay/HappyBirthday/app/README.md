# Unit 2 Day 1

## What is Jetpack
[Jetpack](https://developer.android.com/jetpack/compose) is a suite of libaries to build modern andoid apps. There where anoid apps before jetback.
But Jetpack is built on what the andoid community leanred after 10 years of building apps. It is
open source and built by Google/the Community.

### Compose
Compose is part of Jetpack. I built android apps before Jetpack and now with jetpack you can build UI
with a lot less code vs old UI toolkit. Old toolkit was written all in XML almost like a webpage.
Now you can write your UT like code.

### In Class Activity BirthDay card
- Today we will build a Birthday card together
- Build a composable function
- Change font
- Add more then one element to the screen
- Arrange text
- Run app on device

### Build a new App
- Create a new Project in Android Studio
    - Make it an Empty Project
    - Name it `Happy Birthday`

### Composable functions
- Rename the `GreetingPreview()` to `BirthdayCardPreview()`

### Composite function naming rues:
    MUST be a noun: DoneButton()
    NOT a verb or verb phrase: DrawTextField()
    NOT a nouned preposition: TextFieldWithLink()
    NOT an adjective: Bright()
    NOT an adverb: Outside()
    Nouns MAY be prefixed by descriptive adjectives: RoundIcon()
### Design pane in Android Studio

You can preview your design within the IDE without running the app by clicking on the `Design` pane
- You will have to compile the code first

### Change text
- Change greeting text to your name
- See update in design tab

### Add a new text elemnt
- Delete Geeting fun
- Delete all ref of Greeting fun
- Build new   `GreetingText()`
- Add two parameters, `modifier` and `message`
- Make a Text composable
- Call `GreetingText()` inside `BirthdayCardPreview()`
- Make the message `message = "Happy Birday Name"`
- App should say Happy Birthday now

## Change fext size
- SP = Scalable Pixels, DP = desnisty-inderpent pixels. They are they same value by defualt.
- Change fontSize in the Text() composable
- Change lineHeight

## Add another text elemnt
- Add `from` parameter of type String into `GreetingText()`
- Add from arguemnt to GreetingText() call `from = "From bill"`
- Notice that from is before we will fix that.

## Changing Arrangement Row and Column
- Sround Text with `Row`
- Notice change in Design
- change `Row` with `Column`
- Pass modifoer parpaement to its child we will explain this later

## Add the greeting to the app
- Call GreetingText() in the Surface block
- Run app on device
- add `  verticalArrangement = Arrangement.Center,` to Column
- change modiifovers
- 