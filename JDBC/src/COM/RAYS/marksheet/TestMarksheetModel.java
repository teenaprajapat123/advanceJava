package COM.RAYS.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheetModel { 
	

	public static void main(String[] args)throws Exception {
		//testAdd();
		//testdelete();
		//testUpdate();
		//testGetId();
	}
	private static void testAdd() throws Exception {
		
		MarksheetBean bean = new MarksheetBean();
		
		bean.setId(10);
		bean.setRollno("Rays10");
		bean.setFname("raj");
		bean.setLname("jat");
		bean.setPhy(45);
		bean.setChe(65);
		bean.setMat(75);
		
		MarksheetModel mod = new MarksheetModel();
		
		mod.Add(bean);
		
	}}

	
//private static void testdelete() throws Exception {
//	
//	MarksheetBean bean = new MarksheetBean();
//	
//	bean.setId(7);
//	bean.setRollno("Rays7");
//	bean.setFname("Nishant");
//	bean.setLname("Makwant");
//	bean.setPhy(44);
//	bean.setChe(69);
//	bean.setMat(78);
//	
//	MarksheetModel mod = new MarksheetModel();
//	
//	mod.Delete(bean);
//	
//}

	
//       private static void testUpdate() throws Exception {
//    	   
//    	   MarksheetBean bean = new MarksheetBean();
//    	   
//    	  bean.setFname("sobha");
//    	  bean.setLname("sisodiya");
//    	  bean.setId(8);
//    	  
//    	MarksheetModel mod = new MarksheetModel();
//    	
//    	mod.Update(bean);
//    	
//       }
//		
//	}










	