
void printOwing( void )
{
    printBanner();

    double outStanding = getOutStanding();

    printDetails( outStanding );
}

doulbe getOutStanding( void )
{
    Enumeration e = _orders.elements();
    double      result = 0.0;

    while ( e.hasMoreElements() )
    {
        Order each = (Order)e.nextElement();
        result += each.getAmount();
    }

    return result;
}

void printDetails( double outStanding )
{
    // ���� ��
    System.out.println( "name: " + _name );
    System.out.println( "amount: " + outStanding );
}

void printBanner( void )
{
    // �� ��
    System.out.println( "********************" );
    System.out.println( "***** Customer *****" );
    System.out.println( "********************" );
}

