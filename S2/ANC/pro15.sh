#!/bin/bash
read -p "Enter the Number:" x
read -p "Enter the Digit:" a
num=$x
occ=0
while [ $num != 0 ]
do
    digit=$(($num % 10))
    if [ $digit -eq $a ] ; then 
       occ=$(($occ + 1 ))
    fi
    num=$(($num/10))
done
echo "Occurrence=$occ"


