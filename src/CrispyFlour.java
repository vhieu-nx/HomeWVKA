import java.time.LocalDate;


public class CrispyFlour extends Material implements Discount {
    public int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//    LocalDate localDate = LocalDate.of(1,2,7);

    @Override
    double getAmount() {
        return quantity * cost ;
    }

    @Override
    LocalDate  getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate localDate = LocalDate.now();
        if (localDate.isBefore(getExpiryDate()) && localDate.isAfter(getExpiryDate().plusMonths(4))){
            return getAmount() * 0.2;
        }else if (localDate.isBefore(getExpiryDate()) && localDate.isAfter(getExpiryDate().plusMonths(2))){
            return  getAmount() * 0.4;
        }else {
            System.out.println("ố ồ ô ố ồ");
        }
        return 0;
    }
//Tạo mới 5 đối tượng bột, 5 đối tượng thịt
//Nếu là thịt thì triển khai chiết khấu 10%, nếu ngày hết hạn >= (ngày hôm nay +5) thì giảm 30%,
// nếu nếu ngày hết hạn >= (ngày hôm nay +3) giảm 50%
//Nếu là bột triển khai chiết khấu 5%, nếu ngày hết hạn >= (ngày hôm nay +4 tháng) thì giảm 20%,
// nếu nếu ngày hết hạn >= (ngày hôm nay +2 tháng) giảm 40%
//Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay

}
