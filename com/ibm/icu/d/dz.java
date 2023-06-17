/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.du;
import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.iu;
import java.text.ParsePosition;

class dz
extends fn {
    private boolean a = false;
    private boolean b = true;

    dz(int n2, fm fm2, iu iu2, String string) {
        super(n2, fm2, iu2, string);
        if (string.equals(">>") || string.equals(">>>") || fm2 == this.e) {
            this.a = true;
            if (string.equals(">>>")) {
                this.b = false;
            }
        } else {
            this.e.a();
        }
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
        if (!this.a) {
            super.a(d2, stringBuffer, n2);
        } else {
            du du2 = new du();
            du2.a(d2, 20, true);
            boolean bl2 = false;
            while (du2.d > Math.max(0, du2.c)) {
                if (bl2 && this.b) {
                    stringBuffer.insert(n2 + this.d, ' ');
                } else {
                    bl2 = true;
                }
                this.e.a(du2.e[--du2.d] - 48, stringBuffer, n2 + this.d);
            }
            while (du2.c < 0) {
                if (bl2 && this.b) {
                    stringBuffer.insert(n2 + this.d, ' ');
                } else {
                    bl2 = true;
                }
                this.e.a(0L, stringBuffer, n2 + this.d);
                ++du2.c;
            }
        }
    }

    public long a(long l2) {
        return 0L;
    }

    public double a(double d2) {
        return d2 - Math.floor(d2);
    }

    public Number a(String string, ParsePosition parsePosition, double d2, double d3, boolean bl2) {
        if (!this.a) {
            return super.a(string, parsePosition, d2, 0.0, bl2);
        }
        String string2 = string;
        ParsePosition parsePosition2 = new ParsePosition(1);
        double d4 = 0.0;
        du du2 = new du();
        while (string2.length() > 0 && parsePosition2.getIndex() != 0) {
            Number number;
            parsePosition2.setIndex(0);
            int n2 = this.e.a(string2, parsePosition2, 10.0).intValue();
            if (bl2 && parsePosition2.getIndex() == 0 && (number = this.g.m().a(string2, parsePosition2)) != null) {
                n2 = number.intValue();
            }
            if (parsePosition2.getIndex() == 0) continue;
            du2.a(48 + n2);
            parsePosition.setIndex(parsePosition.getIndex() + parsePosition2.getIndex());
            string2 = string2.substring(parsePosition2.getIndex());
            while (string2.length() > 0 && string2.charAt(0) == ' ') {
                string2 = string2.substring(1);
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
        }
        d4 = du2.d == 0 ? 0.0 : du2.b();
        d4 = this.a(d4, d2);
        return new Double(d4);
    }

    public double a(double d2, double d3) {
        return d2 + d3;
    }

    public double b(double d2) {
        return 0.0;
    }

    char a() {
        return '>';
    }
}

