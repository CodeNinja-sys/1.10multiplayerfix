/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.aa;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class a
implements ae,
v {
    private final DateFormat a;
    private final DateFormat b;
    private final DateFormat c;

    a() {
        this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
    }

    a(String string) {
        this(new SimpleDateFormat(string, Locale.US), new SimpleDateFormat(string));
    }

    a(int n2) {
        this(DateFormat.getDateInstance(n2, Locale.US), DateFormat.getDateInstance(n2));
    }

    public a(int n2, int n3) {
        this(DateFormat.getDateTimeInstance(n2, n3, Locale.US), DateFormat.getDateTimeInstance(n2, n3));
    }

    a(DateFormat dateFormat, DateFormat dateFormat2) {
        this.a = dateFormat;
        this.b = dateFormat2;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public w a(Date date, Type type, ad ad2) {
        DateFormat dateFormat = this.b;
        synchronized (dateFormat) {
            String string = this.a.format(date);
            return new ac(string);
        }
    }

    public Date a(w w2, Type type, u u2) {
        if (!(w2 instanceof ac)) {
            throw new aa("The date should be a string value");
        }
        Date date = this.a(w2);
        if (type == Date.class) {
            return date;
        }
        if (type == Timestamp.class) {
            return new Timestamp(date.getTime());
        }
        if (type == java.sql.Date.class) {
            return new java.sql.Date(date.getTime());
        }
        throw new IllegalArgumentException(this.getClass() + " cannot deserialize to " + type);
    }

    private Date a(w w2) {
        DateFormat dateFormat = this.b;
        synchronized (dateFormat) {
            try {
                return this.b.parse(w2.d());
            }
            catch (ParseException parseException) {
                try {
                    return this.a.parse(w2.d());
                }
                catch (ParseException parseException2) {
                    try {
                        return this.c.parse(w2.d());
                    }
                    catch (ParseException parseException3) {
                        throw new ag(w2.d(), parseException3);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.class.getSimpleName());
        stringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
        return stringBuilder.toString();
    }

    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

