/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.au;
import com.sun.jna.m;

public abstract class u
extends Number
implements au {
    private int a;
    private Number b;
    private boolean c;
    private long d;

    public u(int n2) {
        this(n2, 0L, false);
    }

    public u(int n2, boolean bl2) {
        this(n2, 0L, bl2);
    }

    public u(int n2, long l2) {
        this(n2, l2, false);
    }

    public u(int n2, long l2, boolean bl2) {
        this.a = n2;
        this.c = bl2;
        this.a(l2);
    }

    public void a(long l2) {
        long l3 = l2;
        this.d = l2;
        switch (this.a) {
            case 1: {
                if (this.c) {
                    this.d = l2 & 0xFFL;
                }
                l3 = (byte)l2;
                this.b = new Byte((byte)l2);
                break;
            }
            case 2: {
                if (this.c) {
                    this.d = l2 & 0xFFFFL;
                }
                l3 = (short)l2;
                this.b = new Short((short)l2);
                break;
            }
            case 4: {
                if (this.c) {
                    this.d = l2 & 0xFFFFFFFFL;
                }
                l3 = (int)l2;
                this.b = new Integer((int)l2);
                break;
            }
            case 8: {
                this.b = new Long(l2);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported size: " + this.a);
            }
        }
        if (this.a < 8) {
            long l4 = (1L << this.a * 8) - 1L ^ 0xFFFFFFFFFFFFFFFFL;
            if (l2 < 0L && l3 != l2 || l2 >= 0L && (l4 & l2) != 0L) {
                throw new IllegalArgumentException("Argument value 0x" + Long.toHexString(l2) + " exceeds native capacity (" + this.a + " bytes) mask=0x" + Long.toHexString(l4));
            }
        }
    }

    public Object a() {
        return this.b;
    }

    public Object a(Object object, m m2) {
        long l2 = object == null ? 0L : ((Number)object).longValue();
        try {
            u u2 = (u)this.getClass().newInstance();
            u2.a(l2);
            return u2;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalArgumentException("Can't instantiate " + this.getClass());
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException("Not allowed to instantiate " + this.getClass());
        }
    }

    public Class b() {
        return this.b.getClass();
    }

    public int intValue() {
        return (int)this.d;
    }

    public long longValue() {
        return this.d;
    }

    public float floatValue() {
        return this.b.floatValue();
    }

    public double doubleValue() {
        return this.b.doubleValue();
    }

    public boolean equals(Object object) {
        return object instanceof u && this.b.equals(((u)object).b);
    }

    public String toString() {
        return this.b.toString();
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}

