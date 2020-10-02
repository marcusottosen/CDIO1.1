public class diceTest {
    public static void main(String[] args) {

        int totalCount, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _2ensCount;

        _2 = 0;
        _3 = 0;
        _4 = 0;
        _5 = 0;
        _6 = 0;
        _7 = 0;
        _8 = 0;
        _9 = 0;
        _10 = 0;
        _11 = 0;
        _12 = 0;

        _2ensCount = 0;

        totalCount = 0;


        dice d1 = new dice();
        dice d2 = new dice();

        while (totalCount < 10000) {
            d1.roll();
            d2.roll();
            switch (d1.getFaceValue()+d2.getFaceValue()) {
                case 2:
                    _2++;
                    totalCount++;
                    break;
                case 3:
                    _3++;
                    totalCount++;
                    break;
                case 4:
                    _4++;
                    totalCount++;
                    break;
                case 5:
                    _5++;
                    totalCount++;
                    break;
                case 6:
                    _6++;
                    totalCount++;
                    break;
                case 7:
                    _7++;
                    totalCount++;
                    break;
                case 8:
                    _8++;
                    totalCount++;
                    break;
                case 9:
                    _9++;
                    totalCount++;
                    break;
                case 10:
                    _10++;
                    totalCount++;
                    break;
                case 11:
                    _11++;
                    totalCount++;
                    break;
                case 12:
                    _12++;
                    totalCount++;
                    break;
            }
            if (d1.getFaceValue() == d2.getFaceValue()) {
                _2ensCount++;
            }
        }
        System.out.println(_2);
        System.out.println(_3);
        System.out.println(_4);
        System.out.println(_5);
        System.out.println(_6);
        System.out.println(_7);
        System.out.println(_8);
        System.out.println(_9);
        System.out.println(_10);
        System.out.println(_11);
        System.out.println(_12);
        System.out.println(_2ensCount);

    }
}
