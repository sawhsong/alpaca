package project.common.module.payment;

import zebra.data.ParamEntity;

public interface PaymentBiz {
	public ParamEntity getDefault(ParamEntity paramEntity) throws Exception;
}