/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.b.a;
import com.a.b.b.v;
import com.a.b.w;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class ac
extends w {
    private static final Class[] a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object b;

    public ac(Boolean bl2) {
        this.a(bl2);
    }

    public ac(Number number) {
        this.a(number);
    }

    public ac(String string) {
        this.a(string);
    }

    public ac(Character c2) {
        this.a(c2);
    }

    ac(Object object) {
        this.a(object);
    }

    ac a() {
        return this;
    }

    void a(Object object) {
        if (object instanceof Character) {
            char c2 = ((Character)object).charValue();
            this.b = String.valueOf(c2);
        } else {
            com.a.b.b.a.a(object instanceof Number || ac.b(object));
            this.b = object;
        }
    }

    public boolean b() {
        return this.b instanceof Boolean;
    }

    Boolean x() {
        return (Boolean)this.b;
    }

    public boolean n() {
        if (this.b()) {
            return this.x();
        }
        return Boolean.parseBoolean(this.d());
    }

    public boolean y() {
        return this.b instanceof Number;
    }

    public Number c() {
        return this.b instanceof String ? new v((String)this.b) : (Number)this.b;
    }

    public boolean z() {
        return this.b instanceof String;
    }

    public String d() {
        if (this.y()) {
            return this.c().toString();
        }
        if (this.b()) {
            return this.x().toString();
        }
        return (String)this.b;
    }

    public double e() {
        return this.y() ? this.c().doubleValue() : Double.parseDouble(this.d());
    }

    public BigDecimal f() {
        return this.b instanceof BigDecimal ? (BigDecimal)this.b : new BigDecimal(this.b.toString());
    }

    public BigInteger g() {
        return this.b instanceof BigInteger ? (BigInteger)this.b : new BigInteger(this.b.toString());
    }

    public float h() {
        return this.y() ? this.c().floatValue() : Float.parseFloat(this.d());
    }

    public long i() {
        return this.y() ? this.c().longValue() : Long.parseLong(this.d());
    }

    public short m() {
        return this.y() ? this.c().shortValue() : Short.parseShort(this.d());
    }

    public int j() {
        return this.y() ? this.c().intValue() : Integer.parseInt(this.d());
    }

    public byte k() {
        return this.y() ? this.c().byteValue() : Byte.parseByte(this.d());
    }

    public char l() {
        return this.d().charAt(0);
    }

    private static boolean b(Object object) {
        if (object instanceof String) {
            return true;
        }
        Class<?> class_ = object.getClass();
        for (Class class_2 : a) {
            if (!class_2.isAssignableFrom(class_)) continue;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.b == null) {
            return 31;
        }
        if (ac.a(this)) {
            long l2 = this.c().longValue();
            return (int)(l2 ^ l2 >>> 32);
        }
        if (this.b instanceof Number) {
            long l3 = Double.doubleToLongBits(this.c().doubleValue());
            return (int)(l3 ^ l3 >>> 32);
        }
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ac ac2 = (ac)object;
        if (this.b == null) {
            return ac2.b == null;
        }
        if (ac.a(this) && ac.a(ac2)) {
            return this.c().longValue() == ac2.c().longValue();
        }
        if (this.b instanceof Number && ac2.b instanceof Number) {
            double d2;
            double d3 = this.c().doubleValue();
            return d3 == (d2 = ac2.c().doubleValue()) || Double.isNaN(d3) && Double.isNaN(d2);
        }
        return this.b.equals(ac2.b);
    }

    private static boolean a(ac ac2) {
        if (ac2.b instanceof Number) {
            Number number = (Number)ac2.b;
            return number instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short || number instanceof Byte;
        }
        return false;
    }

    /* synthetic */ w o() {
        return this.a();
    }
}

