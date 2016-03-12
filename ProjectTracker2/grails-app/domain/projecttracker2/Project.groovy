package projecttracker2

class Project {
	String name
	String description
	Date dueDate
	String billingType
	String toString() {
		"${name}"
	}
	static belongsTo = [owners : EndUser]
	static hasMany = [tasks: Task]

    static constraints = {
    	name(blank: false, unique: true)
    	description()
    	dueDate(min: new Date())
    	billingType(inList: ["Hourly", "Milestone", "Nonbillable"])
    }
}
