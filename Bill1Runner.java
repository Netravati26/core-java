class Bill1Runner{

public static void main(String[] args){
//className ref = new className();

Bill1 ref = new Bill1();

String billReferenceId = ref.billReferenceId ;
System.out.println(billReferenceId);

int billSequenceNo = ref.billSequenceNo;
System.out.println(billSequenceNo);

String billIssueDate = ref.billIssueDate;
System.out.println(billIssueDate);

String billDueDate = ref.billDueDate;
System.out.println(billDueDate);

boolean isBillPaid = ref.isBillPaid;
System.out.println(isBillPaid);

boolean isLatestBill = ref.isLatestBill;
System.out.println(isLatestBill);

boolean isFinalBill = ref.isFinalBill;
System.out.println(isFinalBill);

double billAmount = ref.billAmount;
System.out.println(billAmount);

boolean taxInclusiveBill = ref.taxInclusiveBill;
System.out.println(taxInclusiveBill);

}

}