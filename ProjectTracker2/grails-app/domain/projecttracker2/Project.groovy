package projecttracker2

class Project {
	String name
	String description
	Date dueDate
	String toString() {
		"${name}"
	}
	static belongsTo = [owners : EndUser]
	static hasMany = [tasks: Task]

    static constraints = {
    	name()
    	description()
    	dueDate()
    }
}
