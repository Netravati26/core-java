class Bill3Runner{

public static void main(String[] args){

Bill3 ref = new Bill3();
String billReferenceId = ref. billReferenceId;
System.out.println( billReferenceId);

int BillSequenceNo = ref. BillSequenceNo;
System.out.println(BillSequenceNo);

String billIssueDate = ref. billIssueDate ;
System.out.println(billIssueDate );

String billDueDate = ref. billDueDate;
System.out.println(billDueDate );

boolean isBillPaid = ref.isBillPaid;
System.out.println(isBillPaid);

boolean isLatestDate = ref.isLatestDate;
System.out.println(isLatestDate);

boolean isFinalBill = ref.isFinalBill;
System.out.println(isFinalBill);

double billAmount = ref.billAmount;
System.out.println(billAmount);

boolean taxInclusiveBill = ref.taxInclusiveBill;
System.out.println(taxInclusiveBill);



}
}
