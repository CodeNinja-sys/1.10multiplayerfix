/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

class y {
    private static final List a;
    private static final Set b;

    y() {
    }

    static /* synthetic */ List a() {
        return a;
    }

    static /* synthetic */ Set b() {
        return b;
    }

    static {
        ArrayList<Locale> arrayList = new ArrayList<Locale>(Arrays.asList(Locale.getAvailableLocales()));
        a = Collections.unmodifiableList(arrayList);
        b = Collections.unmodifiableSet(new HashSet<Locale>(arrayList));
    }
}

