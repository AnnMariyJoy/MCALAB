#!/bin/bash
echo -e "Enter the name of the file : \c"
read file_name
#file_name=$1
if [ -e "$file_name" ]; then
    echo "The file '$file_name' exists."
else
    echo "The file '$file_name' does not exist."
fi

if [ -r "$file_name" ]; then
    echo "The file '$file_name' is readable."
else
    echo "The file '$file_name' is not readable."
fi

if [ -w "$file_name" ]; then
    echo "The file '$file_name' is writable."
else
    echo "The file '$file_name' is not writable."
fi

if [ -r "$file_name" ] && [ -w "$file_name" ]; then
    echo "The file '$file_name' is both readable and writable."
else
    echo "The file '$file_name' is either not readable or not writable."
fi

