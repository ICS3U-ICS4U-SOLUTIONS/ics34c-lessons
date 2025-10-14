# We can combine more than 1 condition per statement

# and:  both conditions have to be true
mark = int(input("Enter valid mark: "))

if (mark >= 0) and (mark <= 100):
    
    print("Valid mark.")

# or: one condition has to be true
if (mark > 100) or (mark < 0):
    
    print("Invalid mark.")


