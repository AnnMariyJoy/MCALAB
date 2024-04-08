read -p "Enter the file name : " filename
read -p "Enter the starting line number : " start
read -p "Enter the ending line number : " end
num=$(($end-$start))
cat $filename | head -n $end | tail -n $num


Enter the file name : pro22.sh
Enter the starting line number : 1
Enter the ending line number : 4
read -p "Enter the starting line number : " start
read -p "Enter the ending line number : " end
num=$(($end-$start))

