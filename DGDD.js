//Đánh giá giảng dạy

var byValue = document.querySelectorAll('[value="Rất hài lòng"]');
for(i= 0; i< byValue.length ; i++){
		document.getElementById(byValue[i].id).click();
	}

setTimeout(()=> document.getElementById("ctl00_ContentPlaceHolder1_ctl00_btnSave").click(), 2000);


//var getObject = document.querySelectorAll('[id$="_linkDanhGia"]');
//for(j= 0; j< getObject.length ; j++){

//	document.getElementById(getObject[i].id).click();

//	setTimeout(()=> document.getElementById("ctl00_ContentPlaceHolder1_ctl00_btnSave").click(), 2000);

//}

