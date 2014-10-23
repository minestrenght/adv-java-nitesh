<%@page import="java.sql.*" %>
<%
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minestrenght", "root", "root");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from customers");
        int row = 4;
        if (rs.relative(row)) {
            out.print("Record at row: " + row);
            out.print("<br/>First name: " + rs.getString("fname"));
            out.print(", Last name: " + rs.getString("lname"));
        } else {
            out.print("No records at row " + row + "!");
        }
        rs.close();
        st.close();
        con.close();
    } catch (ClassNotFoundException e) {
        out.print("Failed to load driver ...");
    } catch (SQLException e) {
        out.print("Server error ...");
    }
%>