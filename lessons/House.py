import pygame

from pygame import Color, Rect
from pygame import draw
from pygame import display

SCREEN_SIZE = (500, 500)

# initialize pygame modules
pygame.init()

# get a surface for graphics display
gameDisplay = display.set_mode(SCREEN_SIZE)

# background - color of the sky
gameDisplay.fill(Color('lightblue'))

# draw a house with a roof:  Rect(left, top, width, height)
# left, top - location of upper left corner
draw.rect(gameDisplay, Color('brown'), Rect(100, 200, 300, 200))

# draw.polygon(Surface, Color(name), [pointList])
# Draws a polygon with vertices specified in pointList, on the Surface provided
draw.polygon(gameDisplay, Color('black'), [(100, 200), (400, 200), (250, 50)])

# show the graphics on the screen
display.flip()

# Wait for user input before closing the window
input("Press enter to exit")