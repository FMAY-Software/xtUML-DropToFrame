# xtuml Drop to Frame

## Description

This project allows drop to frame support while debugging.  Drop to frame allows you to drop back and re-evaluate data that has already been stepped over.  Additionally this project includes support for modifying OAL and automatically resetting the debug state to the appropriate location using the drop to frame support.

## Requirements

R1.1 Enable drop to frame support in xtUML debug session.   
R1.1.1 If execution is paused enable the Drop to frame command.  
R1.1.2 If running or at the top of a body disable the drop to frame command.  

R2.1 Execution reversal  
R2.1.1 Evaluations shall be reversed until the top of a body is reached.  
R2.1.2 Continuing or running after a drop to frame shall re-evaluate from the top of a body.  
R2.1.3 Reversal shall drop out of any nested bodies that the current evaluation is within.  

R3.1 Stacks shall be maintained when dropping to a frame.  
R3.1.1  All changes triggered by the reversed evaluations shall be updated, including cross-component communcations.  

## Timeframe  

Feburary 28th of 2018.    

## Demonstrations

Video demonstrating drop to frame.

<a id="Drop To Frame"></a>[Drop To Frame](https://youtu.be/1Z1rxAr0sxc)

## Pledging

This project uses the <a id="Pledge Model"></a>[Pledge Model](https://fmaysoftware.wordpress.com/pledging-model/) and has a target of 25,000 USD.  

### Pledge to this project
Send an e-mail to [FMAY](mailto:travis.london@gmail.com) to pledge.  

Pledge status:  

![progress](http://progressed.io/bar/0 "progress")
 
