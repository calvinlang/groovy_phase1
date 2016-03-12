// 99 bottles will accept an argument and return the song until it hits 0 and say
// no more bottle of beer on the wall

// Turns out you can't name a method with an integer first in Groovy
def bottleSong(number_of_bottles = 22){
	int oneBottleLess = numberOfBottles - 1
	songLyrics = "$numberOfBottles bottles of beer on the wall, $numberOfBottles bottles of beer.\n" +
		"Take one down, pass it around, $oneBottleLess bottles of beer on the wall"
	println songLyrics
	if (numberOfBottles == 1) {
		println "No more bottles of beer on the wall!"
	} else {
		bottleSong(oneBottleLess)
	}
}

bottleSong(99)