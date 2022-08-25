package onepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
 public class KitchenController {

	 private final KitchenService kitchenService;

	 @GetMapping("cook/{id}")
	 public List<Kitchen> getByOrderId(@PathVariable int id) {
		 //Optional<ArrayList<Kitchen>> CookingList =
		 return kitchenService.findByOrderId(id);
	 }
	 @PutMapping("cook/{id}")
	 public List<Kitchen> updateByOrderId(@PathVariable("id") int orderId, @RequestBody KitchenDto requestDto) {
		 //Optional<ArrayList<Kitchen>> CookingList =
		 return kitchenService.updateByOrderId(orderId, requestDto);
	 }
 }
