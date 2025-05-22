# variables
turn = ""
monsterChoice = ""
print("Welcome to Adventure Game!")

# Scenerio 1
print("You're walking on a path and come to an split.")
print("Turn right or left (R/L)?")
turn = input()

if turn == "R":
    print("There is a monster.")
    
    print("Fight or hug (F/H)?")
    monsterChoice = input()
    
    if monsterChoice == "F":
        print("Bad decision.")
    
    elif monsterChoice == "H":
        print("Good decision.")
    
    
if turn == "L":
    print("There is a Snowshoe Hare.")