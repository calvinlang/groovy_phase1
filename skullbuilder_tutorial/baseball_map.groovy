// following second half of this tutorial https://www.youtube.com/watch?v=-mRlc_vjiqE

// First we have to build a stadium class/instance
class Stadium {
	int id
	String name
	String team
	double latitude
	double longitude

	String toString() {"($name,$latitude,$longitude"}

	def base = 'https://maps.googleapis.com/maps/api/geocode/json?'
	def params = [sensor:false, oe:'utf8', output: 'json']
	def fillInLatLong() {
		def url = base + name.split(" ").join("+")
		println url
	}
}

def stadiums = []
stadiums << new Stadium(name:'Angel Stadium',team:'ana')
stadiums << new Stadium(name:'Chase Field',team:'ari')
stadiums << new Stadium(name:'Turner Field',team:'atl')
stadiums << new Stadium(name:'Oriole Field',team:'bal')
stadiums << new Stadium(name:'Rogers Centre',team:'tor')


// URL: https://maps.googleapis.com/maps/api/geocode/output?parameters

stadiums.each { s -> s.fillInLatLong()}