<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<style>
.button {
  background-color: #6F4E37;
  border: none;
  color: white;
  padding: 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 12px;
}

.button-container button {
            margin: 0 8px;
        }

body{
background-image: url('https://d12mivgeuoigbq.cloudfront.net/assets/blog/blog_appliances/friedmans-luxury-washer-dryers-header.jpeg');
background-repeat: no-repeat;
background-size: cover;

}

.background-blur {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: inherit;
            filter: blur(4px);
            z-index: -1; /* Ensure the blurred image is behind the content */
        }
</style>
</head>


<body style = "text-align:center">
<div class="background-blur"></div>
</br>
</br>
</br>
</br>
<h2>Select the time you want to book the washer/dryer</h2>
<span>
<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="1" class="button"> 1 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="2" class="button"> 2 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="3" class="button"> 3 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="4" class="button"> 4 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="5" class="button"> 5 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>
</span>
</br>
</br>
<span>
<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="6" class="button"> 6 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="7" class="button"> 7 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="8" class="button"> 8 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="9" class="button"> 9 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>

<form action="/submitform" method="post" style="display: inline;">
<button type="submit" name="time" value="10" class="button"> 10 </button>
<input type="radio" id="hiddenRadio" name="hiddenOption" value="hiddenValue" style="display:none;">
</form>
</span>
</body>
</html>