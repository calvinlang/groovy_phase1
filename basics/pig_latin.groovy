
// Primitive solution first N2
sentence = "This is converted to a pig latin format eww"

def pigLatinNormalWord(string) {
	string += string[0] + "ay"
	string = string.substring(1)
}

def convertToPigLatin(sentenceToConvert) {
	// def vowels = ['a','e','i','o','u','A','E','I','O','U']
	def vowels = [
					a: true,
					e: true,
					i: true,
					o: true,
					u: true,
					A: true,
					E: true,
					I: true,
					O: true,
					U: true
					]
	
	wordsSplit = sentenceToConvert.split(" ")
	String accumulator = ""
	wordsSplit.each { element ->
		if (vowels[element[0]]) { // if it starts with a vowel. 
			//Remove first iteration for hash constant lookup.
			accumulator += element + " "
		} else {
			// learned valuable lesson that there is a class difference between characters and strings
			if (Character.isUpperCase(element.charAt(0))) { //uppercase
				String firstLetter = element.charAt(0).toLowerCase()
				String word = firstLetter + element.substring(1)
				word = pigLatinNormalWord(word)
				firstLetter = word.charAt(0).toUpperCase().toString()
				word = firstLetter + word.substring(1)
				accumulator += word + " "
			} else {
				accumulator += pigLatinNormalWord(element) + " "
			}
		}
	}
	accumulator[0..-2] // to remove the extra space at the end
}


println convertToPigLatin(sentence)

assert convertToPigLatin("Hello") == "Ellohay"
assert convertToPigLatin("Electrocute") == "Electrocute"
assert convertToPigLatin("hello") == "ellohay"
assert convertToPigLatin("electrocute") == "electrocute"