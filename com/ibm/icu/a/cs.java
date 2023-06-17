/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

class cs {
    private final String a;

    cs(String string) {
        this.a = string;
    }

    StringBuilder a(String string, StringBuilder stringBuilder) {
        if (stringBuilder.length() > 0) {
            stringBuilder.append(this.a);
        }
        stringBuilder.append(string);
        return stringBuilder;
    }
}

