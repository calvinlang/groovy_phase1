package projecttracker2

class EndUser {
	String userName
	String password
	String fullName
	static hasMany [ projects: Project, tasks : Task]

    static constraints = {
    }
}
