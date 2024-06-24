package com.baeldung.stockapp.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Michael Caverly <m.caverly30@gmail.com>
 */
public interface StockRepository extends JpaRepository<Stock, Long> {

}
