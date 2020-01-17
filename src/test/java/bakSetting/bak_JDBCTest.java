package bakSetting;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
/**
 * @author danny
 *  
 * */
@Log4j
public class bak_JDBCTest {
	static { // static field에서 클래스 생성 시 기본 setting
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@접속주소:포트번호:DB (XE 또는 ORCL)",
				"ID",
				"PASSWORD")) {
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
