package com.ithema.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.itheima.util.DataSourceUtils;

public class C3p0Test {
	/**
	 * @deprecated 这是读取数据库中的函数
	 */
	@Test
	public void testC3p0(){
		//建立runner，入口参数为连接池资源
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		//sql语句
		String sql="select * from T_Abnormal";
		//执行，返回对象数组
		try {
			Object[] query = qr.query(sql, new ArrayHandler());
			System.out.println(query[2].toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println(Arrays.toString(query));
		
	}
	@Test
	public void beanHandler() throws SQLException{
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="select * from T_Abnormal";
		
		ManInfo bean = qr.query(sql, new BeanHandler<ManInfo>(ManInfo.class));
		
		System.out.println("id---"+bean.getId());
		System.out.println("Pid---"+bean.getPatientId());
		System.out.println("name---"+bean.getName());
		System.out.println("abinfo---"+bean.getAbInfo());
		System.out.println("time---"+bean.getTime());
		System.out.println("username---"+bean.getUsername());
	}
	@Test
	public void beanListHandler() throws SQLException{
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		
		String sql="select * from T_Patient";
		
		List<Patient> list = qr.query(sql, new BeanListHandler<Patient>(Patient.class));
		
		for (Patient Patient : list) {
			
//			System.out.println("add---"+Patient.getPAddress());
//			System.out.println("PId---"+Patient.getPatientID());
//			System.out.println("Pbir---"+Patient.getPBirth());
//			System.out.println("PIdcard---"+Patient.getPIdCard());
//			System.out.println("Pname---"+Patient.getPname());
//			System.out.println("Pnation---"+Patient.getPNation());
//			System.out.println("PPhone---"+Patient.getPPhone());
//			System.out.println("PPhoto---"+Patient.getPPhoto());
//			System.out.println("Psex---"+Patient.getPsex());
//			System.out.println("------------------------------------");
		}
	}
}
