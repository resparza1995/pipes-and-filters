# pipes-and-filters

Small specific programs for Strings management.
The idea is to simulate the behavior of filters and pipes in Linux.

## How to run ?
1. Compiled files are in /bin. 
2. **type** "File on which to run the filter" | **java** "filter"

An example on Windows CMD
![alt text](https://github.com/fytta/pipes-and-filters/blob/master/Untitled.png?raw=true)

## Filter 1
Calculates the number of chars, white spaces, words and lines ‘from a file’.

## Filter 2
Removes empty lines from a file e.g. lines which have only the new line character.

## Filter 3
Removes white spaces from the end of the lines (trialing white spaces) in a file.

## Filter 4
Removes consecutive white spaces (=more than one white space in a row) from a file,
so that e.g. original 3 spaces are replaced with just one space.

## Filter 5
Removes one white space chars from a file.

## Filter 6
Removes c++ style ‘one line comments’ from a file. This means that after the double
slash chars (//) all the chars til the end of the line is removed (including the // chars).

## Filter 7
Removes c style ‘block comments’ from a file. This means that a block that starts with a
character pair ‘/*’ and ends with a ‘*/’ is removed from a file.
