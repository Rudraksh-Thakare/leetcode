# Queen's Attack II

> Algorithms | Implementation | HackerRank

## Problem Overview

- Platform: HackerRank
- Domain: Algorithms
- Track: Implementation
- Difficulty: Medium
- Problem ID: 28833
- Max Score: 30
- Problem Link: [https://www.hackerrank.com/challenges/queens-attack-2/problem](https://www.hackerrank.com/challenges/queens-attack-2/problem)

## Problem

You will be given a square chess board with one queen and a number of obstacles placed on it.  Determine how many squares the queen can attack.  

A [queen](https://en.wikipedia.org/wiki/Queen_%28chess%29) is standing on an $n \times n$ [chessboard](https://en.wikipedia.org/wiki/Chess). The chess board's rows are numbered from $1$ to $n$, going from bottom to top.  Its columns are numbered from $1$ to $n$, going from left to right. Each square is referenced by a tuple, $(r, c)$, describing the row, $r$, and column, $c$, where the square is located.

The queen is standing at position $(r_q, c_q)$.  In a single move, she can attack any square in any of the eight directions (left, right, up, down, and the four diagonals). In the diagram below, the green circles denote all the cells the queen can attack from $(4, 4)$: 

![image](https://s3.amazonaws.com/hr-challenge-images/0/1485426500-a4039ebb00-chess1.png)

There are obstacles on the chessboard, each preventing the queen from attacking any square beyond it on that path. For example, an obstacle at location $(3, 5)$ in the diagram above prevents the queen from attacking cells $(3, 5)$, $(2, 6)$, and $(1, 7)$:

![image](https://s3.amazonaws.com/hr-challenge-images/0/1485459132-3fdc1f1ca3-chess_4_.png)

Given the queen's position and the locations of all the obstacles, find and print the number of squares the queen can attack from her position at $(r_q, c_q)$.  In the board above, there are $24$ such squares.

**Function Description**  

Complete the *queensAttack* function in the editor below.   

queensAttack has the following parameters:  
- *int n:* the number of rows and columns in the board  
- *nt k:* the number of obstacles on the board  
- *int r_q:* the row number of the queen's position  
- *int c_q:* the column number of the queen's position  
- *int obstacles[k][2]:* each element is an array of $2$ integers, the row and column of an obstacle  

**Returns**    
- *int:* the number of squares the queen can attack

## Submission

| Item | Value |
| --- | --- |
| Status | Accepted |
| Language | c |
| Score | 30.0 |
| Testcases | 22/22 passed |
| Submission ID | 476109183 |

---

_Synced with AlgorithmHub_