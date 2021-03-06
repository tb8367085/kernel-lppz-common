package com.lppz.jstorm.db;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

public class StormTransactionTemplate extends TransactionTemplate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5834002367385316884L;
	private transient JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public StormTransactionTemplate(JdbcTemplate jt,PlatformTransactionManager transactionManager) {
		super(transactionManager);
		this.jt = jt;
	}

	public StormTransactionTemplate() {
	}
}
