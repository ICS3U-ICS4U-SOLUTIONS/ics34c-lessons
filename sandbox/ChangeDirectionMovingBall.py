# ChangeDirectionMovingBall.py

import pygame
from pygame import Color
from pygame import draw
from pygame import display
from pygame import time
from pygame.locals import (K_UP, K_DOWN, K_LEFT, K_RIGHT,  K_ESCAPE, KEYDOWN)
from pickle import TRUE, FALSE
 
# Constants and Variables
SCREEN_SIZE = (600, 400)
center_x = 50
center_y = 50
run = True 
up = False 
down = True 
right = True 
left = False 

# initialize pygame modules
pygame.init()

clock = time.Clock()

# get a surface for graphics display
gameDisplay = display.set_mode(SCREEN_SIZE)

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

            # UP KEY
            if event.key == K_UP:
                up = True
                down = False
                right = False 
                left = False 
            
            # DOWN KEY
            if event.key == K_DOWN:
                up = False
                down = True
                right = False 
                left = False 
            
            # LEFT KEY
            if event.key == K_LEFT:
                up = False
                down = False
                right = False 
                left = True 
            
            # RIGHT KEY
            if event.key == K_RIGHT:
                up = False
                down = False
                right = True 
                left = False 
    
    
    # BOUNCE OFF WALLS
    
    # HIT TOP WALL
    if center_y == 25:
        up = False
        down = True
        right = False 
        left = False 
    
    # HIT BOTTOM WALL
    if center_y == 375:
        up = True
        down = False
        right = False 
        left = False 
    
    # HIT LEFT WALL
    if center_x == 25:
        up = False
        down = False
        right = True 
        left = False 
    
    # HIT RIGHT WALL
    if center_x == 575:
        up = False
        down = False
        right = False 
        left = True 
        
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
        center_x +=1
    
    # PAUSE
    clock.tick(4000)
    
    # show graphics on screen
    display.flip()

