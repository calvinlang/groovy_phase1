This is my attempts at learning Groovy representing a fast paced process to learn the basics within a short period.

The process started with following a basic Skillbuilder tutorial to access the Google Maps API which I used JSON to receive information instead of xml.

Then I practiced some algorithms like 99 bottles, FizzBuzz and pig latin, followed by a very simple object oriented flashcard app. 

For more object oriented I followed a tutorial on Grails web framework. This used Grails 2.5 as I kept getting errors 

Grails Notes
Differences between Grails and Rails
- Rails gems are Grails plugins
- bootstrap file is where we can add seed file
- Command to run Grails is $ grails run-app
- Embedded Ruby -> 'erb' is in Grails is "gsp"
	- <%=  %> is ${  }
	- embedding methods is very different in that you special methods. 
		- For each it ends up being 
			- <g.each in="${variables}" status="i" var="variable">
				- variable is the instance
				- i is the counter
				- variable is the argument
			- </g.each>
- "Models" in Grails are known as "Domains". This means the same thing and even grails developers with use the terms "domains" and "models" interchangably
- What I'm gathering so far is that domains has more functions than just the associations but also has a list of all the database table headers. Looking forward to what the function of the migrations is.
- So far I was using a tutorial that would make a basic CRUD app in grails using an IDE called Eclipse. My thought was, I will do it all in Sublime and the console so that I can actually learn all these commands (there is a lot of scaffolding, more than rails I'd say). I think it's important to know the commands instead of point and clicking for the commands.
	- I followed a tutorial in Eclipse and I would use 'grails help' do figure out how to make the commands in console. This was fine. At one point in the tutorial the instructor said "Okay, we're going to change the names of our models and controllers and we'll just right click and select refactor." I went AUGH!!! So I tried to do this myself manually and learned a valuable lesson about commiting before doing something like this. I had to start over.
	- I will still try doing this without Eclipse.
- Model/Domain associations
	- Works just like active record with different syntax. Keep in mind domains may need all the headers included unline active record
- Scaffolding
	- I don't like scaffolding so I'll try to avoid it, especially at this stage.
	- Dynamic vs static
		- Static is more flexible




Some questions I still have that I need answers to progress
- How do I name groovy files so that other groovy files can access them?
- When do I use prototype? I've seen it on some sites.
- What is the difference between [Ljava.lang.String; and Arraylist? tokenize() vs split()
- When does one use assert? Should it be throughout code or they all be on their own separate page?
