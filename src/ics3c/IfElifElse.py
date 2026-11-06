# IfElifElse.py
# if ... elif ... else with 3 branches

# variables
DRIVING_AGE = 16
RETEST_AGE = 80

# input
userAge = int(input("Please enter your age: "))

# processing and output
if userAge >= DRIVING_AGE and userAge < RETEST_AGE:
    print("You can drive!")
    
elif userAge >= RETEST_AGE:
    print("You need a retest to drive.")
    
else:
    print("Too young to drive.")