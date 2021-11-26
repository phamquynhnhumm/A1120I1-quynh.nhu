<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/10/2021
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tìm kiếm sản phẩm</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <style>
        .message
        {color: green}
    </style>
</head>
<body>
<h3>Nhập vào tên sp bạn muốn tìm kiếm</h3>
<form method="post">
    <input type="text" name="ten" id="ten" placeholder="tên sản phẩm">
    <input type="submit" value="tìm kiếm" name="submit">
</form>
<h3>Danh sách sản phẩm :</h3>
<p>
    <c:if test="${massege !=null}">
        <span class="message">${massege}</span>
    </c:if>
</p>
<form>
    <fieldset>
        <legend>Chi tiết </legend>
        <label>Tên:</label>
        <p>${sanpham.getTen()}</p>
        <br/>
        <label>Giá:</label>
        <p>${sanpham.getGia()}</p>
        <br/>
        <label>Mô tả:</label>
        <p>${sanpham.getMota()}</p>
        <br/>
        <label>Nhà sản xuất:</label>
        <p>${sanpham.getNhaxb()}</p>
        <br/>
    </fieldset>
</form>
<%--<form>--%>
<%--    <label>Tên:</label>--%>
<%--    <p>${sanphan.getTen()}</p>--%>
<%--    <br/>--%>
<%--    <label>Giá:</label>--%>
<%--    <p>${sanphan.getGia()}</p>--%>
<%--    <br/>--%>
<%--    <label>Mô Tả:</label>--%>
<%--    <p>${sanphan.getMota()}</p>--%>
<%--    <br/>--%>
<%--    <label>Nhà Sản Xuất:</label>--%>
<%--    <p>${sanphan.getNhaxb()}</p>--%>
<%--    <br/>--%>
<%--</form>--%>
<p>
    <a href="/sanpham">quay lại  danh sách sản phẩm</a>
</p>


<%--<table border="1">--%>
<%--    <tr>--%>
<%--        <th>Tên</th>--%>
<%--        <th>Giá</th>--%>
<%--        <th>Mô tả</th>--%>
<%--        <th>Nhà sản xuất</th>--%>
<%--        <th>Edit</th>--%>
<%--        <th>Delete</th>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${sanpham}" var="sanpham">--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <a href="/sanpham?action=view&id=${sanpham.getId()}">${sanpham.getTen()}</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                    ${sanpham.getGia()}--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                    ${sanpham.getMota()}--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                    ${sanpham.getNhaxb()}--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/sanpham?action=edit&id=${sanpham.getId()}">Edit</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="/sanpham?action=delete&id=${sanpham.getId()}">delete</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

</body>
</html>
