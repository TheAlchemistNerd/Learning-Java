float val = 0.1f;
System.out.println(val);
import java.text.NumberFormat;
NumberFormat nf = NumberFormat.getNumberInstance();
nf.setMinimumFractionDigits(10);
System.out.println(nf.format(val));
BigDecimal value = new BigDecimal("0.01");
BigDecimal subTotal, taxRate, tax, total;
BigDecimal subTotal, taxRate, tax, total;
subTotal = new BigDecimal("32.50");
taxRate = new BigDecimal("0.05");
tax = subTotal.multiply(taxRate);
total = subTotal.add(tax);
BigDecimal a = new BigDecimal("23.5");
BigDecimal b = new BigDecimal("7.0");
BigDecimal c;
c = a.divideToIntegralValue(b);
c = a.remainder(b);
BigDecimal subTotal, taxRate, salesTax, InvoiceTotal;
subTotal = new BigDecimal("32.55");
taxRate = new BigDecimal("0.05");
salesTax = subTotal.multiply(taxRate);
salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
InvoiceTotal = subTotal.add(salesTax);
static BigDecimal round(BigDecimal d)
{
return d.setScale(2, RoundingMode.HALF_UP);
}
salesTax = round(salesTax);
BigDecimal one1 = new BigDecimal("1.0");
BigDecimal one2 = new BigDecimal("1.00");
if (one1.equals(one2))
	System.out.println("Scale doesn't matter with equals");