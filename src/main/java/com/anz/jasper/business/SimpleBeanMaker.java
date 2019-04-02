package com.anz.jasper.business;

import java.util.ArrayList;

import com.anz.jasper.data.SimpleBean;

/**
 *
 * @author Nishant
 */
public class SimpleBeanMaker {
	/**
	 * 
	 * @return
	 */
	public ArrayList<SimpleBean> getDataBeanList() {
		ArrayList<SimpleBean> dataBeanList = new ArrayList<SimpleBean>();

		dataBeanList.add(produce("Prasun", "Engineer", "Bangalore", "India"));
		dataBeanList.add(produce("Nishant", "Engineer", "Bangalore", "India"));
		dataBeanList.add(produce("Vishnu", "Delivery lead", "Bangalore", "India"));
		dataBeanList.add(produce("Tumpa", "Engineer", "Kolkata", "India"));
		dataBeanList.add(produce("Nafis", "Engineer", "Orissa", "India"));
		dataBeanList.add(produce("Nitin", "Product Owner", "Bangalore", "India"));
		return dataBeanList;
	}

	/**
	 * 
	 * @param name
	 * @param occupation
	 * @param place
	 * @param country
	 * @return
	 */
	private SimpleBean produce(String name, String occupation, String place, String country) {
		SimpleBean dataBean = new SimpleBean();

		dataBean.setName(name);
		dataBean.setOccupation(occupation);
		dataBean.setPlace(place);
		dataBean.setCountry(country);

		return dataBean;
	}
}
