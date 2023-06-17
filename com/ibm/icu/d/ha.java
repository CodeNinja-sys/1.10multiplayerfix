/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fm;
import com.ibm.icu.d.fn;
import com.ibm.icu.d.iu;
import java.text.ParsePosition;

class ha
extends fn {
    double a;
    boolean b;

    ha(int n2, double d2, fm fm2, iu iu2, String string) {
        super(n2, fm2, iu2, ha.a(string));
        this.a = d2;
        this.b = string.endsWith("<<");
    }

    static String a(String string) {
        return string.endsWith("<<") ? string.substring(0, string.length() - 1) : string;
    }

    public boolean equals(Object object) {
        if (super.equals(object)) {
            ha ha2 = (ha)object;
            return this.a == ha2.a;
        }
        return false;
    }

    public int hashCode() {
        assert (false) : "hashCode not designed";
        return 42;
    }

    public void a(double d2, StringBuffer stringBuffer, int n2) {
        double d3 = this.a(d2);
        if (this.b && this.e != null) {
            long l2 = (long)d3;
            int n3 = stringBuffer.length();
            while (true) {
                long l3;
                l2 *= 10L;
                if (!((double)l3 < this.a)) break;
                stringBuffer.insert(n2 + this.d, ' ');
                this.e.a(0L, stringBuffer, n2 + this.d);
            }
            n2 += stringBuffer.length() - n3;
        }
        if (d3 == Math.floor(d3) && this.e != null) {
            this.e.a((long)d3, stringBuffer, n2 + this.d);
        } else if (this.e != null) {
            this.e.a(d3, stringBuffer, n2 + this.d);
        } else {
            stringBuffer.insert(n2 + this.d, this.f.d(d3));
        }
    }

    public long a(long l2) {
        return Math.round((double)l2 * this.a);
    }

    public double a(double d2) {
        return Math.round(d2 * this.a);
    }

    public Number a(String string, ParsePosition parsePosition, double d2, double d3, boolean bl2) {
        Object object;
        int n2 = 0;
        if (this.b) {
            object = string;
            ParsePosition parsePosition2 = new ParsePosition(1);
            while (((String)object).length() > 0 && parsePosition2.getIndex() != 0) {
                parsePosition2.setIndex(0);
                this.e.a((String)object, parsePosition2, 1.0).intValue();
                if (parsePosition2.getIndex() == 0) break;
                ++n2;
                parsePosition.setIndex(parsePosition.getIndex() + parsePosition2.getIndex());
                object = ((String)object).substring(parsePosition2.getIndex());
                while (((String)object).length() > 0 && ((String)object).charAt(0) == ' ') {
                    object = ((String)object).substring(1);
                    parsePosition.setIndex(parsePosition.getIndex() + 1);
                }
            }
            string = string.substring(parsePosition.getIndex());
            parsePosition.setIndex(0);
        }
        object = super.a(string, parsePosition, this.b ? 1.0 : d2, d3, false);
        if (this.b) {
            long l2;
            long l3 = ((Number)object).longValue();
            for (l2 = 1L; l2 <= l3; l2 *= 10L) {
            }
            while (n2 > 0) {
                l2 *= 10L;
                --n2;
            }
            object = new Double((double)l3 / (double)l2);
        }
        return object;
    }

    public double a(double d2, double d3) {
        return d2 / d3;
    }

    public double b(double d2) {
        return this.a;
    }

    char a() {
        return '<';
    }
}

