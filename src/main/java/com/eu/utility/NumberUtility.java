/*
    Copyright (C) 2015  Emre Ucuzoğlu

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.eu.utility;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberUtility {

    private static final String[] rakamlarArr = { "", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz" };

    private static final String[] onluklarArr = { "", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan" };

    public static String convertToWords(BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Sayı boş olamaz");
        }

        if (number.floatValue() == 0.0) {
            return "sifir";
        }

        final Integer OFFSET_TO_GO = 3;
        final Integer SUPPORTTED_LOOPS = 5;
        final String mask = "000000000000000.00";

        String numberString = number.toPlainString();
        DecimalFormat df = new DecimalFormat(mask);
        numberString = df.format(number);

        StringBuilder result = new StringBuilder();

        int offsetStart = 0;
        int offsetEnd = 3;

        for (int i = 0; i < SUPPORTTED_LOOPS; i++, offsetStart += OFFSET_TO_GO, offsetEnd += OFFSET_TO_GO) {
            int value = Integer.parseInt(numberString.substring(offsetStart, offsetEnd));

            if (value > 0) {
                String tmpString = convertThousandPart(value);

                if (!tmpString.equals("bir") || i != 3) {
                    result.append(tmpString);
                }

                switch (i) {
                case 0:
                    result.append(" trilyon ");
                    break;
                case 1:
                    result.append(" milyar ");
                    break;
                case 2:
                    result.append(" milyon ");
                    break;
                case 3:
                    result.append(" bin ");
                    break;
                case 4:
                    break;
                }
            }

        }
        return result.toString().replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ").trim();
    }

    // private

    private static String convertThousandPart(int number) {
        String result = "";

        if (number >= 100) {
            String tmpString = rakamlarArr[number / 100];
            result += tmpString.equals("bir") ? "" : tmpString;
            result += " yüz ";
            number %= 100;
        }

        if (number >= 10) {
            String tmpString = rakamlarArr[number / 10];
            result += tmpString.equals("bir") ? "" : tmpString;
            result += onluklarArr[number / 10];
            number %= 10;
        }

        if (number > 0) {
            result += rakamlarArr[number];
        }

        return result;
    }

    private NumberUtility() {
    }
}
