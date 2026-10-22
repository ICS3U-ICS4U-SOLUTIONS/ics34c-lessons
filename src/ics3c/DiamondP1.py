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
    
    
    display.flip()