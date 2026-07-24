# Grading Students

> Algorithms | Implementation | HackerRank

## Problem Overview

- Platform: HackerRank
- Domain: Algorithms
- Track: Implementation
- Difficulty: Easy
- Problem ID: 30508
- Max Score: 10
- Problem Link: [https://www.hackerrank.com/challenges/grading/problem](https://www.hackerrank.com/challenges/grading/problem)

## Problem

HackerLand University has the following grading policy:

* Every student receives a $grade$ in the inclusive range from $0$ to $100$.
* Any $grade$ less than $40$ is a failing grade. 

Sam is a professor at the university and likes to round each student's $grade$ according to these rules:

* If the difference between the $grade$ and the next multiple of $5$ is less than $3$, round $grade$ up to the next multiple of $5$.
* If the value of $grade$ is less than $38$, no rounding occurs as the result will still be a failing grade.

**Examples**

- $grade = 84$ round to $85$ (85 - 84 is less than 3)  
- $grade = 29$ do not round (result is less than 38)  
- $grade = 57$ do not round (60 - 57 is 3 or higher)   

Given the initial value of $grade$ for each of Sam's $n$ students, write code to automate the rounding process.   

**Function Description**  

Complete the function $gradingStudents$ with the following parameter(s):  

- $int\ grades[n]$: the grades before rounding  

**Returns**

- $int[n]$: the grades after rounding

## Submission

| Item | Value |
| --- | --- |
| Status | Accepted |
| Language | java15 |
| Score | 10.0 |
| Testcases | 12/12 passed |
| Submission ID | 477985621 |

---

_Synced with AlgorithmHub_