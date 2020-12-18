window.onload=function(){
	var dl=document.getElementsByTagName('span')[0];
	var usename=document.getElementById('usename');
	var password=document.getElementById('password');
	dl.onclick=function(){
		if((!usename.value)||(!password.value)){
			alert('用户名或密码不能为空！');
			return false;
		}else{
			return true;
		}
	}
}