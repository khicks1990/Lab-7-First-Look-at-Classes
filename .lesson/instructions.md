# Instructions  

A Game of Twenty-One
For this assignment, you will write a program that lets the user play against the computer in a variation of the popular blackjack card game. In this variation of the game, two six-sided dice are used instead of cards. The dice are rolled, and the player tries to beat the computer’s hidden total without going over 21.
Here are some suggestions for the game’s design:


Each round of the game is performed as an iteration of a loop that repeats as long as the player agrees to roll the dice, and the player’s total does not exceed 21.


At the beginning of each round, the program will ask the user whether or not he or she wants to roll the dice to accumulate points.


During each round, the program simulates the rolling of two six-sided dice. It rolls the dice first for the computer, and then it asks the user whether he or she wants to roll.


The loop keeps a running total of both the computer’s and the user’s points.


The computer’s total should remain hidden until the loop has finished.


After the loop has finished, the computer’s total is revealed, and the player with the most points, without going over 21, wins.