/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import org.apache.commons.a.c.a.ac;
import org.apache.commons.a.c.a.p;

final class s
extends p {
    private final int e;
    private final String f;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    s(String string, String string2, String string3, ac ac2, int n2, String string4) {
        this.c = n2;
        this.d = string4;
        super(string, string2, string3, ac2);
        this.e = this.c;
        this.f = this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rule");
        stringBuilder.append("{line=").append(this.e);
        stringBuilder.append(", loc='").append(this.f).append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

