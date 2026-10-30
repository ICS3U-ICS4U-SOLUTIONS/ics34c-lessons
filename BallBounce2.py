# BallBounce
import pygame
import random
from pygame import Color
from pygame import draw
from pygame import display
from pygame import time

# Constants
SCREEN_WIDTH = 600
SCREEN_HEIGHT = 400
RADIUS = 30

# Variables
# position of ball
center_x = 250
center_y = 250

# change in position of ball
dx = random.randint(2, 4)
dy = random.randint(2, 4)

# initialize pygame modules
pygame.init()

clock = time.Clock()

# get a surface for graphics display
gameDisplay = display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))

while True:
    # white background
    gameDisplay.fill(Color('white'))

    # draw the ball
    draw.circle(gameDisplay, Color('purple'), (center_x, center_y), RADIUS)

    # show the graphics on the screen
    display.flip()

    # check for ball hitting the sides; make it bounce
    if center_x + RADIUS > SCREEN_WIDTH or center_x - RADIUS < 0:
        dx = -dx
        
    # check for ball hitting the sides; make it bounce
    if center_y + RADIUS > SCREEN_HEIGHT or center_y - RADIUS < 0:
        dy = -dy
        
    # move ball
    center_x = center_x + dx
    center_y = center_y + dy
        
    #delay the program to obtain 45 frames per second
    clock.tick(45)
    

    
