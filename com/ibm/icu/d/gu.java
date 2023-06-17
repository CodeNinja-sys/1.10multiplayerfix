/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.gs;
import com.ibm.icu.util.dn;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

public abstract class gu
extends gs {
    final Set f;
    final boolean g;

    public gu(Locale locale) {
        this(locale, true);
    }

    public gu(Locale locale, boolean bl2) {
        this.f = Collections.singleton(dn.a(locale).k());
        this.g = bl2;
    }

    public gu(dn dn2) {
        this(dn2, true);
    }

    public gu(dn dn2, boolean bl2) {
        this.f = Collections.singleton(dn2.k());
        this.g = bl2;
    }

    public final boolean a() {
        return this.g;
    }

    public final Set b() {
        return this.f;
    }
}

