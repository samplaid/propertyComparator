package lu.wealins.lissia_services.business.impl;

import java.util.List;

import lu.wealins.lissia_services.business.BillsService;
import lu.wealins.lissia_services.db.entity.Bills;
import lu.wealins.lissia_services.db.repository.BillsRepository;
import lu.wealins.lissia_services.model.Bill;
import ma.glasnost.orika.MapperFacade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class BillsServiceImpl implements BillsService {

	@Autowired
	private BillsRepository billsRepository;

	@Autowired
	private MapperFacade mapperFacade;

	@Override   
    public List<Bill> retrieveBills(){
        List<Bills> billEntities = billsRepository.findAll();
        List<Bill> response = mapperFacade.mapAsList(billEntities, Bill.class);
        return response;
    }

	@Override
	public String testFront() {
		return "ping";
	}

}
