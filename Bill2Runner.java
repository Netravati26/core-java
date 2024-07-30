class Bill2Runner{

public static void main(String [] args){

Bill2 ref = new Bill2();

String billReferenceid = ref.billreferenceId;
System.out.println(billReferenceid);

int billSequenceNo = ref.billSequenceNo;
System.out.println(billSequenceNo);

String billIssueDate = ref.billIssueDate;
System.out.println(billIssueDate);

String billDueDate = ref.billDueDate;
System.out.println(billDueDate);

boolean isBillPaid = ref.isBillPaid;
System.out.println(isBillPaid);

boolean isLatestDate = ref.isLatestDate;
System.out.println (isLatestDate);

boolean isFinalBill = ref.isFinalBill;
System.out.println(isFinalBill);

double billAmount = ref.billAmount;
System.out.println(billAmount);

boolean taxInclusiveBill = ref.taxInclusiveBill;
System.out.println(taxInclusiveBill);

}
}