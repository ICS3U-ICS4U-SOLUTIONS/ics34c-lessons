# Change Direction Moving Ball and Bounce off Walls

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
up = False
down = True
right = True
left = False


while run == True:
    
    print(str(center_x) + " " + str(center_y))

    
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
                up = True
                down = False
                left = False
                right = False

            # MOVE DOWN
            if event.key == K_DOWN:
                up = False
                down = True
                left = False
                right = False
                
            # MOVE LEFT
            if event.key == K_LEFT:
                up = False
                down = False
                left = True
                right = False
                
            # MOVE RIGHT
            if event.key == K_RIGHT:
                up = False
                down = False
                left = False
                right = True
    
    
    # BOUNCE UP EFFECT
    if center_y > 375:
        up = True
        down = False
        left = False
        right = False
    
    # BOUNCE DOWN EFFECT
    if center_y < 25:
        up = False
        down = True
        left = False
        right = False
    
    # BOUNCE LEFT EFFECT
    if center_x > 575:
        up = False
        down = False
        left = True
        right = False
    
    # BOUNCE RIGHT EFFECT
    if center_x < 25:
        up = False
        down = False
        left = False
        right = True
                
    # MOVE UP
    if up == True:
        center_y -= 1

    # MOVE DOWN
    if down == True:
        center_y += 1
            
    # MOVE LEFT
    if left == True:
        center_x -= 1
                
    # MOVE RIGHT
    if right == True:
        center_x += 1
    
    
    # pause
    clock.tick(45)
    
    # show graphics on screen
    display.flip()
