
Algorithm: ??? - Gib Deiner Beschreibung einen sinnvollen Namen!
Input: ??? - Was könnten sinnvolle Eingabeparameter sein?
Output: ??? - Was ist das Ergebnis?
---
??? - Trage Deine Lösung hier ein - ???


# Algorithm: Brewing Potion

## Input

- cauldron: The type of cauldron being used.
- portions: The number of portions to be created.

## Output

- output: An array of bottles, each containing a portion of the potion.

---
~~~
# Initialize objects

Create a new Mortar object named mortar
Create a new Potion object named potion with cauldron as a parameter
Create a new Bottle object named bottle

# Part 1, Step 1

If "fluxweed" is picked on a "full-moon" Then
    Add 3 times the measure of "fluxweed" to potion
End If

Add 2 times the bundle of "knotgrass" to potion

Repeat 4 times
    Stir the potion clockwise
End Repeat

If cauldron is "Pewter" Then
    Brew the potion for 80 minutes
Else If cauldron is "brass" Then
    Brew the potion for 68 minutes
Else If cauldron is "copper" Then
    Brew the potion for 60 minutes
End If

# Part 1, Step 2

Add 4 times the leeches from the cauldron to potion

Crush 2 times the scoop of "lacewing flies" in the mortar and store it in crushedLacewingFlies
Add crushedLacewingFlies to potion
Heat the potion on low for 30 seconds
Wave a wand over the potion

# Part 2, Step 1

Add 3 times the measure of "boomslang skin" to potion

Crush 1 time the measure of "bicorn horn" in the mortar and store it in crushedBicornHorn
Add crushedBicornHorn to potion
Heat the potion on high for 20 seconds
Wave a wand over the potion

If cauldron is "Pewter" Then
    Brew the potion for 24 hours
Else If cauldron is "brass" Then
    Brew the potion for 20.4 hours
Else If cauldron is "copper" Then
    Brew the potion for 18 hours
End If

# Part 2, Step 2

Add 1 scoop of "lacewings" to potion

Set index to 1
Repeat
    Stir the potion counter-clockwise
    Increment index by 1
Until index is greater than 3

Set index to 1
Prompt the user for the number of portions to be created and store it in portions

Create an empty array named bottles
Repeat while index is less than or equal to portions
    Create a new Bottle object containing a portion of potion.content and add it to bottles
    Increment index by 1
End Repeat

Set output to be the array of bottles
~~~