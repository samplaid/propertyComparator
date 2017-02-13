package lu.wealins.lissia_services.db.repository;

import lu.wealins.lissia_services.db.entity.Bills;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Bills repository interface
 * 
 * @author xqv60
 *
 */
public interface BillsRepository extends JpaRepository<Bills, Long> {

}
