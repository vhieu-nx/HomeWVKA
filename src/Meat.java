import java.time.LocalDate;

public class  Meat  extends Material implements Discount{
    double weight;

    public Meat(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    double getAmount() {
        return cost * weight;
    }

    @Override
    LocalDate getExpiryDate() {
        LocalDate localDate = LocalDate.now();
        LocalDate tomorrow = localDate.plusDays(7);
        return  tomorrow;
//        return manufacturingDate ;
    }

    @Override
    public double getRealMoney() {
        LocalDate localDate = LocalDate.now();
        if (localDate.isBefore(getExpiryDate()) && localDate.isAfter(getExpiryDate().plusMonths(5))){
            return getAmount() * 0.3;
        }else if (localDate.isBefore(getExpiryDate()) && localDate.isAfter(getExpiryDate().plusDays(3))){
            return  getAmount() * 0.5;
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
