# Random Numbers
import random   # used to generate random numbers
random.seed()   # ensures numbers are random

# variables
userContinue = 'y'
userAnswer = 0

# Program Title
print("Addition Questions Program")

# Make a loop to allow user to repeat as many times as they like
while userContinue == 'y' or userContinue == 'Y':

    # create numbers for addition question
    num1 = random.randint(1, 10)
    num2 = random.randint(1, 10)
    
    while userAnswer != num1 + num2:
        # user prompt
        print("Answer the addition question: ")
        print(num1, " + ", num2, " = ")
        
        # input user's response
        userAnswer = int(input())
   
    # exit game
    userContinue = input("Continue? (y/n)")
    