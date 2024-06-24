package com.baeldung.stockapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Michael Caverly <m.caverly30@gmail.com>
 */
@Component
public class StockDatabaseLoader implements CommandLineRunner {
    
    private final StockRepository db;

    @Autowired
    public StockDatabaseLoader(StockRepository db) {
        this.db = db;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.db.save(new Stock("CL.F", "Oil"));
        this.db.save(new Stock("GC.F", "Gold"));
        this.db.save(new Stock("SI.F", "Silver"));
    }
}
