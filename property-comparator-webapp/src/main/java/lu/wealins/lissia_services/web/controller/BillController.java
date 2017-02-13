/**
 * 
 */
package lu.wealins.lissia_services.web.controller;

import java.util.List;

import lu.wealins.lissia_services.business.BillsService;
import lu.wealins.lissia_services.model.Bill;
import lu.wealins.lissia_services.web.model.GenericResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xqv66
 *
 */
@RestController
@RequestMapping(path = "/bill")
public class BillController {
	@Autowired
	private BillsService billService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public GenericResponse<List<Bill>> retrieveBills() {
		return new GenericResponse<List<Bill>>(billService.retrieveBills());
	}
}
