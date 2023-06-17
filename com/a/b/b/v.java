/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import java.math.BigDecimal;

public final class v
extends Number {
    private final String a;

    public v(String string) {
        this.a = string;
    }

    public int intValue() {
        try {
            return Integer.parseInt(this.a);
        }
        catch (NumberFormatException numberFormatException) {
            try {
                return (int)Long.parseLong(this.a);
            }
            catch (NumberFormatException numberFormatException2) {
                return new BigDecimal(this.a).intValue();
            }
        }
    }

    public long longValue() {
        try {
            return Long.parseLong(this.a);
        }
        catch (NumberFormatException numberFormatException) {
            return new BigDecimal(this.a).longValue();
        }
    }

    public float floatValue() {
        return Float.parseFloat(this.a);
    }

    public double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public String toString() {
        return this.a;
    }

    private Object a() {
        return new BigDecimal(this.a);
    }
}

