# Key Movements

import pygame
from pygame import Color
from pygame import draw
from pygame import display
from pygame import time
from pygame.locals import (K_UP, K_DOWN, K_LEFT, K_RIGHT, K_ESCAPE, KEYDOWN)
from pickle import TRUE

# Constants and Variables
SCREEN_SIZE = (600, 400)
center_x = 50
center_y = 50

# initialize pygame modules
pygame.init()
clock = time.Clock()

# get a surface for graphics display
gameDisplay = display.set_mode(SCREEN_SIZE)

run = True

while run == True:
    
    # white background
    gameDisplay.fill(Color('white'))
    
    # draw a ball
    draw.circle(gameDisplay, Color('purple'), (center_x, center_y), 30)
    
    # DEFINE ESCAPE AND ARROW KEY ACTIONS
    for event in pygame.event.get():
        
        if event.type == KEYDOWN:

            # QUIT
            if event.key == K_ESCAPE:
                run = False
    
            # UP KEY
            if event.key == K_UP:
                center_y = center_y - 3
                
            # DOWN KEY
            if event.key == K_DOWN:
                center_y = center_y + 3
                
            # LEFT KEY
            if event.key == K_LEFT:
                center_x = center_x - 3
                
            # RIGHT KEY
            if event.key == K_RIGHT:
                center_x = center_x + 3

    
    # show graphics on screen
    display.flip()
    
    
    
    
    
    
    
    