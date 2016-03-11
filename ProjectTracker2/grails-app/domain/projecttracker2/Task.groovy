package projecttracker2

import java.util.Date;

class Task {
	String name
	String description
	Date dueDate
	static belongsTo = [assignee: EndUser, project: Project]

    static constraints = {
    }
}
