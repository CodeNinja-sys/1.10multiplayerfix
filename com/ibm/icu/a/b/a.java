/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.i;
import com.ibm.icu.a.b.k;
import com.ibm.icu.a.b.p;
import com.ibm.icu.a.b.t;
import com.ibm.icu.a.b.v;
import com.ibm.icu.a.b.x;
import com.ibm.icu.d.dx;
import com.ibm.icu.util.dn;
import java.text.FieldPosition;
import java.util.Date;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.Duration;

public class a
extends dx {
    private static final long d = -3146984141909457700L;
    transient k a;
    transient t b;
    transient v c = i.a();
    private static boolean e = true;

    public static a a(dn dn2) {
        return new a(dn2);
    }

    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (object instanceof Long) {
            String string = this.a((Long)object);
            return stringBuffer.append(string);
        }
        if (object instanceof Date) {
            String string = this.a((Date)object);
            return stringBuffer.append(string);
        }
        if (e) {
            try {
                if (object instanceof Duration) {
                    String string = this.a(object);
                    return stringBuffer.append(string);
                }
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                System.err.println("Skipping XML capability");
                e = false;
            }
        }
        throw new IllegalArgumentException("Cannot format given Object as a Duration");
    }

    public a() {
        this.a = this.c.b().a();
        this.b = this.c.c().b(false).g();
    }

    public a(dn dn2) {
        super(dn2);
        this.a = this.c.b().a(dn2.l()).a();
        this.b = this.c.c().b(false).a(dn2.l()).g();
    }

    public String a(long l2, long l3) {
        return this.a.a(l2, l3);
    }

    public String a(long l2) {
        return this.a.a(l2);
    }

    public String a(Date date) {
        return this.a.a(date);
    }

    public String a(Object object) {
        DatatypeConstants.Field[] arrfield = new DatatypeConstants.Field[]{DatatypeConstants.YEARS, DatatypeConstants.MONTHS, DatatypeConstants.DAYS, DatatypeConstants.HOURS, DatatypeConstants.MINUTES, DatatypeConstants.SECONDS};
        x[] arrx = new x[]{x.c, x.d, x.f, x.g, x.h, x.i};
        Duration duration = (Duration)object;
        p p2 = null;
        Duration duration2 = duration;
        boolean bl2 = false;
        if (duration.getSign() < 0) {
            duration2 = duration.negate();
            bl2 = true;
        }
        boolean bl3 = false;
        for (int i2 = 0; i2 < arrfield.length; ++i2) {
            double d2;
            double d3;
            double d4;
            Number number;
            if (!duration2.isSet(arrfield[i2]) || (number = duration2.getField(arrfield[i2])).intValue() == 0 && !bl3) continue;
            bl3 = true;
            float f2 = number.floatValue();
            x x2 = null;
            float f3 = 0.0f;
            if (arrx[i2] == x.i && (d4 = ((d3 = (double)f2) - (d2 = Math.floor(f2))) * 1000.0) > 0.0) {
                x2 = x.j;
                f3 = (float)d4;
                f2 = (float)d2;
            }
            p2 = p2 == null ? p.a(f2, arrx[i2]) : p2.d(f2, arrx[i2]);
            if (x2 == null) continue;
            p2 = p2.d(f3, x2);
        }
        if (p2 == null) {
            return this.a(0L);
        }
        p2 = bl2 ? p2.e() : p2.d();
        return this.b.a(p2);
    }
}

