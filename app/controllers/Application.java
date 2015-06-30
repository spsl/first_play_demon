package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.User;

import play.db.jpa.Transactional;

public class Application extends Controller {

	@Transactional(readOnly=true)
    public Result index() {
		
		User user = User.findById(1L);
		
        return ok(index.render("Your new application is ready."+user.username));




    }

}
