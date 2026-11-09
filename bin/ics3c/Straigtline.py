import pygame

from pygame import Color
from pygame import draw
from pygame import display
from pygame import time

# constants and variables
SCREEN_SIZE = (600, 400)
center_x = 50
center_y = 50

# initialize pygame modules
pygame.init()

clock = time.Clock()

# get a surface for graphics display
gameDisplay = display.set_mode(SCREEN_SIZE)

while True:
    
    # white background
    gameDisplay.fill(Color('white'))
    
    # draw ball
    draw.circle(gameDisplay, Color('purple'), (center_x, center_y), 30)
   
    # move ball right and down
    center_x = center_x + 2
    center_y = center_y + 1

    # show the graphics on screen
    display.flip()
    
    # slow down the while loop to 45 frames per second
    clock.tick(45)
    
    
    