import at.angular.core.OnInit
import at.angular.lib.Component

@Component(
    selector = "app-name",
    templateUrl = "./name.component.html",
    template = """
        <p>
          name works!
        </p>
    """,
    styleUrls = ["./name.component.css"],
    styles = [
        """
        :host {
          display: block;
        }
    """
    ]
)
class Component : OnInit {

    override fun ngOnInit() {
    }
}