package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax = getAnualIncome();
        if (tax <= 20000) {
            tax -= getAnualIncome() * 0.15;
        } else{
            tax -= getAnualIncome() * 0.25;
        }
        if (healthExpenditures >= 0){
            return tax - (healthExpenditures * 0.5);
        } else {
            return tax;
        }
    }
}
