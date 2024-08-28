package lk.kavishka.restorisejakarthaeebackend.controller;

import jakarta.json.bind.JsonbBuilder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.json.bind.Jsonb;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.kavishka.restorisejakarthaeebackend.bo.BOFactory;
import lk.kavishka.restorisejakarthaeebackend.bo.custom.StaffBO;
import lk.kavishka.restorisejakarthaeebackend.dto.StaffDTO;


import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/staff")
public class StaffController extends HttpServlet {
    private Connection connection;
    StaffBO staffBO = (StaffBO) BOFactory.getBOFactory().BOTypes(BOFactory.BOTypes.STAFFS);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(var writer = resp.getWriter()){
            List<StaffDTO> staffDTOList = staffBO.getAllStaff(connection);
            if (staffDTOList != null){
                resp.setContentType("application/json");
                Jsonb jsonb = JsonbBuilder.create();
                jsonb.toJson(staffDTOList,resp.getWriter());
            }else {
                writer.write("Not Available");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!req.getContentType().toLowerCase().contains("application/json") || req.getContentType() == null){
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }

        Jsonb jsonb = JsonbBuilder.create();
        StaffDTO StaffDTO = jsonb.fromJson(req.getReader(), StaffDTO.class);

        try(var writer = resp.getWriter()){
            boolean isSaved = staffBO.saveStaff(StaffDTO,connection);
            if (isSaved){
                writer.write("successfully");
            }else {
                writer.write("Try Again");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StaffDTO StaffDTO = JsonbBuilder.create().fromJson(req.getReader(), StaffDTO.class);
        try(var writer = resp.getWriter()){
            boolean isUpdated = staffBO.updateStaff(StaffDTO,connection);
            if (isUpdated){
                writer.write("update successfully");
            }else {
                writer.write("Please Try Again.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StaffDTO StaffDTO = JsonbBuilder.create().fromJson(req.getReader(), StaffDTO.class);
        try(var writer = resp.getWriter()){
            var isDelete = staffBO.deleteStaff(StaffDTO.getStaffId(), connection);
            if (isDelete){
                writer.write("Delete Successfully");
            }else {
                writer.write("Please Try again!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {
        try{
            var ctx = new InitialContext();
            DataSource pool = (DataSource) ctx.lookup("java:comp/env/jdbc/restoRise");
            this.connection = pool.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
