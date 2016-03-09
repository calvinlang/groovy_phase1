// Fizzbuzz will take an array of integers and for every multiple of 3 PRINT fizz
// every multiple of 5 print "buzz", and multiples of both print "fizzbuzz"

def collection = 1..50

def fizzbuzz(number_collection) {
	number_collection.each { element ->
		if (element % 3 == 0 && element % 5 == 0) {
			println "fizzbuzz"
		} else if (element % 3 == 0) {
			println "fizz"
		} else if (element % 5 == 0) {
			println "buzz"
		} else {
			println element
		}
	}
}

fizzbuzz(collection)

