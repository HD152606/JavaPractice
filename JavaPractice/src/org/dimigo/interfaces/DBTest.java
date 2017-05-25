/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *    |_DBTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author    : Kimminhyeong
 * @version   : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		
		System.out.println("<< 변경 전 >>");
		IDBManager db = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(db);
		System.out.println();
		System.out.println("<< 변경 후 >>");
		IDBManager db2 = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(db2);

	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
