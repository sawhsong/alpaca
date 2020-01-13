package project.common.module.payment;

import project.common.extend.BaseBiz;
import zebra.data.ParamEntity;
import zebra.exception.FrameworkException;

public class PaymentBizImpl extends BaseBiz implements PaymentBiz {
	public ParamEntity getDefault(ParamEntity paramEntity) throws Exception {
		try {
			paramEntity.setSuccess(true);
		} catch (Exception ex) {
			throw new FrameworkException(paramEntity, ex);
		}
		return paramEntity;
	}
}