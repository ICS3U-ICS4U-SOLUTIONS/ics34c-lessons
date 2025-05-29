import pygame

from pygame import Color
from pygame import draw
from pygame import display
from pygame import time

#Constants & Variables
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

    # draw the ball
    draw.circle(gameDisplay, Color('purple'), (center_x, center_y), 30)

    # show the graphics on the screen
    display.flip()

    # get ready for next frame - move the ball down and to the right
    center_x += 2
    center_y += 1

    #delay the program to obtain 45 frames per second
    clock.tick(45)

