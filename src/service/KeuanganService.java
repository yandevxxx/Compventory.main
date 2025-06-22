
package service;
import java.sql.Connection;
import javax.swing.JTable;

public interface KeuanganService {
    public void ShowKeuanganLogs(Connection conn, JTable table);
}
