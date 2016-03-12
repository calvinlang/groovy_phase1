// Okay how does this assert this work?

def testing_assert() {
	println "Before assert"
	def zero = 0
	def one = 1
	assert zero > one : "O is not greater than 1"
	println "After assert"
}

testing_assert()

// This is the error:
// Caught: java.lang.AssertionError: Zero is not greater than 1. Expression: (zero > one). Values: zero = 0, one = 1
// java.lang.AssertionError: Zero is not greater than 1. Expression: (zero > one). Values: zero = 0, one = 1
//	at assert.testing_assert(assert.groovy:7)
//	at assert.run(assert.groovy:11)