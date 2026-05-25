# Phân tích cấp độ log cho Flash Sale

- **Thành công (áp dụng mã giảm giá hợp lệ)**  
  → **INFO**: Đây là thông tin bình thường, cần ghi nhận nhưng không phải lỗi.

- **Người dùng nhập sai mã hoặc mã hết hạn**  
  → **WARN**: Đây là lỗi nghiệp vụ, không ảnh hưởng hệ thống, chỉ cảnh báo để theo dõi.

- **Lỗi hệ thống (logic chết, mất kết nối DB, exception nghiêm trọng)**  
  → **ERROR**: Đây là lỗi cần sửa gấp, phải được log ở mức cao nhất để dễ lọc và cảnh báo.
