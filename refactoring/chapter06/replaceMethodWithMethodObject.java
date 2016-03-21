
class Account
{
    int gamma( int inputVal, int quantity, int yearToDate )
    {
        return new Gamma( this, inputVal, quantity, yearToDate).compute();
    }
}

class gamma
{
    private final Account = _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    Gamma( Account source, int inputValArg, int quantityArg, int yearToDateArg )
    {
        _account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }

    int compute( void )
    {
        importantValue1 = (inputVal * quantity) + delta();
        importantValue2 = (inputVal * yearToDate) + 100;

        importantThing();

        importantValue3 = importantValue2 * 7;

        return importantValue3 - 2 * importantValue2;
    }

    void importantThing( void )
    {
        if ( ( yearToDate - importantValue1) > 100 )
        {
            importantValue2 -= 20;
        }
    }
}
