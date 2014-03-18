LT
==

Very unelegant board game stuff.  Just some ideas.  This would be a Command-Line game. No graphics.

So the players.  Just some stuff is thrown out there for now.  Would use inheritance to create the players and cards.
Everything is pretty straightforward.

Let the Launcher Class launch the game.  Just one main While Loop till a game terminating event breaks out of the loop.

Players will inherit and initialize their own decks.

So the question now is how they'll execute the turns which essentially is how the board/movement in it would be implemented.  I mean, incrementing attributes (--Ht) discarding/drawing (ArrayList methods) are relatively easy.  The difficult thing I forsee would be how to let the players move the figure. How to represent the board?  Maybe create various Segment and Connector classes (Segment: each with it's length, the Connector endpoints, way to keep track of how far you are along with respect to a Connector. This could be changed by a move)
So to move, player has burden of knowing how the segments fit into the board.  There could be a while loop counting down how much of the move he has left.
Player will input a segment and how far along a connector he wants figure to move, then a check to see if this is within range. Actually, this seems retarded...too much burden on the player to understand the abstraction.

Hmmm...2D array of numbers actually printed on the screen.  Like a matrix if you will. 1's and 0's. Maybe 2 for Bridge and 3 for lady or something. The player would enter the coordinates of where he wants her to move and game checks if valid.  There could be a huge table linking every two positions to each other with distance value.  Wait no, that's retarded.  Won't account for the bridges!!

Actually how about just LET THE PLAYER enter coordinates and take his word for it and move there.  Better yet, could have a further while loop letting the other players enter "yes" or "no" to approve the move.  Ah and before the play also such a similar while loop for writing contracts and variables to keep track of how often players actually followed through.  But this is too specific of detail.

Basically very simple stuff.  Just a lot of it.  Then after framework, the details.  Then the stuff I have no idea about: graphics, GUI, multiplayer, expand shit out of it, simulations/game theory, stuff beyong me.
