class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
'/hello'(controller: 'docker')

        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
