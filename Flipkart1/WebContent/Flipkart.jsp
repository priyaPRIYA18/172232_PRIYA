<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>flipkart</title>
  <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
  
  body {
  font-family: Arial;
  margin: 0;
}

* {
  box-sizing: border-box;
}

img {
  vertical-align: middle;
}

/* Position the image container (needed to position the left and right arrows) */
.container {
  position: relative;
}

/* Hide the images by default */
.mySlides {
  display: none;
}

/* Add a pointer when hovering over the thumbnail images */
.cursor {
  cursor: pointer;
}

/* Next & previous buttons */
.prev,
.next {
  cursor: pointer;
  position: absolute;
  top: 40%;
  width: auto;
  padding: 16px;
  margin-top: -50px;
  color: white;
  font-weight: bold;
  font-size: 20px;
  border-radius: 0 3px 3px 0;
  user-select: none;
  -webkit-user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover,
.next:hover {
  background-color: rgba(0, 0, 0, 0.8);
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* Container for image text */
.caption-container {
  text-align: center;
  background-color: #222;
  padding: 2px 16px;
  color: white;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Six columns side by side */
.column {
  float: left;
  width: 16.66%;
}

/* Add a transparency effect for thumnbail images */
.demo {
  opacity: 0.6;
}

.active,
.demo:hover {
  opacity: 1;
}
  
  
  
 input[type=text] {
  width: 500px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-image: url('searchicon.png');
  background-position: 10px 10px; 
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
  -webkit-transition: width 0.4s ease-in-out;
  transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
  width: 100%;
}

/* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: pink;
      padding: 25px;
    }
  </style>
</head>


  
<body>








  
<div class="jumbotron">
  <div class="container text-center">
    <h1>Flipkart</h1>      
    <font color='red'>Known For Quality,Vission & Values
    
 </font>
 <div class="O8ZS_U"><input name="search" text="Search for products, brands and  more" class="LM6RPg" type="text" placeholder="Search for products, brands and more" value="" autocomplete="off"></div>
  </div>
</div>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
                                
      </button>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Electronic</a></li>
        </ul>
        
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
       <li><a href="ModelList.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
      
    </div>
  
</nav>
      
     
      <br><br><br>
      <div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
       
        <div class="panel-body"><img src="https://images-eu.ssl-images-amazon.com/images/G/31/img17/AmazonPay/Ankit/bau/emifest/HDFC_Desktop_card_260x260._CB454885338_SY260_.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div> <a href="wash.html"><button type="button">Buy</button></a>
</div>      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        
        <div class="panel-body"><img src="https://images-eu.ssl-images-amazon.com/images/G/31/img17/AmazonPay/NocostEMI/DebitCards/PCCard/NCE_143_Desktop-Category-Card_260._CB485296061_SY260_.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div> <a href="electronic.html"><button type="button">Buy</button></a>
</div>     
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        
        <div class="panel-body"><img src="https://images-eu.ssl-images-amazon.com/images/G/31/img18/AmazonPay/Recharges/August/1134987_260x260._CB470673279_SY260_.jpg"style="width:100%" alt="Image"></div>
       <div> <a href="mobile.html"> <button type="button">Buy</button></a>
</div> 
    
      </div>
    </div>
 
</div>
        </div>
    
 

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
       
        <div class="panel-body"><img src="https://rukminim1.flixcart.com/image/400/400/jkmwdjk0/mobile/u/w/h/mi-redmi-y2-y2-original-imaf7xuvydcgrafd.jpeg?q=70" class="img-responsive" style="width:100%" alt="Image"></div>
          <div> <a href="Samsung.html"><button type="button">Buy</button></a>
     </div>
    </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        
        <div class="panel-body"><img src="https://rukminim1.flixcart.com/image/400/400/jog2nbk0/mobile/e/x/b/mi-redmi-e7t-na-original-imafazxdh2bd6hep.jpeg?q=70" class="img-responsive" style="width:100%" alt="Image"></div>
        <div> <a href="phone.html"><button type="button">Buy</button></a>
</div>     
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        
        <div class="panel-body"><img src="https://rukminim1.flixcart.com/image/400/400/jpvihzk0/mobile/x/b/g/honor-9n-lld-al20-original-imafcysuxztcr4gz.jpeg?q=70" alt="Image"></div>
       <div> <a href="honor.jsp"><button type="button">Buy</button></a>
</div> 
    
      </div>
    </div>
   
   
 <!-- <div class="col-sm-4"> 
      <div class="panel panel-success">
        
        <div class="panel-body"><img src="https://rukminim1.flixcart.com/image/400/400/jmkwya80/mobile/w/h/j/mi-redmi-6-na-original-imaf9gmdbuyhkwkw.jpeg?q=70"img-responsive" style="width:100%" alt="Image"></div>
       <div> <button type="button">Buy</button>
</div> 
    
      </div>
    </div>-->
 
</div><br>
 </div>









</body>
</html>