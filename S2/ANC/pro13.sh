#!/bin/bash

echo "Student Mark list"
echo "Enter student name"
read name
echo "Enter Register number"
read num
echo "Enter the  Mark 1"
read m1
echo "Enter the  Mark 2"
read m2
echo "Enter the  Mark 3"
read m3
total=$(expr $m1+$m2+$m3)
avg=$(($total/3))

echo "Student Mark list"
echo "Name:$name"
echo "Register:$num"
echo "Mark1:$m1"
echo "Mark2:$m2"
echo "Mark3:$m3"
echo "Total:$total"
echo "average:$avg"
if [ $m1 -ge 35 ] && [ $m2 -ge 35 ] && [ $m3 -ge 35 ] 
then
echo "Result:Pass"
if [ $avg -ge 90 ]
then
echo "Grade:S"
elif [ $avg -ge 80 ]
then
echo "Grade:A"
elif [ $avg -ge 70 ]
then
echo "Grade:B"
elif [ $avg -ge 60 ]
then
echo "Grade:C"
elif [ $avg -ge 50 ]
then
echo "Grade:D"
elif [ $avg -ge 35 ]
then
echo "Grade:F"
fi
else 
echo "Result:Fail"
fi
