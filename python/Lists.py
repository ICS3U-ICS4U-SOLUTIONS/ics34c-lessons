# variables
import marshal
myAnimal = "dog"
myNumber = 13

# chocolate bar variables
bar1 = "Mars Bar"
bar2 = "Kit Kat"
bar3 = "O Henry"
bar4 = "Snickers"
bar5 = "Cherry Blossom"

# print chocolate bars
#print(bar1)
#print(bar2)
#print(bar3)
#print(bar4)
#print(bar5)

# chocolate bars in a List
myChocolateBars = ["Mars Bar", "Kit Kat", "O Henry", "Snickers", "Cherry Blossom"]
myCandies = ["lolypop", "gummy bear", "twizzlers"]

# add chocolate bar to list
myChocolateBars.append("Galaxy")

# combine lists
myChocolateBars.extend(myCandies)

# insert chocolate bar
myChocolateBars.insert(2, "Aero")

# remove chocolate bar
myChocolateBars.pop(2)
myChocolateBars.remove("Snickers")
del myChocolateBars[0]

# print List
print(myChocolateBars)

# print using for loop
for item in myChocolateBars:
    print(item)

# delete entire list
del myChocolateBars






