package repository;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositorylmpl  implements UserRepository {
    public static final String SELECT_ALL_USERS ="select * from user ";
    public  static  final  String INSERT_USER = "insert into  user(name, email, country) value (?,?,?);";
    private static final String DELETE_USER = "delete from user where id = ?;" ;
    private static final String UPDATE_USER ="update user  set name = ?,email=?,country=? where id =?;";
    private static final String SELECT_USERS = "select  * from user where name =?";
    private static final String SELECT_USERS_ID = "select  * from user where id =?";

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        //b1 tạo đối tượng connection
        Connection connection= DBConnection.getConnection();
        //  getConnection() trả về đối tường Connection()
        //  tạo PreparedStatement để chưa câu lệnh SQL
        PreparedStatement statement = null;
//         tạo ResultSet để chưa list trả về
        ResultSet resultSet = null;
//       connection != null nghĩa là có kết nối được DB hay ko nếu có
        if(connection != null)
        {
            try{
//                tạo câu lệnh SQL
                statement = connection.prepareStatement(SELECT_ALL_USERS);
// nhận kết quả từ câu lênh sql (executeQuery()) chạy   cây lênh sql và trả về resultSet
                resultSet = statement.executeQuery();
                User user = null;
//                khi này Select * from nên sẽ có nhiều dòng resultSet có nhiều dòng
//                 => while lặp để in ra
//                 next () kiểm tra số dòng còn hay không
                while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    String name= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(id,name,email,country);
                    userList.add(user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return userList;
    }

    @Override
    public void save(User user) {
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(INSERT_USER);
                statement.setString(1,user.getName());
                statement.setString(2,user.getEmail());
                statement.setString(3,user.getCountry());
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
    //tìm kiêm theo Id
    public List<User> finById(String name) {
        List<User> userList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_USERS);
                statement.setString(1,name);
                resultSet = statement.executeQuery();
                User user = null;
              while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    String names= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(id,names,email,country);
                    userList.add(user);
                    System.out.println("user"+user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return userList;
    }
    public User  finById1(int id) {
        User user = null;
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_USERS_ID);
                statement.setInt(1, id);
                resultSet = statement.executeQuery();
                while (resultSet.next())
                {
                    String names= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(names,email,country);
                    System.out.println("user"+user);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return  user;
    }

    @Override
    public void addUserTransaction(User user, int[] permision) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmtAssignment = null;
        ResultSet rs = null;
        try{
            connection = DBConnection.getConnection();
            connection.setAutoCommit(false);
            pstmt=connection.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1,user.getName());
            pstmt.setString(2,user.getEmail());
            pstmt.setString(3,user.getCountry());

            int rowAddected = pstmt.executeUpdate();
            rs = pstmt.getGeneratedKeys();
            int userId = 0;




        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public User update(int id, User user) {

        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(UPDATE_USER);
                statement.setInt(4,id);
                statement.setString(1,user.getName());
                statement.setString(2,user.getEmail());
                statement.setString(3,user.getCountry());
                System.out.println("Id" +statement);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
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
        return user;
    }

    @Override
    public void remove(int id) {
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(DELETE_USER);
                statement.setInt(1,id);
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
}


