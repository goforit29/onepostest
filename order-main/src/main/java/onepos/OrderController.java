package onepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

 @RestController
 public class OrderController {
  @GetMapping("order/{id}")
  public String getByOrderId(@PathVariable int id) {
    //Optional<ArrayList<Kitchen>> CookingList =
    return id+" is ordered";
  }

 }
