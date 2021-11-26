package repository;

import model.Matbang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class matbangRepositorylmpl implements matbangRepository {
    public static final String SELECT_MATBANG = "select * from matbang order by dientich ASC;"; // giảm dần DESC, ASC tăng dần
    public static final String INSERT_MATBANG = "insert into matbang(id_matbang,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc) value (?,?,?,?,?,?,?,?);";
    public static final String SELECT_MATBANG_LOAI = "select * from matbang where loai =?;";
    public static final String SELECT_MATBANG_GIA = "select * from matbang where gia =?;";
    public static final String SELECT_MATBANG_TANG = "select * from matbang where tang=?;";
    public static final String SELECT_MATBANG_ID = "select * from matbang where id_matbang=?;";
    public static final String UPDATE_MATBANG = "update matbang set id_matbang=?,trangthai=?,dientich=?,tang=?,loai=?,gia=?,ngaybatdau=?,ngayketthuc=? where id_matbang=? ;";
    public static final String DELETE_MATBANG = "delete  from matbang where  id_matbang=?;";
    public static final String SELECT_MATBANG_LOAI_GIA = "select * from matbang where loai =? and gia=?;";
    public static final String SELECT_MATBANG_LOAI_TANG = "select * from matbang where loai =? and tang=?;";
    public static final String SELECT_MATBANG_GIA_TANG = "select * from matbang where gia=? and tang=?;";
    public static final String SELECT_MATBANG_LOAI_GIA_TANG = "select * from matbang where loai=? and gia =? and tang =?;";

    @Override
    public List<Matbang> finAll() {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang = resultSet.getInt("tang");
                    String loai = resultSet.getString("loai");
                    Float gia = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang, loai, gia, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
        return matbangList;
    }

    @Override
    public void save(Matbang matbang) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_MATBANG);
                statement.setString(1, matbang.getId_matbang());
                statement.setString(2, matbang.getTrangthai());
                statement.setFloat(3, matbang.getDientich());
                statement.setInt(4, matbang.getTang());
                statement.setString(5, matbang.getLoai());
                statement.setFloat(6, matbang.getGia());
                statement.setString(7, matbang.getNgaybatdau());
                statement.setString(8, matbang.getNgayketthuc());
                System.out.println("them mới" + statement);
                statement.executeUpdate();
                System.out.println("them mới" + statement);
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
    public List<Matbang> finByLoai(String loai) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_LOAI);
                statement.setString(1, loai);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang = resultSet.getInt("tang");
                    String loaimb = resultSet.getString("loai");
                    Float gia = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang, loaimb, gia, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
        return matbangList;
    }

    @Override
    public List<Matbang> finByTang(int tang) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_TANG);
                statement.setInt(1, tang);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tangmb = resultSet.getInt("tang");
                    String loai = resultSet.getString("loai");
                    Float gia = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tangmb, loai, gia, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
                    System.out.println("sql1" + matbang);
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
        return matbangList;
    }

    @Override
    public List<Matbang> finByGia(float gia) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_GIA);
                statement.setFloat(1, gia);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang = resultSet.getInt("tang");
                    String loai = resultSet.getString("loai");
                    Float gia1 = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang, loai, gia1, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
                System.out.println("sql1 :" + statement);
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
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(DELETE_MATBANG);
                statement.setString(1, id);
                System.out.println("DAa xoa " + id);
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
    public Matbang finById(String id) {
        Matbang matbang = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_ID);
                statement.setString(1, id);
                resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang = resultSet.getInt("tang");
                    String loaimb = resultSet.getString("loai");
                    Float gia = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang, loaimb, gia, ngaybatdau, ngayketthuc);
                    System.out.println("finNti ad:" + id);
                    System.out.println("ngay bat dau " + ngaybatdau + ngayketthuc);
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
        return matbang;
    }

    @Override
    public boolean finByIdTrung(String id)
    {
        String tess = "co";
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_ID);
                statement.setString(1, id);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    tess = "khong";
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
        System.out.println(tess);
        if (tess.equals("co")) {
            return true;
        }
        else
            return false;
    }

    @Override
    public List<Matbang> finByLoai_Gia(String loai, float gia) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_LOAI_GIA);
                statement.setString(1, loai);
                statement.setFloat(2, gia);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang = resultSet.getInt("tang");
                    String loai1 = resultSet.getString("loai");
                    Float gia1 = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang, loai1, gia1, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
        return matbangList;
    }

    @Override
    public List<Matbang> finByLoai_Tang(String loai, int tang) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_LOAI_TANG);
                statement.setString(1, loai);
                statement.setInt(2,tang);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang1 = resultSet.getInt("tang");
                    String loai1 = resultSet.getString("loai");
                    Float gia1 = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang1, loai1, gia1, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
        return matbangList;
    }

    @Override
    public List<Matbang> finByGia_Tang(float gia, int tang) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_GIA_TANG);
                statement.setFloat(1, gia);
                statement.setInt(2,tang);

                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang1 = resultSet.getInt("tang");
                    String loai = resultSet.getString("loai");
                    Float gia1 = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang1, loai, gia1, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
        return matbangList;
    }

    @Override
    public List<Matbang> finByLoai_Gia_Tang(String loai, float gia, int tang) {
        List<Matbang> matbangList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(SELECT_MATBANG_LOAI_GIA_TANG);
                statement.setString(1,loai);
                statement.setFloat(2, gia);
                statement.setInt(3,tang);
                resultSet = statement.executeQuery();
                Matbang matbang = null;
                while (resultSet.next()) {
                    String id_matbang = resultSet.getString("id_matbang");
                    String trangthai = resultSet.getString("trangthai");
                    Float dientich = resultSet.getFloat("dientich");
                    int tang1 = resultSet.getInt("tang");
                    String loai1 = resultSet.getString("loai");
                    Float gia1 = resultSet.getFloat("gia");
                    String ngaybatdau = resultSet.getString("ngaybatdau");
                    String ngayketthuc = resultSet.getString("ngayketthuc");
                    matbang = new Matbang(id_matbang, trangthai, dientich, tang1, loai1, gia1, ngaybatdau, ngayketthuc);
                    matbangList.add(matbang);
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
        return matbangList;
    }

}
