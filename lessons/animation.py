# Straight Line

import pygame
from pygame import Color
from pygame import draw
from pygame import display
from pygame import time

# Constants and Variables
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
    
    # draw a ball
    draw.circle(gameDisplay, Color('purple'), (center_x, center_y), 30 )
    
    # show graphics on screen
    display.flip()

    # get ready for next frame - move the ball down and to the right
    center_x = center_x + 2
    center_y = center_y + 1
    
    # pause
    clock.tick(45)
