# Move Ball

import pygame
from pygame import Color
from pygame import draw
from pygame import display
from pygame import time
from pygame.locals import (K_UP, K_DOWN, K_LEFT, K_RIGHT,  K_ESCAPE, KEYDOWN)
 
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
    draw.circle(gameDisplay, Color('purple'), (center_x, center_y), 30 )
    
    # DEFINE ESCAPE AND ARROW KEY ACTIONS
    for event in pygame.event.get():
        
        if event.type == KEYDOWN:
    
            # QUIT        
            if event.key == K_ESCAPE:
                run = False
    
            # MOVE UP
            if event.key == K_UP:
                center_y = center_y - 2

            # MOVE DOWN
            if event.key == K_DOWN:
                center_y = center_y + 2
    
            # MOVE LEFT
            if event.key == K_LEFT:
                center_x = center_x - 2
                
            # MOVE RIGHT
            if event.key == K_RIGHT:
                center_x = center_x + 2
    
    # show graphics on screen
    display.flip()

