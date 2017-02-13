package lu.wealins.lissia_services.business;

import java.util.List;

import lu.wealins.lissia_services.model.Bill;

public interface BillsService {

	public List<Bill> retrieveBills();

	public String testFront();
}
