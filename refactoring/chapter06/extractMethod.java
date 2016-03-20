
void printOwing( void )
{
    Enumeration e = _orders.elements();
    double      outStanding = 0.0;

    // 배너 표시
    System.out.println( "********************" );
    System.out.println( "***** Customer *****" );
    System.out.println( "********************" );

    // outStanding 계산
    while ( e.hasMoreElements() ) 
    {
        Order each = (Order)e.nextElement();
        outStanding += each.getAmount();
    }

    // 상세 정보 표시
    System.out.println( "name: " + _name );
    System.out.println( "amount: " + outStanding );
}
