/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fm;
import com.ibm.icu.d.in;
import com.ibm.icu.d.iu;

final class im
implements in {
    private boolean a;
    private int b;
    private static final String[] c = new String[]{"%traditional", "%simplified", "%accounting", "%time"};

    im() {
    }

    public void a(iu iu2, String string) {
    }

    public void a(StringBuffer stringBuffer, fm fm2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        String string = fm2.c();
        for (n6 = 0; n6 < c.length; ++n6) {
            if (!c[n6].equals(string)) continue;
            this.b = n6;
            this.a = n6 == 1 || n6 == 3;
            break;
        }
        if (this.a) {
            n6 = stringBuffer.indexOf("*");
            while (n6 != -1) {
                stringBuffer.delete(n6, n6 + 1);
                n6 = stringBuffer.indexOf("*", n6);
            }
            return;
        }
        String string2 = "\u9ede";
        String[][] arrarrstring = new String[][]{{"\u842c", "\u5104", "\u5146", "\u3007"}, {"\u4e07", "\u4ebf", "\u5146", "\u3007"}, {"\u842c", "\u5104", "\u5146", "\u96f6"}};
        String[] arrstring = arrarrstring[this.b];
        for (n5 = 0; n5 < arrstring.length - 1; ++n5) {
            n4 = stringBuffer.indexOf(arrstring[n5]);
            if (n4 == -1) continue;
            stringBuffer.insert(n4 + arrstring[n5].length(), '|');
        }
        int n7 = stringBuffer.indexOf("\u9ede");
        if (n7 == -1) {
            n7 = stringBuffer.length();
        }
        n5 = 0;
        n4 = -1;
        String string3 = arrarrstring[this.b][3];
        block14: while (n7 >= 0) {
            n3 = stringBuffer.lastIndexOf("|", n7);
            n2 = stringBuffer.lastIndexOf(string3, n7);
            int n8 = 0;
            if (n2 > n3) {
                n8 = n2 > 0 && stringBuffer.charAt(n2 - 1) != '*' ? 2 : 1;
            }
            n7 = n3 - 1;
            switch (n5 * 3 + n8) {
                case 0: {
                    n5 = n8;
                    n4 = -1;
                    continue block14;
                }
                case 1: {
                    n5 = n8;
                    n4 = n2;
                    continue block14;
                }
                case 2: {
                    n5 = n8;
                    n4 = -1;
                    continue block14;
                }
                case 3: {
                    n5 = n8;
                    n4 = -1;
                    continue block14;
                }
                case 4: {
                    stringBuffer.delete(n2 - 1, n2 + string3.length());
                    n5 = 0;
                    n4 = -1;
                    continue block14;
                }
                case 5: {
                    stringBuffer.delete(n4 - 1, n4 + string3.length());
                    n5 = n8;
                    n4 = -1;
                    continue block14;
                }
                case 6: {
                    n5 = n8;
                    n4 = -1;
                    continue block14;
                }
                case 7: {
                    stringBuffer.delete(n2 - 1, n2 + string3.length());
                    n5 = 0;
                    n4 = -1;
                    continue block14;
                }
                case 8: {
                    n5 = n8;
                    n4 = -1;
                    continue block14;
                }
            }
            throw new IllegalStateException();
        }
        n3 = stringBuffer.length();
        while (--n3 >= 0) {
            n2 = stringBuffer.charAt(n3);
            if (n2 != 42 && n2 != 124) continue;
            stringBuffer.delete(n3, n3 + 1);
        }
    }
}

