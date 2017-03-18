# Phong cách lập trình  
* **Good programming style**  
	  * Dễ đọc  
	  * Dễ hiểu  
* **#1. Đặt tên biến, phương thức một cách đầy đủ ý nghĩa**  
*vd:*   
**String** a1;   // bad  
**String** name; //Good  
* **#2. Indentation**  
<img src="http://i.imgur.com/PxCSML1.png">
* **#3. Whitespace**  
<img src="http://i.imgur.com/YDlJdGn.png">
* **#4. So chính trong if-else if-else**  
<img src="http://i.imgur.com/ZG8mKrD.png">
# Loop  
* **1. Vòng lặp while**  
*Cú pháp*:  
while (**condition**) {  
	**statements**  
}  
*ví dụ*:  
**int** i =0;  
while( i < 3) {  
	  System.out.println("a" + i );  
	  i = i+1;  
}   
* **2.Vòng lặp for**  
*Cú pháp*:
for(initialization; condition; update){  
 **statements**  
}  
*ví dụ*:  
for( int i=0; i < 3; i++){  
System.out.println("a "+i );  
}  
* **3. Break và Continue**
<img src ="http://i.imgur.com/nLf5KQ7.png">  
# Mảng  
* Danh sách các giá trị được đánh chỉ số  
* Có thể tạo mảng các String, int, double ...  
* Mỗi phần tử trong mảng phải cùng kiểu dữ liệu
* Hình ảnh của mảng:  
<img src="http://i.imgur.com/cBWkgek.png">  
* Mảng được đánh chỉ số (index) từ **0** đến **n-1**  
* Truy cập đến phần tử của mảng:   
*dùng cập dấu* **[]**
*values*[**index**]