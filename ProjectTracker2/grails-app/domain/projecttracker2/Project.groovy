package projecttracker2

class Project {
	String name
	String description
	Date dueDate
	static belongsTo = [owners : EndUser]
	static hasMany = [tasks: Task]

    static constraints = {
    }
}
