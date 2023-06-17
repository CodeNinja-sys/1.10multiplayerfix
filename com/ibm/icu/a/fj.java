/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.util.dj;
import java.util.Date;
import java.util.TimeZone;

public class fj
extends TimeZone {
    static final long a = -2040072218820018557L;
    private dj b;

    public static TimeZone a(dj dj2) {
        return new fj(dj2);
    }

    public dj a() {
        return this.b;
    }

    public fj(dj dj2) {
        this.b = dj2;
        super.setID(dj2.l());
    }

    public void setID(String string) {
        super.setID(string);
        this.b.a_(string);
    }

    public boolean hasSameRules(TimeZone timeZone) {
        return timeZone instanceof fj && this.b.a(((fj)timeZone).b);
    }

    public int getOffset(int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.b.a(n2, n3, n4, n5, n6, n7);
    }

    public int getRawOffset() {
        return this.b.a();
    }

    public void setRawOffset(int n2) {
        this.b.a(n2);
    }

    public boolean useDaylightTime() {
        return this.b.b();
    }

    public boolean inDaylightTime(Date date) {
        return this.b.a(date);
    }

    public Object clone() {
        return new fj((dj)this.b.clone());
    }

    public synchronized int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof fj) {
            object = ((fj)object).b;
        }
        return this.b.equals(object);
    }

    public String toString() {
        return "TimeZoneAdapter: " + this.b.toString();
    }
}

