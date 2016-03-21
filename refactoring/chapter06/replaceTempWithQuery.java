
double getPrice( void )
{
    return basePrice() * discountFactor();
}

private int basePrice( void )
{
    return _quantity * _itemPrice;
}

private double discountFactor( void )
{
    double  discountFactor;

    if ( basePrice() > 1000 )
        discountFactor = 0.95;
    else
        discountFactor = 0.98;

    return discountFactor;
}
