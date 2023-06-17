/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.java.games.input.WinTabContext;
import net.java.games.input.WinTabPacket;
import net.java.games.input.ar;
import net.java.games.input.dp;
import net.java.games.input.dr;
import net.java.games.input.h;
import net.java.games.input.l;
import net.java.games.input.m;
import net.java.games.input.n;

public class dq
extends h {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    private int j;
    private int k;
    protected float h;
    private boolean l;
    static Class i;

    protected dq(WinTabContext winTabContext, int n2, String string, l l2, int n3, int n4) {
        super(string, l2);
        this.j = n3;
        this.k = n4;
        this.l = true;
    }

    protected dq(WinTabContext winTabContext, int n2, String string, l l2) {
        super(string, l2);
        this.j = 0;
        this.k = 1;
        this.l = false;
    }

    protected float a() {
        return this.h;
    }

    public boolean b() {
        return this.l;
    }

    public boolean c() {
        return false;
    }

    public static List a(WinTabContext winTabContext, int n2, int n3, int[] arrn) {
        ArrayList<dq> arrayList = new ArrayList<dq>();
        switch (n3) {
            case 1: {
                m m2 = m.a;
                arrayList.add(new dq(winTabContext, n2, m2.a(), m2, arrn[0], arrn[1]));
                break;
            }
            case 2: {
                m m3 = m.b;
                arrayList.add(new dq(winTabContext, n2, m3.a(), m3, arrn[0], arrn[1]));
                break;
            }
            case 3: {
                m m4 = m.c;
                arrayList.add(new dq(winTabContext, n2, m4.a(), m4, arrn[0], arrn[1]));
                break;
            }
            case 4: {
                m m5 = m.l;
                arrayList.add(new dq(winTabContext, n2, m5.a(), m5, arrn[0], arrn[1]));
                break;
            }
            case 5: {
                m m6 = m.o;
                arrayList.add(new dq(winTabContext, n2, m6.a(), m6, arrn[0], arrn[1]));
                break;
            }
            case 6: {
                m m7 = m.d;
                arrayList.add(new dq(winTabContext, n2, m7.a(), m7, arrn[0], arrn[1]));
                m7 = m.e;
                arrayList.add(new dq(winTabContext, n2, m7.a(), m7, arrn[2], arrn[3]));
                m7 = m.f;
                arrayList.add(new dq(winTabContext, n2, m7.a(), m7, arrn[4], arrn[5]));
                break;
            }
            case 7: {
                m m8 = m.d;
                arrayList.add(new dq(winTabContext, n2, m8.a(), m8, arrn[0], arrn[1]));
                m8 = m.e;
                arrayList.add(new dq(winTabContext, n2, m8.a(), m8, arrn[2], arrn[3]));
                m8 = m.f;
                arrayList.add(new dq(winTabContext, n2, m8.a(), m8, arrn[4], arrn[5]));
            }
        }
        return arrayList;
    }

    public static Collection a(WinTabContext winTabContext, int n2, int n3) {
        ArrayList<dp> arrayList = new ArrayList<dp>();
        for (int i2 = 0; i2 < n3; ++i2) {
            try {
                Class class_ = i == null ? dq.a("net.java.games.input.n") : i;
                Field field = class_.getField("_" + i2);
                l l2 = (l)field.get(null);
                arrayList.add(new dp(winTabContext, n2, l2.a(), l2, i2));
                continue;
            }
            catch (SecurityException securityException) {
                securityException.printStackTrace();
                continue;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                noSuchFieldException.printStackTrace();
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
        return arrayList;
    }

    public ar a(WinTabPacket winTabPacket) {
        float f2 = this.h;
        if (this.d() == m.a) {
            f2 = this.a(winTabPacket.b);
        }
        if (this.d() == m.b) {
            f2 = this.a(winTabPacket.c);
        }
        if (this.d() == m.c) {
            f2 = this.a(winTabPacket.d);
        }
        if (this.d() == m.l) {
            f2 = this.a(winTabPacket.f);
        }
        if (this.d() == m.o) {
            f2 = this.a(winTabPacket.g);
        }
        if (this.d() == m.d) {
            f2 = this.a(winTabPacket.i);
        }
        if (this.d() == m.e) {
            f2 = this.a(winTabPacket.j);
        }
        if (this.d() == m.f) {
            f2 = this.a(winTabPacket.k);
        }
        if (f2 != this.f()) {
            this.h = f2;
            ar ar2 = new ar();
            ar2.a(this, f2, winTabPacket.a * 1000L);
            return ar2;
        }
        return null;
    }

    private float a(float f2) {
        if (this.k == this.j) {
            return f2;
        }
        float f3 = this.k - this.j;
        return (f2 - (float)this.j) / f3;
    }

    public static Collection a(WinTabContext winTabContext, int n2, String[] arrstring) {
        ArrayList<dr> arrayList = new ArrayList<dr>();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            n n3 = arrstring[i2].matches("Puck") ? n.am : (arrstring[i2].matches("Eraser.*") ? n.ai : n.ah);
            arrayList.add(new dr(winTabContext, n2, n3.a(), n3, i2));
        }
        return arrayList;
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

