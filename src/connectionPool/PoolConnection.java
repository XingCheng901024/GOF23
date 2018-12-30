package connectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PoolConnection  {

    /**
     * 数据库连接
     */
    Connection conn = null;

    /**
     * 标记是否被使用
     */
    boolean used = false;

    /**
     * 构造方法
     * @param conn
     * @param used
     */
    public PoolConnection(Connection conn,boolean used){
        this.conn = conn;
        this.used = used;
    }

    /**
     * 查询实现
     */
    public ResultSet querySql(String sql){
        Statement sm = null;
        ResultSet rs = null;
        try {
            sm = conn.createStatement();
            rs = sm.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;

    }

    //TODO  get\set方法待续..

}
