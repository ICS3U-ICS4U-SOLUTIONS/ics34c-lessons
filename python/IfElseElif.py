# Program gets grade from user, then determines level
mark = int(input("Enter a mark: "))

# Level 0 is below 50%
if (mark < 50):
    
    print("Level 0")

# Level 1 is between (50-59%)
elif (mark < 60):
    
    print("Level 1")
    
# Level 2 is between (60-69%)
elif(mark < 70):

    print("Level 2")
    
# Level 3 is between (70-79%)
elif(mark < 80):
    
    print("Level 3")

# Level 4 is between (80-100%)
else:

    print("Level 4")
