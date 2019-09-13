package project.common.module.bizservice.invoice;

import org.springframework.beans.factory.annotation.Autowired;

import project.conf.resource.ormapper.dao.HpInvoice.HpInvoiceDao;
import project.conf.resource.ormapper.dto.oracle.HpInvoice;
import zebra.data.DataSet;
import zebra.data.QueryAdvisor;
import zebra.example.common.extend.BaseBiz;

public class InvoiceBizServiceImpl extends BaseBiz implements InvoiceBizService {
	@Autowired
	private HpInvoiceDao hpInvoiceDao;

	public DataSet getInvoiceList(QueryAdvisor queryAdvisor) throws Exception {
		DataSet ds = new DataSet();

		hpInvoiceDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		ds = hpInvoiceDao.getInvoiceList(queryAdvisor);
		return ds;
	}

	public HpInvoice getInvoiceByInvoiceId(QueryAdvisor queryAdvisor, String invoiceId) throws Exception {
		hpInvoiceDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));
		return hpInvoiceDao.getByInvoiceId(invoiceId);
	}

	public int updateStatus(QueryAdvisor queryAdvisor, String invoiceId, String toStatus) throws Exception {
		HpInvoice hpInvoice = new HpInvoice();

		hpInvoice.addUpdateColumn("status", toStatus);
		hpInvoice.addUpdateColumn("last_updated_by", "1");
		hpInvoice.addUpdateColumn("last_update_date", "sysdate", "Date");

		queryAdvisor.addWhereClause("invoice_id = '"+invoiceId+"'");

		hpInvoiceDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));

		return hpInvoiceDao.updateInvoiceByColumn(queryAdvisor, hpInvoice);
	}

	public int updateInvoiceSubTotal(QueryAdvisor queryAdvisor, String invoiceId, String toGstAmount) throws Exception {
		HpInvoice hpInvoice = new HpInvoice();

		hpInvoice.addUpdateColumn("gst_amount", toGstAmount, "Number");
		hpInvoice.addUpdateColumn("last_updated_by", "1");
		hpInvoice.addUpdateColumn("last_update_date", "sysdate", "Date");

		queryAdvisor.addWhereClause("invoice_id = '"+invoiceId+"'");

		hpInvoiceDao.setDataSourceName((String)queryAdvisor.getObject("dataSource"));

		return hpInvoiceDao.updateInvoiceByColumn(queryAdvisor, hpInvoice);
	}
}