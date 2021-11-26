package repository;

import model.Loai;
import model.Sanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanphamRepositorylmpl implements SanphamRepository {
    public static final String SELECT_SANPHAM = "select  id_sanpham, ten_sp, gia, soluong, mausac, mota,sanpham.id_loai, danhmuc.ten_loai from sanpham inner join danhmuc on sanpham.id_loai = danhmuc.id_loai;";
    public static final String INSERT_SANPHAM = " insert into sanpham (ten_sp, gia, soluong, mausac, mota,id_loai) value(?,?,?,?,?,?);";
    public static final String DELETE_SANPHAM = "delete from sanpham where id_sanpham=?;";
    public static final String UPDATE_SANPHAM = "update sanpham set ten_sp=?, gia=?, soluong=?, mausac=?, mota=?,id_loai=? where id_sanpham=?;";
    public static final String SELECT_SP_ID = "select  id_sanpham, ten_sp, gia, soluong, mausac, mota,sanpham.id_loai, danhmuc.ten_loai from sanpham inner join danhmuc on sanpham.id_loai = danhmuc.id_loai where id_sanpham=? ;";
    public static final String SELECT_SP_ANME = "select  id_sanpham, ten_sp, gia, soluong, mausac, mota,sanpham.id_loai, danhmuc.ten_loai from sanpham inner join danhmuc on sanpham.id_loai = danhmuc.id_loai where ten_sp=? ;";

    @Override
    public List<Sanpham> finAll() {
        List<Sanpham> sanphamList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_SANPHAM);
                resultSet = statement.executeQuery();
                Sanpham sanpham = null;
                while (resultSet.next()) {
                    int id = resultSet.getInt("id_sanpham");
                    String ten_sp = resultSet.getString("ten_sp");
                    float gia = Float.parseFloat(resultSet.getString("gia"));
                    int soluong = resultSet.getInt("soluong");
                    String mausac = resultSet.getString("mausac");
                    String mota = resultSet.getString("mota");
                    String id_loai = resultSet.getString("id_loai");
                    String ten_loai = resultSet.getString("ten_loai");
                    sanpham = new Sanpham(id, ten_sp, gia, soluong, mausac, mota, new Loai(id_loai, ten_loai));
                    sanphamList.add(sanpham);
                    System.out.println("list sp " + sanphamList);
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
        return sanphamList;
    }

    @Override
    public void save(Sanpham sanpham) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_SANPHAM);
                statement.setString(1, sanpham.getTen_sanpham());
                statement.setFloat(2, sanpham.getGia());
                statement.setInt(3, sanpham.getSoluong());
                statement.setString(4, sanpham.getMausac());
                statement.setString(5, sanpham.getMota());
                statement.setString(6, sanpham.getId_loai().getId_loai());

                System.out.println("sp them :" + statement);
                statement.executeUpdate();
                System.out.println("san pham them:" + statement);
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

    }

    @Override
    public List<Sanpham> finByName(String name) {
        List<Sanpham> sanphamList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_SP_ANME);
                statement.setString(1, name);
                resultSet = statement.executeQuery();
                Sanpham sanpham = null;
                while (resultSet.next()) {
                    int id1 = resultSet.getInt("id_sanpham");
                    String ten_sp = resultSet.getString("ten_sp");
                    float gia = Float.parseFloat(resultSet.getString("gia"));
                    int soluong = resultSet.getInt("soluong");
                    String mausac = resultSet.getString("mausac");
                    String mota = resultSet.getString("mota");
                    String id_loai = resultSet.getString("id_loai");
                    String ten_loai = resultSet.getString("ten_loai");
                    sanpham = new Sanpham(id1, ten_sp, gia, soluong, mausac, mota, new Loai(id_loai, ten_loai));
                    sanphamList.add(sanpham);
                    System.out.println("list sp id " + sanpham);
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
        return sanphamList;
    }

    @Override
    public Sanpham update(int id, Sanpham sanpham) {

        System.out.println("id la: " + id);
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(UPDATE_SANPHAM);
                statement.setString(1, sanpham.getTen_sanpham());
                statement.setFloat(2, sanpham.getGia());
                statement.setInt(3, sanpham.getSoluong());
                statement.setString(4, sanpham.getMausac());
                statement.setString(5, sanpham.getMota());
                statement.setString(6, sanpham.getId_loai().getId_loai());
                statement.setInt(7,id);
                statement.executeUpdate();
                System.out.println("  statement.setInt(3, sanpham.getSoluong());" +  sanpham.getId_sanpham());
                System.out.println("san pham edit:" + statement);
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
        return sanpham;
    }

    @Override
    public void remove(int id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(DELETE_SANPHAM);
                statement.setInt(1, id);
                statement.executeUpdate();
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

    }

    @Override
    public Sanpham finById1(int id) {
        Sanpham sanpham = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_SP_ID);
                statement.setInt(1, id);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id1 = resultSet.getInt("id_sanpham");
                    String ten_sp = resultSet.getString("ten_sp");
                    float gia = Float.parseFloat(resultSet.getString("gia"));
                    int soluong = resultSet.getInt("soluong");
                    String mausac = resultSet.getString("mausac");
                    String mota = resultSet.getString("mota");
                    String id_loai = resultSet.getString("id_loai");
                    String ten_loai = resultSet.getString("ten_loai");
                    sanpham = new Sanpham(id1, ten_sp, gia, soluong, mausac, mota, new Loai(id_loai, ten_loai));
                    System.out.println("list sp id " + sanpham);
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
        return sanpham;
    }

}
