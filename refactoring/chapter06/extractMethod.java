
void printOwing( void )
{
    Enumeration e = _orders.elements();
    double      outStanding = 0.0;

    // ��� ǥ��
    System.out.println( "********************" );
    System.out.println( "***** Customer *****" );
    System.out.println( "********************" );

    // outStanding ���
    while ( e.hasMoreElements() ) 
    {
        Order each = (Order)e.nextElement();
        outStanding += each.getAmount();
    }

    // �� ���� ǥ��
    System.out.println( "name: " + _name );
    System.out.println( "amount: " + outStanding );
}
