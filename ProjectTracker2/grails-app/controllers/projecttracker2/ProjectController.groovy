package projecttracker2

class ProjectController {
	def scaffold = true

    def index() { }

    def current() {
    	def allProjects = listProjects.list()
    }
}
