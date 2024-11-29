/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ITRequest;
import com.mycompany.itrequest.jdbc.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author default
 */
public class RequestRepository {
    public void addRequest(ITRequest request)throws SQLException{
        Connection con= JDBCUtil.getConnection();
        String query= "INSERT INTO ITRequest (ReqName, ReqDate, ReqEmail, ReqType, ReqDetail)\n"+"VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, request.getName());
            ps.setDate(2, request.getDate());
            ps.setString(3, request.getEmail());
            ps.setString(4, request.getType());
            ps.setString(5, request.getDetail());
            
            int effectRows= ps.executeUpdate();
            System.out.println("Affected: "+ effectRows);
            
            
        }catch(SQLException e){
            System.out.println("Loi roi ni oi: "+ e.getMessage());
            
        }catch(Exception ex){
            System.out.println("Loi roi ni oi: "+ ex.getMessage());
        }
        con.close();
        
    }
    
    public ITRequest findById(String id) throws SQLException{
        String query= "SELECT * FROM ITRequest WHERE ReqID = "+id;
        try{
            Connection con= JDBCUtil.getConnection();
            Statement statement = con.createStatement();
            ResultSet result= statement.executeQuery(query);
            
            
            ITRequest req= new ITRequest();
            
            while(result.next()){
            req.setId(result.getInt(1));
            req.setName(result.getString(2));
            req.setDate(result.getDate(3));
            req.setEmail(result.getString(4));
            req.setType(result.getString(5));
            req.setDetail(result.getString(6));
            return req;
        }
        }catch(SQLException e){
            System.out.println("loi khi tim id+ "+id);
        
        }
        return null;
    
    }
    public void deleteId(String id){
        String delete = "DELETE FROM ITRequest WHERE ReqID = ?";
        try{
            Connection con= JDBCUtil.getConnection();
            PreparedStatement st= con.prepareStatement(delete);
            st.setString(1, id);
            int rowEffect =st.executeUpdate();
            if(rowEffect>0){
                System.out.println("delect id "+id);
            }else{
                System.out.println("co loi xay ra");
            }
        }catch(SQLException e){
            System.out.println("Repository.RequestRepository.deleteId()");
        }
    }
}
