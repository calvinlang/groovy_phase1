
// Primitive solution first N2
sentence = "This is converted to a pig latin format eww"

def pigLatinNormalWord(string) {
	string += string[0] + "ay"
	string = string.substring(1)
}

def convertToPigLatin(sentenceToConvert) {
	def vowels = ['a','e','i','o','u','A','E','I','O','U']
	wordsSplit = sentenceToConvert.split(" ")
	accumulator = ""
	// Why won't uppercase work? Is it a class issue?
	wordsSplit.each { element ->
		
		if (vowels.contains(element[0])) { // if it starts with a vowel
			accumulator += element + " "
		} else {
			if (Character.isUpperCase(element.charAt(0))) {
				firstLetter = element.charAt(0).toLowerCase().toString()
				word = firstLetter + element.substring(1)
				word = pigLatinNormalWord(word)
				firstLetter = word.charAt(0).toUpperCase().toString()
				word = firstLetter + word.substring(1)
				accumulator += word + " "
			} else {
				accumulator += pigLatinNormalWord(element) + " "
			}
		}
	}
	accumulator[0..-2]
}


println pigLatinNormalWord("normal")
println convertToPigLatin(sentence)

assert convertToPigLatin("Hello") == "Ellohay"