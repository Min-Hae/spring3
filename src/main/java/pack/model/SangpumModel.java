package pack.model;

import org.springframework.stereotype.Component;

import pack.controller.SangpumBean;

@Component
public class SangpumModel {
	public String compute(SangpumBean bean) {
		String data="ǰ��: "+bean.getSang() + " "
				+", �ݾ� : " + (bean.getSu() * bean.getDan());
		return data;
	}
}
