'''
1v1 Tag Game PSEUDOCODE VERSION
By Gilberto Diaz
'''
class 1v1TagGame:

class player1:
    method initialize
        initialize player with image
        angle = 0 degrees (right)
	it = false
        locationX = 50 pixels from left window side
	time = 60

class player1:
    method initialize
        initialize player with image
        angle = 180 degrees (left)
	it = false
        locationX = 50 pixels from right window side
	time = 60

class nonPlayerCharacters:
    method initialize
        initialize npcs with image
        angle = facing player who is it
	startingCount = 14
        location random positions
	command = follow player who is it

class speedBoosts
    method initialize
	initialize one in random position
	if player who is it touches it they speed up
	if player who is not it touches it it disappears (they do not get a boost)
	new speedBoosts spawn every 7 seconds in random position
	speed boosts do stack

class terrain:
    method initialize
        initialize randomly placed impassable terrain

player1 = triangle(blue, numbered 1)
player2 = triangle(blue, numbered 2)
nonPlayerCharacters = squares(green)
speedBoosts = squares(red)
terrain = varied(black)

while True:
    while True:
        if player1 presses right arrow key:
            player1.faceRight()
            player1.moveRight()
        if player1 presses left arrow key:
            player1.faceLeft()
            player1.moveLeft()
        if player1 presses down arrow key:
            player1.faceDown()
            player1.moveDown()
        if player1 presses up arrow key:
            player1.faceUp()
            player1.moveUp()

    while True:
        if player2 presses right arrow key:
            player2.faceRight()
            player2.moveRight()
        if player2 presses left arrow key:
            player2.faceLeft()
            player2.moveLeft()
        if player2 presses down arrow key:
            player2.faceDown()
            player2 moveDown()
        if player2 presses up arrow key:
            player2.faceUp()
            player2.moveUp()

    if player1 or player2 time = 0:
	run method gameOver

if player1 is it:
	tick down their time
else:
	do not tick time

if player2 is it:
	tick down their time
else:
	do not tick time

if player1 and player2 touch:
	run method tagged

method tagged
	if player1 is it:
		player2 becomes it
		player1 is no longer it, also they lose all speedBoosts
		teleport player2 to random spot (no tag-backs)
	else
		player1 becomes it
		player2 is no longer it, also they lose all speedBoosts
		teleport player1 to random spot (no tag-backs)

method gameOver
	if player1 is it:
		"Player 2 wins!"
	else
		"Player 1 Wins!"
