 let chieucao = prompt("Nhập vào chiều cao hình chữ nhật:");
let chieurong =  prompt("Nhập vào chiều rộng của hình chữ nhật :");
 document.write("Chiều cao là :" + chieucao);
 document.write("<br>");
 document.write("Chiều rộng là :" + chieurong);
 document.write("<br>");
  // sử dùng parseInt (tenbien) để chuyển kiểu chuỗi sang kiểu số nguyên
 let cao =parseInt(chieucao);
 let rong =parseInt(chieurong);
 let dientich = cao * rong;
 document.write("<br>");
 document.write("diện tích của hình chữ nhật là : " + dientich);