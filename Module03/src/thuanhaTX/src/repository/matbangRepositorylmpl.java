package repository;

import model.Matbang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class matbangRepositorylmpl implements matbangRepository {
    public static final String SELECT_MATBANG = "select * from matbang;";
    public static final String INSERT_MATBANG ="insert into matbang(id_matbang,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc) value (?,?,?,?,?,?,?,?);";
    public static final String SELECT_MATBANG_LOAI = "select * from matbang where loai =?;";
    public static final String SELECT_MATBANG_GIA = "select * from matbang where gia =?;";
    public static final String SELECT_MATBANG_TANG = "select * from matbang where tang=?;";
    public static final String SELECT_MATBANG_ID = "select * from matbang where id_matbang=?;";
    public static final String UPDATE_MATBANG ="update matbang set id_matbang=?,trangthai=?,dientich=?,tang=?,loai=?,gia=?,ngaybatdau=?,ngayketthuc=? where id_matbang=? ;";
    public static final String DELETE_MATBANG = "delete  from matbang where  id_matbang=?";
    @Override
    public List<Matbang> finAll(){
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next())
                {
                    String id_matbang =resultSet.getString("id_matbang");
                    String trangthai=resultSet.getString("trangthai");
                    Float dientich=resultSet.getFloat("dientich");
                    int tang=resultSet.getInt("tang");
                    String loai=resultSet.getString("loai");
                    Float gia=resultSet.getFloat("gia");
                    String ngaybatdau=resultSet.getString("ngaybatdau");
                    String ngayketthuc =resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc);
                    matbangList.add(matbang);
                    System.out.println("sql"  + statement);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
    }
        return matbangList;
    }

    @Override
    public void save(Matbang matbang) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(INSERT_MATBANG);

                statement.setString(1,matbang.getId_matbang());
                statement.setString(2,matbang.getTrangthai());
                statement.setFloat(3,matbang.getDientich());
                statement.setInt(4,matbang.getTang());
                statement.setString(5,matbang.getLoai());
                statement.setFloat(6,matbang.getGia());
                statement.setString(7,matbang.getNgaybatdau());
                statement.setString(8,matbang.getNgayketthuc());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
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
    public List<Matbang> finByLoai(String loai) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_LOAI);
                statement.setString(1,loai);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next())
                {
                    String id_matbang =resultSet.getString("id_matbang");
                    String trangthai=resultSet.getString("trangthai");
                    Float dientich=resultSet.getFloat("dientich");
                    int tang=resultSet.getInt("tang");
                    String loaimb =resultSet.getString("loai");
                    Float gia=resultSet.getFloat("gia");
                    String ngaybatdau=resultSet.getString("ngaybatdau");
                    String ngayketthuc =resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang,trangthai,dientich,tang,loaimb,gia,ngaybatdau,ngayketthuc);
                    matbangList.add(matbang);
                    System.out.println("sql"  + statement);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return matbangList;
    }

    @Override
    public List<Matbang> finByTang(String tang) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_TANG);
                statement.setString(1,tang);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next())
                {
                    String id_matbang =resultSet.getString("id_matbang");
                    String trangthai=resultSet.getString("trangthai");
                    Float dientich=resultSet.getFloat("dientich");
                    int tangmb=resultSet.getInt("tang");
                    String loai =resultSet.getString("loai");
                    Float gia=resultSet.getFloat("gia");
                    String ngaybatdau=resultSet.getString("ngaybatdau");
                    String ngayketthuc =resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang,trangthai,dientich,tangmb,loai,gia,ngaybatdau,ngayketthuc);
                    matbangList.add(matbang);
                    System.out.println("sql"  + statement);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return matbangList;
    }

    @Override
    public List<Matbang> finByGia(String gia) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_GIA);
                statement.setString(1,gia);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next())
                {
                    String id_matbang =resultSet.getString("id_matbang");
                    String trangthai=resultSet.getString("trangthai");
                    Float dientich=resultSet.getFloat("dientich");
                    int tang=resultSet.getInt("tang");
                    String loai =resultSet.getString("loai");
                    Float gia1=resultSet.getFloat("gia");
                    String ngaybatdau=resultSet.getString("ngaybatdau");
                    String ngayketthuc =resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang,trangthai,dientich,tang,loai,gia1,ngaybatdau,ngayketthuc);
                    matbangList.add(matbang);
                    System.out.println("sql"  + statement);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return matbangList;
    }

    @Override
    public Matbang update(String id, Matbang matbang) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(UPDATE_MATBANG);
                statement.setString(1, matbang.getId_matbang());
                statement.setString(2, matbang.getTrangthai());
                statement.setFloat(3, matbang.getDientich());
                statement.setInt(4, matbang.getTang());
                statement.setString(5, matbang.getLoai());
                statement.setFloat(6, matbang.getGia());
                statement.setString(7, matbang.getNgaybatdau());
                statement.setString(8, matbang.getNgayketthuc());
                statement.setString(9, matbang.getId_matbang());
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
        return matbang;
    }

    @Override
    public void remove(String id) {
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(DELETE_MATBANG);
                statement.setString(1,id);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }  finally {
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
    public Matbang finById(String id) {
        Matbang matbang = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_ID);
                statement.setString(1,id);
                resultSet = statement.executeQuery();

                while (resultSet.next())
                {
                    String id_matbang =resultSet.getString("id_matbang");
                    String trangthai=resultSet.getString("trangthai");
                    Float dientich=resultSet.getFloat("dientich");
                    int tang=resultSet.getInt("tang");
                    String loaimb =resultSet.getString("loai");
                    Float gia=resultSet.getFloat("gia");
                    String ngaybatdau=resultSet.getString("ngaybatdau");
                    String ngayketthuc =resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang,trangthai,dientich,tang,loaimb,gia,ngaybatdau,ngayketthuc);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return matbang;
    }
}
