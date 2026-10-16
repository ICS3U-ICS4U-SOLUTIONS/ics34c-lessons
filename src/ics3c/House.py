import pygame
from pygame import Color, Rect
from pygame import draw
from pygame import display

# initialize pygame modules
pygame.init()

# get a surface for graphics display
gameDisplay = display.set_mode((500, 500))

# background - color of sky
gameDisplay.fill(Color('lightblue'))

# draw base of house
draw.rect(gameDisplay, Color('brown'), Rect(100, 200, 300, 200))

# draw roof of house
draw.polygon(gameDisplay, Color('black'), [ (200,100), (350,100), (320,325)])

# draw green grass
draw.rect(gameDisplay, Color('green'), Rect(0, 400, 500, 100))

# draw sun
draw.circle(gameDisplay, Color('yellow'),  (25, 30), 45     )


# show the graphics on the screen
display.flip()

# Wait for user input before closing the window
input("Press enter to exit")