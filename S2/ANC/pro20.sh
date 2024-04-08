 # !/bin/bash


read -p "Enter employee number: " emp_number
read -p "Enter employee name: " emp_name
read -p "Enter basic salary: " basic_salary


if (( basic_salary > 5000 )); then
    hra=$(( basic_salary * 18 / 100 ))
else
    hra=550
fi

da=$(( basic_salary * 35 / 100 ))
pf=$(( basic_salary * 13 / 100 ))
ta=$(( basic_salary * 10 / 100 ))


gross_salary=$(( basic_salary + da + hra + ta ))
net_salary=$(( gross_salary - pf ))

echo "Employee Details:"
echo "-----------------"
echo "Employee Number: $emp_number" 
echo "Employee Name: $emp_name" 
echo "Basic Salary: $basic_salary" 
echo "HRA: $hra" 
echo "DA: $da" 
echo "TA: $ta"
echo "PF: $pf" 
echo "Gross Salary: $gross_salary" 
echo "Net Salary: $net_salary" 
echo -e "Employee Number:$emp_number\nEmployee Name:$emp_name\nBasic Salary: $basic_salary\nHRA: $hra\nDA: $da\nPF: $pf\nGross Salary: $gross_salary\nNet Salary: $net_salary" > program.txt


