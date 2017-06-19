Waves.displayEffect();
var nihaokai = 1;
function nihao(){
	if(nihaokai == 1){
		$("#cang").slideDown("slow");
		$(".sanjiao").html("▲");
		nihaokai = 2;
	}else{
		$("#cang").slideUp("slow");
		$(".sanjiao").html("▼");
		 nihaokai = 1;
	}
}
var guankai1 = 1;
function guan1(){
	if(guankai1 == 1){
		$("#cang2").slideDown("slow");
		$("#jiahao1").html("-");
		guankai1 = 2;
	}else{
		$("#cang2").slideUp("slow");
		$("#jiahao1").html("+");
		guankai1 = 1;
	}
}
var guankai2 = 1;
function guan2(){
	if(guankai2 == 1){
		$("#cang3").slideDown("slow");
		$("#jiahao2").html("-");
		guankai2 = 2;
	}else{
		$("#cang3").slideUp("slow");
		$("#jiahao2").html("+");
		 guankai2 = 1;
	}
}
var guankai3 = 1;
function guan3(){
	if(guankai3 == 1){
		$("#cang4").slideDown("slow");
		$("#jiahao3").html("-");
		guankai3 = 2;
	}else{
		$("#cang4").slideUp("slow");
		$("#jiahao3").html("+");
		 guankai3 = 1;
	}
}
var guankai4 = 1;
function guan4(){
	if(guankai4 == 1){
		$("#cang5").slideDown("slow");
		$("#jiahao4").html("-");
		guankai4 = 2;
	}else{
		$("#cang5").slideUp("slow");
		$("#jiahao4").html("+");
		guankai4 = 1;
	}
}
var neirong = "";
var i = 0;
function chuangjian(b){
	neirong = b.innerText;
	chuangjian1();
}
var shuzu = new Array;
function chuangjian1(){
	var difang = $('.zzz:last');
	var jiayi = "<div class=\"zzz waves-effect waves-light waves-ripple\" onclick =\"dianle(this)\"  style=\"border-bottom: yellow solid 2px;\">"+neirong+"</div>";
	shuzu[i] = neirong;
	var kaiguan = 1;
	if(i != 0){
		for(var j = 0;j<i;j++){
			if(shuzu[i] == shuzu[j]){
				kaiguan = 2;
			}
		}
	}
	if(kaiguan == 1){
		bian();
		qingkong();
		difang.after(jiayi);
		panduan();
		i++;
	}else{
		bian();
		qingkong();
		var chi = document.getElementsByClassName("zzz");
		for(var z=1;z<=i;z++){
			var xiaonei = chi[z].innerHTML;
			if(neirong == xiaonei){
				chi[z].style.borderBottom = "yellow solid 2px";
				panduan();
			}
		}
	}
}
var yige = "";
function dianle(a){
	bian();
	qingkong();
	yige = $(a);
	$(a).css({"border-bottom": "yellow solid 2px"});
	if(a.innerText == "首页"){
		dianshou();
	}
	if(a.innerText == "系统管理"){
		dianxi();
	}
	if(a.innerText == "日志记录"){
		dianri();
	}
}
function bian(){
	$("#nav > div").css({"border-bottom": "none"});
}
var menu = new BootstrapMenu('.zzz', {
	fetchElementData: function(abcd) {
		dianle(abcd);
		return abcd;
	},
  	actions: [{
    	name: '关闭',
     	onClick: function(abcd) {
     		if($(abcd).html() != "首页"){
     			for(var ji=0;ji<=i;ji++){
		       		if(shuzu[ji] == $(abcd).html()){
		       			shuzu[ji] = "";
		       			$(abcd).html("");
     	  				$(abcd).remove();
		       		}
     			}
     		}
     		dianshou();
      	}
    }, {
      name: '刷新',
      onClick: function() {
       alert("刷新");
      }
    }, {
      name: '关闭右侧所有',
      onClick: function() {
       alert("关闭右侧所有");
      }
    },{
      name: '关闭左侧所有',
      onClick: function() {
        alert("关闭左侧所有");
      }
  }]
});
function dianshou(){
	bian();
	$("#bubian").css({"border-bottom": "yellow solid 2px"});
	qingkong();
	$("#shoucha").css({ "display":"block" });
}
function dianxi(){
	bian();
	yige.css({"border-bottom": "yellow solid 2px"});
	qingkong();
	$("#guancha").css({ "display":"block" });
}
function dianri(){
	bian();
	yige.css({"border-bottom": "yellow solid 2px"});
	qingkong();
	$("#richa").css({ "display":"block" });
}
function qingkong(){
	$(".banner>iframe").css({ "display":"none" });
}
function panduan(){
	if(neirong == "系统管理"){
		qingkong();
		$("#guancha").css({ "display":"block" });
	}
	if(neirong == "日志记录"){
		qingkong();
		$("#richa").css({ "display":"block" });
	}
	if(neirong == "用户管理"){
		qingkong();
		$("#yongcha").css({ "display":"block" });
	}
}
