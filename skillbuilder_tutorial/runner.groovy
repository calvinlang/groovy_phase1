def stadiums = []
stadiums << new Stadium(name:'Angel Stadium',team:'ana')
stadiums << new Stadium(name:'Chase Field',team:'ari')
stadiums << new Stadium(name:'Turner Field',team:'atl')
stadiums << new Stadium(name:'Oriole Field',team:'bal')
stadiums << new Stadium(name:'Rogers Centre',team:'tor')


// URL: https://maps.googleapis.com/maps/api/geocode/output?parameters

println stadiums.each { 
	s -> s.fillInLatLong()
	db.execute """
		insert into stadium(name,team,latitude,longitude)

		values({$s.name},$s.{team},${s.latitude},${s.longitude});
	"""
}

assert db.rows('select * from stadiums').size() == stadiums.size()