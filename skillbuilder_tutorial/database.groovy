groovy.sql.Sql class {
	def db = Sql.newInstance(
		'jdbc:mysql://localhost:3306/baseball',
		'username',
		'passowrd',
		'com.mysql.jdbc.Driver'
		)

	db.execute "drop table if exists stadiums;"
	db.execute '''
		create table stadiums(
			id int not null auto_increment,
			name varchar(200) not null,
			team char(3) no null,
			latitude,
			longitude,
			primary key(id)
		);
	'''
}

