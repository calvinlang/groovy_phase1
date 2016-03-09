// following second half of this tutorial https://www.youtube.com/watch?v=-mRlc_vjiqE
import groovy.json.JsonSlurper;
// First we have to build a stadium class/instance
class Stadium {
	int id
	String name
	String team
	double latitude
	double longitude

	String toString() {"($name,$latitude,$longitude"}

	def base = 'https://maps.googleapis.com/maps/api/geocode/json?&address='
	// def params = [sensor:false, oe:'utf8', output: 'json']
	def fillInLatLong() {
		def url = base + name.split(" ").join("+")
		// Tutorial uses Google Maps V2 which is comma separated. 
		// This implementation with use JSON
		def JsonSlurper = new JsonSlurper()
			.parseText(new URL(url).text)
		latitude = JsonSlurper.results[0].geometry.location.lat
		longitude = JsonSlurper.results[0].geometry.location.lng
	}
}


