class FlashCard {
	String question
	String answer
}

class Deck {
	def deck = []

	def newCard(question,answer) {
		deck << new FlashCard(question: question, answer: answer)
		println deck
	}

	def showAllCards() {
		deck.each { card -> 
			println "Question: $card.question"
			println "Answer: $card.answer \n"
			println "\n"
		}
	}

	def askAllCards() {
		deck.each { card ->
			userAnswer = System.console().readLine "Question: $card.question"
			println userAnswer
			println "*******"
			if (userAnswer == card.answer) {
				println "That is correct!"
			} else {
				"Thats is incorrect"
			}
		}
		println "Completed, you're all done!"
	}
}


myDeck = new Deck()
myDeck.newCard("Answer is two","two")
myDeck.newCard("Answer is 'optometrist'","optometrist")
myDeck.askAllCards()