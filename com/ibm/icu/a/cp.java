/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.af;
import com.ibm.icu.util.dj;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.TreeSet;

public class cp
extends dj {
    private static final long a = 6977448185543929364L;
    private static final TreeSet b = new TreeSet();
    private TimeZone c;
    private transient Calendar d;
    private static Method e;
    private transient boolean f = false;

    public cp() {
        this(TimeZone.getDefault(), null);
    }

    public cp(TimeZone timeZone, String string) {
        if (string == null) {
            string = timeZone.getID();
        }
        this.c = timeZone;
        this.a_(string);
        this.d = new GregorianCalendar(this.c);
    }

    public static cp a(String string) {
        TimeZone timeZone = null;
        if (b.contains(string)) {
            timeZone = TimeZone.getTimeZone(string);
        }
        if (timeZone == null) {
            boolean[] arrbl = new boolean[1];
            String string2 = dj.a(string, arrbl);
            if (arrbl[0] && b.contains(string2)) {
                timeZone = TimeZone.getTimeZone(string2);
            }
        }
        if (timeZone == null) {
            return null;
        }
        return new cp(timeZone, string);
    }

    public int a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.c.getOffset(n2, n3, n4, n5, n6, n7);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l2, boolean bl2, int[] arrn) {
        Calendar calendar = this.d;
        synchronized (calendar) {
            if (bl2) {
                int[] arrn2 = new int[6];
                af.b(l2, arrn2);
                int n2 = arrn2[5];
                int n3 = n2 % 1000;
                int n4 = (n2 /= 1000) % 60;
                int n5 = (n2 /= 60) % 60;
                int n6 = n2 / 60;
                this.d.clear();
                this.d.set(arrn2[0], arrn2[1], arrn2[2], n6, n5, n4);
                this.d.set(14, n3);
                int n7 = this.d.get(6);
                int n8 = this.d.get(11);
                int n9 = this.d.get(12);
                int n10 = this.d.get(13);
                int n11 = this.d.get(14);
                if (arrn2[4] != n7 || n6 != n8 || n5 != n9 || n4 != n10 || n3 != n11) {
                    int n12 = Math.abs(n7 - arrn2[4]) > 1 ? 1 : n7 - arrn2[4];
                    int n13 = (((n12 * 24 + n8 - n6) * 60 + n9 - n5) * 60 + n10 - n4) * 1000 + n11 - n3;
                    this.d.setTimeInMillis(this.d.getTimeInMillis() - (long)n13 - 1L);
                }
            } else {
                this.d.setTimeInMillis(l2);
            }
            arrn[0] = this.d.get(15);
            arrn[1] = this.d.get(16);
        }
    }

    public int a() {
        return this.c.getRawOffset();
    }

    public boolean a(Date date) {
        return this.c.inDaylightTime(date);
    }

    public void a(int n2) {
        if (this.f()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen JavaTimeZone instance.");
        }
        this.c.setRawOffset(n2);
    }

    public boolean b() {
        return this.c.useDaylightTime();
    }

    public boolean c() {
        if (e != null) {
            try {
                return (Boolean)e.invoke(this.c, null);
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                // empty catch block
            }
        }
        return super.c();
    }

    public int d() {
        return this.c.getDSTSavings();
    }

    public TimeZone e() {
        return this.c;
    }

    public Object clone() {
        if (this.f()) {
            return this;
        }
        return this.h();
    }

    public int hashCode() {
        return super.hashCode() + this.c.hashCode();
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.d = new GregorianCalendar(this.c);
    }

    public boolean f() {
        return this.f;
    }

    public dj g() {
        this.f = true;
        return this;
    }

    public dj h() {
        cp cp2 = (cp)super.h();
        cp2.c = (TimeZone)this.c.clone();
        cp2.d = (GregorianCalendar)this.d.clone();
        cp2.f = false;
        return cp2;
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }

    static {
        String[] arrstring = TimeZone.getAvailableIDs();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            b.add(arrstring[i2]);
        }
        try {
            e = TimeZone.class.getMethod("observesDaylightTime", null);
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
    }
}

