echo "Enter first number:"
read a
echo "Enter second number:"
read b
echo "Enter third number:"
read c
echo "Enter fourth number:"
read d

s=$(($a + $b + $c + $d))
y=$(($a * $b * $c * $d))
avg=$((s/4))
echo "Sum="$s
echo "product="$y
echo "Average="$avg

