# List Example

## Clone from GitHub
- Got to github page: https://github.com/google-developer-training/basic-android-kotlin-compose-training-affirmations/tree/starter
- `git clone https://github.com/google-developer-training/basic-android-kotlin-compose-training-affirmations.git`
- cd into project folder
- list all branches
  - `git branch -a`
- check out starter branch
  - `git checkout starter`

//check that you are in the right branch
git branch

## Model
- create a new package under `com.example.affirmations`
- name this package `model`
- in this new package make a new kt clas `Affirmation.kt`
- `@StringRes` annotation represents an ID of a String resource
- Build out the rest of `Affirmation.kt`
- In `Datasrouce.kt` uncomment imports and data

## View
- Build out `AffirmationCard()`
- Build out `AffirmationCardPreview()` just to test the card
- Create and Built out `AffirmationList()`
- Note: The DataSource class is found in the data package.
  - `import com.example.affirmations.data.Datasource`
- Use `AffirmationList()` inside of the `AffirmationApp()`
- Run App

## EOD
