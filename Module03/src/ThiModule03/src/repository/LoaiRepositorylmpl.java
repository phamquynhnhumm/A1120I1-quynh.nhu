package repository;

import model.Loai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiRepositorylmpl implements LoaiRepository {
    public static final String SELECT_LOAI = "select * from danhmuc;";
    public static final String SELECT_LOAI_ID = "select * from danhmuc where =?;";

    @Override
    public List<Loai> finAll() {
        List<Loai> loaiList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_LOAI);
                resultSet = statement.executeQuery();
                System.out.println("kết nối thanhg công");
                Loai loai = null;
                while (resultSet.next()) {
                    String id_loai = resultSet.getString("id_loai");
                    String ten_loai = resultSet.getString("ten_loai");
                    loai = new Loai(id_loai, ten_loai);
                    loaiList.add(loai);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return loaiList;
    }

    @Override
    public void save(Loai loai) {

    }

    @Override
    public List<Loai> finByName(String name) {
        return null;
    }

    @Override
    public Loai update(String id, Loai loai) {
        return null;
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Loai finById1(String id) {
        Loai loai = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_LOAI_ID);
                statement.setString(1, id);

                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String id_loai = resultSet.getString("id_loai");
                    String ten_loai = resultSet.getString("ten_loai");
                    loai = new Loai(id_loai, ten_loai);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return loai;

    }
}
