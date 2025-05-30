import pygame

from pygame import Color
from pygame import draw
from pygame import display
from pygame import time

SCREEN_SIZE = (500, 500)
center_x = 250
center_y = 150

# initialize pygame modules
pygame.init()

clock = time.Clock()

# get a surface for graphics display
gameDisplay = display.set_mode(SCREEN_SIZE)

while True:
    
    for i in range(0, 100):
        # white background
        gameDisplay.fill(Color('white'))
        
        # draw ball
        draw.circle(gameDisplay, Color('purple'), (center_x, center_y), 30 )

        # show the ball on the screen
        display.flip()
        
        # move the ball down and right
        center_x += 1
        center_y += 1
        
        # put a delay, 60 frames per second
        clock.tick(60)
        
    for i in range(0, 100):
        # white background
        gameDisplay.fill(Color('white'))
        
        # draw ball
        draw.circle(gameDisplay, Color('red'), (center_x, center_y), 30 )

        # show the ball on the screen
        display.flip()
        
        # move the ball down and seft
        center_x -= 1
        center_y += 1
        
        # put a delay, 60 frames per second
        clock.tick(60)


    for i in range(0, 100):
        # white background
        gameDisplay.fill(Color('white'))
        
        # draw ball
        draw.circle(gameDisplay, Color('blue'), (center_x, center_y), 30 )

        # show the ball on the screen
        display.flip()
        
        # move the ball up and left
        center_x -= 1
        center_y -= 1
        
        # put a delay, 60 frames per second
        clock.tick(60)

    for i in range(0, 100):
        # white background
        gameDisplay.fill(Color('white'))
        
        # draw ball
        draw.circle(gameDisplay, Color('green'), (center_x, center_y), 30 )

        # show the ball on the screen
        display.flip()
        
        # move the ball up and right
        center_x += 1
        center_y -= 1
        
        # put a delay, 60 frames per second
        clock.tick(60)