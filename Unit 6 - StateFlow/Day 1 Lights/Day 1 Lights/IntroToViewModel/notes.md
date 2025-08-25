# View Model and Config Changes

[The vid this lecture this based on](https://www.youtube.com/watch?v=9sqvBydNJSg)

## MVVM
 - View
 - ViewModel
 - Model

## Example

### Build ViewModel
- Right click on the project in and click `Open Moduler Setters`
- Upgrade SDK
- Build SwitchViewModel
- **Do not Inherate from ViewModel yet**
- 

### Update MainActivity
- Add `private val viewModel = SwitchViewModel()` as a global var
- Build Button in main activity
- Set the background color to `viewModel.backgroundColor`

### Surviving Config changes
- Config change happens when you rotate sceen
or check lang or check theme
- Inheart `ViewModel` in `SwitchViewModel`
- This still wont fix our problem bc everytime 
we rebuild main activity we reinit `SwitchViewModel`
on line 15
- To fix this we need to build `SwitchViewModel` the android way
- Update dec of `viewModel`
- 