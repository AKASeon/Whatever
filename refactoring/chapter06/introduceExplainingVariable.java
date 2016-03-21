
double price( void )
{
    // price = (base price) - (quantity discount) + (shipping)
    
    return basePrice() -
           quantityDiscount() +
           shipping();
}

private double basePrice( void )
{
    return _quantity * _itemPrice;
}

private double quantityDiscount( void )
{
    return Math.max( 0, _quantity - 500 ) * _itemPrice * 0.05;
}
private double shipping( void )
{
    return Math.min( basePrice() * 0.1, 100.0 );
}
