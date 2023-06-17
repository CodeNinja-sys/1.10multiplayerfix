/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.aa;
import com.ibm.icu.a.ab;
import com.ibm.icu.a.y;
import com.ibm.icu.util.dn;
import java.util.Collections;
import java.util.Map;

public class ac
extends y {
    private final boolean a;
    private static final y b = new ac(true);
    private static final y c = new ac(false);

    private ac(boolean bl2) {
        this.a = bl2;
    }

    public static final y a(boolean bl2) {
        return bl2 ? b : c;
    }

    public String b(String string) {
        return this.a ? string : null;
    }

    public String a(String string, String string2) {
        return this.a ? string : null;
    }

    public String c(String string) {
        return this.a ? string : null;
    }

    public Map c() {
        return Collections.emptyMap();
    }

    public Map d() {
        return Collections.emptyMap();
    }

    public dn e() {
        return dn.v;
    }

    public Map a() {
        if (this.a) {
            return Collections.emptyMap();
        }
        return null;
    }

    public aa a(String string) {
        return null;
    }

    public ab b() {
        return this.a ? ab.g : null;
    }
}

