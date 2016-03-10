def fibonacci_number(n) {
	if (n == 0) {
		return 0
	} else if (n == 1) {
		return 1
	}
	n = fibonacci_number(n-1) + fibonacci_number(n-2)
}

println fibonacci_number(12)