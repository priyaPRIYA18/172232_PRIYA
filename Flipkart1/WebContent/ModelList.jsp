<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
 
<body>
<p><font size="3" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model List
  </strong></font></p>
<a href="/ShoppingCart.jsp" mce_href="ShoppingCart.jsp">View Cart</a>
<p/>    
<table width="75%" border="1">
  <tr>
    <td><form name="modelDetail1" method="POST" action="servlet/CartController">
 <font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model:</strong>
        TF-Model1</font><input type="hidden" name="modelNo" value="TF-MODEL1">
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Description:</strong>
        Combo Pack </font><input type="hidden" name="description" value="Combo Pack"></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Quantity:<input type="text" size="2" value="1" name="quantity"></strong></font></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Price:</strong>
      Rs.80,000</font><input type="hidden" name="price" value="10"></p><input type="hidden" name="action" value="add"><input type="submit" name="addToCart" value="Add To Cart">
      </form></td>
    <td><form name="modelDetail2" method="POST" action="servlet/CartController"><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model</strong>:
      TF-Model2 </font><input type="hidden" name="modelNo" value="TF-MODEL2">
<font face="Verdana, Arial, Helvetica, sans-serif">
      <p><font size="2"><strong>Description</strong>:Samsung J7
        </font><input type="hidden" name="description" value="Samsung J7"></p>
      <p><font size="2"><strong>Quantity</strong>: <input type="text" size="2" value="1" name="quantity"></font></p>
      <p><font size="2"><strong>Price</strong>: Rs.20,000<input type="hidden" name="price" value="20"></font></p>
           <input type="hidden" name="action" value="add">
             <input type="submit" name="addToCart" value="Add To Cart">
      </font></form></td>
  </tr>
  <tr>
    <td><form name="modelDetail3" method="POST" action="servlet/CartController"><p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model:</strong>
        TF-Model3</font><input type="hidden" name="modelNo" value="TF-MODEL3"></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Description:</strong>
        Redmi Note4 </font><input type="hidden" name="description" value="Redmi."></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Quantity:</strong></font> <input type="text" size="2" value="1" name="quantity"></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Price:Rs.10,000</strong></font><input type="hidden" name="price" value="30"></p>        <input type="hidden" name="action" value="add">
        <input type="submit" name="addToCart" value="Add To Cart">
</form></td>
    <td><form name="modelDetail4" method="POST" action="servlet/CartController"><p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Model</strong>:
        TF-Model4</font><input type="hidden" name="modelNo" value="TF-MODEL4"></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Description</strong>:
       Samsung J8. </font><input type="hidden" name="description" value="Samsung j8."></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Quantity</strong>:</font> <input type="text" size="2" value="1" name="quantity"></p>
      <p><font size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong>Price</strong>: Rs.40,000</font><input type="hidden" name="price" value="40"></p>
   <input type="hidden" name="action" value="add"><input type="submit" name="addToCart" value="Add To Cart"></form></td>
  </tr>
</table>
<p> </p>
</body>
</html>
    