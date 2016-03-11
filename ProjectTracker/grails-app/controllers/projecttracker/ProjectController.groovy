package projecttracker

class ProjectController {

	def index = {
		redirect (action: current)
	}

    def current = { 
    	def allProjects = Project.list()
    	[allProjects:allProjects]
    	render "hello"
    }

    def overdue = {
    	render "Order Valentines Day Package"
    }
}

