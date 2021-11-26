<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/23/2021
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .hover-bt
    {
        background: #38404d ;
        color: white;

    }
    .hover-bt a:hover
    {
        background: white;
        color: black;
    }
</style>
<nav class="navbar navbar-expand-lg navbar-light" style="background:#38404d ">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon">🏠</span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="nav nav-tabs mr-auto ">
            <li class="nav-item hover-bt">
                <a class="nav-link hover-bt"  href="/" >Logout</a>
            </li>
            <li class="nav-item hover-bt">
                <a class="nav-link hover-bt"  href="/nhanvien">Nhân Viên</a>
            </li>
            <li class="nav-item hover-bt">
                <a class="nav-link hover-bt"  href="/khachhang">Khách Hàng</a>
            </li>
            <li class="nav-item hover-bt">
                <a class="nav-link  hover-bt"  href="/dichvu">Dịch vụ</a>
            </li>
            <li class="nav-item  hover-bt">
                <a class="nav-link hover-bt"  href="/hopdong">Hợp đồng</a>
            </li>
        </ul>
        <ul class="navbar-nav mr-right">
            <li class="nav-item">
                <form method="post" action="${timkiem}?action=search">
                       <input type="search" name="name" placeholder="tìm kiếm?" aria-describedby="button-addon4" class="form-control border-0" value="${value_key}">
                </form>
            </li>
        </ul>
    </div>
</nav>

