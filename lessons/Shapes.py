import pygame
from pygame import Color, Rect
from pygame import draw
from pygame import display

# initialize pygame modules
pygame.init()

# make a surface for graphics
gameDisplay = display.set_mode((500, 500))

# draw circle(Surface, Color(name), (x, y), radius
#draw.circle(gameDisplay, Color('yellow'), (300, 300), 200    )

# show graphics on screen
display.flip()



# wait for user to enter input to close window
input("Press enter to exit")