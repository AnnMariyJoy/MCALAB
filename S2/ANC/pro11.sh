#!/bin/bash
ari_op(){
	num=$1
	num1=$2
	sum=$((num + num1))  
	echo "Sum ="$sum
	
	sub=$((num -num1))  
        echo "Difference = "$sub
        
        mul=$((num * num1))  
	echo "Product ="$mul
	
	div=$((num / num1))  
	echo "Quotient = "$div 
	
}
read -p "Enter the frist number:" number1
read -p "Enter the second number:" number2
ari_op $number1 $number2
