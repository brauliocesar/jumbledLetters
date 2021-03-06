package br.com.cesar.challenge;

/**
 * Class to verify jumbled letters string
 */
public class JumbledLetters {


    private static final int STR_MIN_LEN = 3;

    /**
     * Verify Jumbled Letters In Strings
     *
     * @param strOne
     * @param strTwo
     * @return
     */
    public boolean verify(final String strOne, final String strTwo) throws Exception {
        if (null == strOne || null == strTwo ) {
            throw new Exception("Error: String One and Two cannot be null!");
        }

        int iStrOneLength = strOne.length();
        int iStrTwoLength = strTwo.length();

        if (iStrOneLength < STR_MIN_LEN
                || iStrTwoLength < STR_MIN_LEN) {
            throw new Exception("Error: String One and Two has more than 3 letters!");
        }

        boolean bResult = false;
        char[] szStringOne = strOne.toLowerCase().toCharArray();
        char[] szStringTwo = strTwo.toLowerCase().toCharArray();

        // Verify when strings with 3 letters only
        if (STR_MIN_LEN == iStrOneLength
                && STR_MIN_LEN == iStrTwoLength) {
            bResult = szStringOne[0] == szStringTwo[0]
                    && szStringOne[1] == szStringTwo[2];
        } else {
            bResult = szStringOne[0] == szStringTwo[0]
                    && szStringOne[iStrOneLength - 1] == szStringTwo[iStrTwoLength - 1]
                    && verifyShuffledLetters(szStringOne, iStrOneLength, szStringTwo, iStrTwoLength)
                    && szStringOne.length == szStringTwo.length;

        }

        return bResult;
    }

    private boolean verifyShuffledLetters(final char[] strShuffledOne, int iStrOneLength,
                                          final char[] strShuffledTwo, int iStrTwoLength) {
        int iCount = 0;
        boolean bResult = true;
        for (int iIndexArray = 1; iIndexArray < iStrOneLength - 2;) {
            if ((strShuffledOne.length > iIndexArray
                    && strShuffledTwo.length > iIndexArray
                    && (strShuffledOne[iIndexArray] == strShuffledTwo[iIndexArray]
                    || strShuffledOne[iIndexArray] == strShuffledTwo[iIndexArray + 1]
                    || strShuffledOne[iIndexArray] == strShuffledTwo[iIndexArray + 2]))) {
                iCount = 0;
                if (strShuffledOne[iIndexArray] == strShuffledTwo[iIndexArray]) {
                    iIndexArray++;
                    continue;
                }
                if (strShuffledOne[iIndexArray] == strShuffledTwo[iIndexArray + 1]
                    && strShuffledOne[iIndexArray + 1] == strShuffledTwo[iIndexArray]){
                    iIndexArray += 2;
                    continue;
                }
                if (strShuffledOne[iIndexArray] == strShuffledTwo[iIndexArray + 2]
                    && strShuffledOne[iIndexArray + 2] == strShuffledTwo[iIndexArray]) {
                    iIndexArray += 3;
                    continue;
                }
            }
            iIndexArray++;
            iCount++;
            if (iCount == 2){
                bResult = false;
                break;
            }
        }
        return bResult;
    }
}
