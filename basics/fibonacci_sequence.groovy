def fibonacciNumber(n) {
	if (n == 0) {
		return 0
	} else if (n == 1) {
		return 1
	}
	n = fibonacciNumber(n-1) + fibonacciNumber(n-2)
}

println fibonacciNumber(12)