var xem = document.getElementById("ctl00_ContentPlaceHolder1_ctl00_btnOK");

function score(msv) {
	var InMsv = document.getElementById("ctl00_ContentPlaceHolder1_ctl00_txtMaSV");
	InMsv.value = msv;
  document.getElementById("ctl00_ContentPlaceHolder1_ctl00_btnOK").click(); 
}

function getPoint(){
	let val,result = {};
    var el = document.getElementsByClassName('row-diem');
	
    for (let x in el) {
		if(el?.[x]?.children?.[2]){
            val = el[x].children[2].textContent;
			switch (val) {
			  case 'Cấu trúc dữ liệu và giải thuật':
				result[val] = el[x].children[10].textContent;
				break;
			  case 'Xác suất thống kê':
				result[val] = el[x].children[10].textContent;
				break;
			  case 'Toán giải tích':
				result[val] = el[x].children[10].textContent;
				break;
			  case 'Phương pháp tính':
				result[val] = el[x].children[10].textContent;
				break;
			  case 'Toán rời rạc':
				result[val] = el[x].children[10].textContent;
				break;
			  case 'Trí tuệ nhân tạo':
				result[val] = el[x].children[10].textContent;
				break;			
			}
		}
	}
console.log(result);
}
getPoint();
