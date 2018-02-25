package controllers;

import play.mvc.*;

import views.html.index;
import views.html.Home.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {

        // These variables can be viewed through debugger. Run the app:
        // `sbt run -jvm-debug 9999`
        // and create a run configuration in IntelliJ:
        // Run > Edit Configurations > [plus] > Remote, port 9999
        // then set breakpoints, run debugging and access the app through the browser.
        //
        // https://youtu.be/RVKU9JvZmao - Debug Play application in IntelliJ

        int x = 100;
        String s = "lorem ipsum dolor";

        return ok(index.render(s + " / Text from HomeController.index()."));
    }

    public Result welcome(String name, String lastName) {
        return ok(welcome.render(name, lastName));
    }

}
