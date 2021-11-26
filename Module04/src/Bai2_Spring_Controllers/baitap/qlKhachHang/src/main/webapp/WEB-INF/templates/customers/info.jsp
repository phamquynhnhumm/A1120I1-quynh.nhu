<%@ page import="grandemonstration.service.CustomerService" %>
<%@ page import="grandemonstration.service.CustomerServiceFactory" %>
<%@ page import="grandemonstration.model.Customer" %>
<%@ page import="org.springframework.http.converter.json.GsonBuilderUtils" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--<%!--%>
<%--    private CustomerService customerService = CustomerServiceFactory.getInstance();--%>
<%--%>--%>
<%--<%--%>
<%--    long id = Long.valueOf(request.getParameter("id"));--%>
<%--    System.out.println("id la" + id);--%>
<%--    Customer customer = customerService.findOne(id);--%>
<%--%>--%>

<form action="/customers" method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <input type="hidden" name="id" value=" ${customer.getId()}">
        <table>
            <tr>
                <td>Id</td>
                <td>
                    ${customer.getId()}
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td>
                    <input type="text" name="name" value="${customer.getName()}">
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <input type="text" name="email" value="${customer.getEmail()}">
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    <input type="text" name="address" value="${customer.getAddress()}">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
<a href="/customers">Back to list</a>.