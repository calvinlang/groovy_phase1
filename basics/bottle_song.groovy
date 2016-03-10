// 99 bottles will accept an argument and return the song until it hits 0 and say
// no more bottle of beer on the wall

// Turns out you can't name a method with an integer first in Groovy
def bottle_song(number_of_bottles = 22){
	int one_bottle_less = number_of_bottles - 1
	song_lyrics = "$number_of_bottles bottles of beer on the wall, $number_of_bottles bottles of beer.\n" +
		"Take one down, pass it around, $one_bottle_less bottles of beer on the wall"
	println song_lyrics
	if (number_of_bottles == 1) {
		println "No more bottles of beer on the wall!"
	} else {
		bottle_song(one_bottle_less)
	}
}

bottle_song(99)