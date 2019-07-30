package com.visa.prj.dao;

import java.util.ResourceBundle;

import com.visa.prj.dao.impl.MobileDaoDbImpl;

public class MobileDaoFactory {

	public static String NAME = "";

	static {
		ResourceBundle res = ResourceBundle.getBundle("database");
		NAME = res.getString("MOBILE_CLAZZ").trim();
	}

	public static MobileDao getMobileDao() {
//		return new MobileDaoDbImpl();
		try {
			return (MobileDao) Class.forName(NAME).newInstance();
		} catch (Exception ex) {
			System.out.println(ex);

		}
		return null;
	}
}
